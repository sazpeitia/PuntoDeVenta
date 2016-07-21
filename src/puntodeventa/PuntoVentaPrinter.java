/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author SERVIDOR-PC
 */
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.Doc;
import javax.print.PrintException;
import javax.print.ServiceUI;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.DocumentName;
import javax.print.attribute.standard.JobName;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
import org.apache.commons.io.FileUtils;

public class PuntoVentaPrinter {

    private String selectedService;

//Ticket attribute content
    private String contentTicket = "::Papelería COPYMAS::\n"
            + "Boulevard Everardo Marquez 236 Letra B, Colonia Lomas Residencial, Pachuca de Soto, Hidalgo. CP 42094\n"
            + "FECHA: {{dateTime}}\n"
            //  + //"EXPEDIDO EN: {{expedition}}\n"+
            // "Emiliano Zapata Col. Centro \n"
            + "=============================\n"
            + // "Periban. Mich. {{dateTime}}\n"+
            //"RFC: XAXX010101000\n"+
            //"Caja # {{box}} \n"+
            //  "Ticket # {{ticket}}\n"
            //  + "LE ATENDIO: {{cajero}}\n"
            //  + //"{{dateTime}}\n"+
            "=============================\n"
            + "{{items}}\n"
            + "=============================\n"
            + "TOTAL: {{total}}\n"
            + "PAGO: {{pago}}\n"
            + "CAMBIO: {{cambio}}\n\n"
            + //"RECIBIDO: {{recibo}}\n"+
            //"CAMBIO: {{change}}\n\n"+
            "=============================\n"
            + "¡GRACIAS POR SU COMPRA!\n"
            + "ESPERAMOS SU VISITA NUEVAMENTE.\n"
            + "\t::COPYMAS::\n"
            + "\n"
            + "\n\n\n ";

//El constructor que setea los valores a la instancia
    public void setValuesTicket(String dateTime, String items, String total, String pago, String cambio) {
        //    this.contentTicket = this.contentTicket.replace("{{nameLocal}}", nameLocal);
        //   this.contentTicket = this.contentTicket.replace("{{expedition}}", expedition);
        //    this.contentTicket = this.contentTicket.replace("{{box}}", box);
        //   this.contentTicket = this.contentTicket.replace("{{ticket}}", ticket);
        //  this.contentTicket = this.contentTicket.replace("{{cajero}}", caissier);
        this.contentTicket = this.contentTicket.replace("{{dateTime}}", dateTime);
        this.contentTicket = this.contentTicket.replace("{{items}}", items);
        this.contentTicket = this.contentTicket.replace("{{total}}", total);
        this.contentTicket = this.contentTicket.replace("{{pago}}", pago);
        this.contentTicket = this.contentTicket.replace("{{cambio}}", cambio);
    }

    public PuntoVentaPrinter() {
    }

    public void printReportHtml(String text) throws Exception {

        String defaultPrinter
                = PrintServiceLookup.lookupDefaultPrintService().getName();
        System.out.println("Default printer: " + defaultPrinter);
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        PrintService service = null;

        for (PrintService impresora : services) {

            if (impresora.getName().equals("Microsoft Print to PDF")) {
                service = impresora;
                System.out.println("Entro aqui");
            }

            System.out.println(impresora.getName());
        }

        // prints the famous hello world! plus a form feed
        InputStream is = new ByteArrayInputStream("hello world!\f".getBytes("UTF8"));

        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        pras.add(new Copies(1));

        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc doc = new SimpleDoc(is, flavor, null);
        DocPrintJob job = service.createPrintJob();

        PrintJobWatcher pjw = new PrintJobWatcher(job);
        job.print(doc, pras);
        pjw.waitForDone();
        is.close();
    }

    public void printHtmlToFile(String htmlString, String file) {


        File newHtmlFile = new File(file);
        try {
            FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF8");
        } catch (IOException ex) {
            Logger.getLogger(PuntoVentaPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        PuntoVentaPrinter printer = new PuntoVentaPrinter();
        
        printer.printHtmlToFile("<html><body><h1>Hola a todos</h1></body></html>", "Reporte.html");
    }

    public void printTicket() throws IOException {

        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null); //nos da el array de los servicios de impresion

//Creamos un arreglo de tipo byte
//y le agregamos el string convertido (cuerpo del ticket) a bytes tal como
//lo maneja la impresora(mas bien ticketera :p)
        byte[] bytes = this.contentTicket.getBytes();

//Especificamos el tipo de dato a imprimir
//Tipo: bytes; Subtipo: autodetectado
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;

        Doc doc = new SimpleDoc(bytes, flavor, null);
//Creamos un trabajo de impresión
        DocPrintJob job = null;
        if (services.length > 0) {
            for (PrintService service : services) {
                System.out.println(service.getName());
                if (service.getName().equals(getSelectedService())) {
                    //aqui escribimos/elegimos la impresora por la que queremos imprimir
                    job = service.createPrintJob(); // System.out.println(i+": "+services[i].getName());
                }
            }
        }

//Imprimimos dentro de un try obligatoriamente
        try {

            job.print(doc, null);
        } catch (PrintException ex) {
            System.out.println(ex);
        }
    }

    public List<String> getServices() {

        List<String> servicesStringList = new ArrayList<>();

        PrintService[] servicesArray = PrintServiceLookup.lookupPrintServices(null, null);

        for (PrintService service : servicesArray) {

            servicesStringList.add(service.getName());
        }

        return servicesStringList;
    }

    /**
     * @return the selectedService
     */
    public String getSelectedService() {
        return selectedService;
    }

    /**
     * @param selectedService the selectedService to set
     */
    public void setSelectedService(String selectedService) {
        this.selectedService = selectedService;
    }

}

class PrintJobWatcher {

    boolean done = false;

    PrintJobWatcher(DocPrintJob job) {
        job.addPrintJobListener(new PrintJobAdapter() {
            public void printJobCanceled(PrintJobEvent pje) {
                allDone();
            }

            public void printJobCompleted(PrintJobEvent pje) {
                allDone();
            }

            public void printJobFailed(PrintJobEvent pje) {
                allDone();
            }

            public void printJobNoMoreEvents(PrintJobEvent pje) {
                allDone();
            }

            void allDone() {
                synchronized (PrintJobWatcher.this) {
                    done = true;
                    System.out.println("Printing done ...");
                    PrintJobWatcher.this.notify();
                }
            }
        });
    }

    public synchronized void waitForDone() {
        try {
            while (!done) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }
}

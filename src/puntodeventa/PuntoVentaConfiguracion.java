package puntodeventa;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVIDOR-PC
 */
public class PuntoVentaConfiguracion {
    
    
    private String impresoraTickets;
    private String impresoraReportes;
    private PuntoVentaTmpFile archivoConfiguracion;

    public PuntoVentaConfiguracion() {
        
        archivoConfiguracion = new PuntoVentaTmpFile("config.txt");
        impresoraReportes = "";
        impresoraTickets = "";
    }

    
    
    public void cargarConfiguracion(){
        
        archivoConfiguracion.crearAbrirArchivo();
        List<String> lineas  = archivoConfiguracion.leerLineas();
        
        boolean containsTicket, containsReport;
        
        if (lineas.size() > 0) {
            
            for ( String linea : lineas ) {
                
                containsTicket = linea.contains("dafualtTicketPrinter=");
                
                if (containsTicket) {
                    
                    impresoraTickets = linea.replace("dafualtTicketPrinter=", "");
                }
                
                
                containsReport = linea.contains("dafualtReportPrinter=");
                
                if (containsReport) {
                    
                    impresoraReportes = linea.replace("dafualtReportPrinter=", "");
                }
            }
        } else {
            
            archivoConfiguracion.escribirLiena( "dafualtTicketPrinter=" );
            archivoConfiguracion.escribirLiena( "dafualtReportPrinter=" );
        }
        
        archivoConfiguracion.cerrarArchivo();
    }
    
    public static void main(String[] args) {
        
        PuntoVentaConfiguracion config = new PuntoVentaConfiguracion();
        config.cargarConfiguracion();
        
        System.out.println(config.getImpresoraReportes());
        System.out.println(config.getImpresoraTickets());
    }
    
    /**
     * @return the impresoraTickets
     */
    public String getImpresoraTickets() {
        return impresoraTickets;
    }

    /**
     * @param impresoraTickets the impresoraTickets to set
     */
    public void setImpresoraTickets(String impresoraTickets) {
        
        String textToReplace = "dafualtTicketPrinter=" + this.impresoraTickets;
        String replaceWith = "dafualtTicketPrinter=" + impresoraTickets;
        
        archivoConfiguracion.replaceSelected(textToReplace, replaceWith);
        
        this.impresoraTickets = impresoraTickets;
    }

    /**
     * @return the impresoraReportes
     */
    public String getImpresoraReportes() {
        return impresoraReportes;
    }

    /**
     * @param impresoraReportes the impresoraReportes to set
     */
    public void setImpresoraReportes(String impresoraReportes) {
        
        String textToReplace = "dafualtReportPrinter=" + this.impresoraReportes;
        String replaceWith = "dafualtReportPrinter=" + impresoraReportes;
        
        archivoConfiguracion.replaceSelected(textToReplace, replaceWith);
        
        this.impresoraReportes = impresoraReportes;
    }


}

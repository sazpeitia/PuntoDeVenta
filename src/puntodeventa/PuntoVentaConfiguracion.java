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
                    
                    setImpresoraTickets(linea.replace("dafualtTicketPrinter=", ""));
                }
                
                
                containsReport = linea.contains("dafualtReportPrinter=");
                
                if (containsReport) {
                    
                    setImpresoraReportes(linea.replace("dafualtReportPrinter=", ""));
                }
            }
        } else {
            
            archivoConfiguracion.escribirLiena( "dafualtTicketPrinterXX0=" );
            archivoConfiguracion.escribirLiena( "dafualtReportPrinter=" );
        }
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
        this.impresoraReportes = impresoraReportes;
    }
}

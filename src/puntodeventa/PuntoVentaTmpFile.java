/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVIDOR-PC
 */
public class PuntoVentaTmpFile {

    private PrintWriter writer;
    private File archivo;

    public PuntoVentaTmpFile(String pathFile) {
        try {
            archivo = new File(pathFile);
        } catch (Exception exception) {

            System.out.println("Ocurrió un error al crear el archivo. El error es: " + exception.getMessage());
        }
    }

    public boolean validarSiExisteArchivo() {

        if (archivo != null) {

            return archivo.exists() && !archivo.isDirectory();
        } else {
            return false;
        }
    }

    public void crearAbrirArchivo() {

        if (validarSiExisteArchivo()) {

            try {
                writer = new PrintWriter(new FileOutputStream(archivo, true));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PuntoVentaTmpFile.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                writer = new PrintWriter(archivo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PuntoVentaTmpFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cerrarArchivo() {

        writer.close();
    }

    public void escribirLiena( String linea) {

        writer.println(linea);
    }

    public List<String> leerLineas() {

        FileInputStream fileInputStream = null;
        List<String> listaLienas = new ArrayList<String>();
        BufferedReader bufferedReader = null;

        try {

            fileInputStream = new FileInputStream(archivo);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                listaLienas.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PuntoVentaTmpFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PuntoVentaTmpFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(PuntoVentaTmpFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return listaLienas;
    }

    public static void main(String[] args) {

        PuntoVentaTmpFile archivoTmp = new PuntoVentaTmpFile("aqui.txt");
        archivoTmp.crearAbrirArchivo();
        archivoTmp.escribirLiena("Hola a todos 2");
        archivoTmp.cerrarArchivo( );
        
        archivoTmp.crearAbrirArchivo();
        
        for (String linea : archivoTmp.leerLineas())
            System.out.println(linea);
        
         archivoTmp.cerrarArchivo( );
    }

    /**
     * @return the writer
     */
    public PrintWriter getWriter() {
        return writer;
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }
}

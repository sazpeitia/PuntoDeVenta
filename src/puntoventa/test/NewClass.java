/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.test;

/**
 *
 * @author asus
 */
public class NewClass {
    public static void main(String[] args) {
        
        String producto = "Cepilllo dental";
        Double cantidad = 1.0;
        Double total = 20.0;
        
        
        String ventaString = String.format("%s\n%20.2f %10.2f", producto, cantidad, total);
        System.out.println(ventaString);
        
    }
}

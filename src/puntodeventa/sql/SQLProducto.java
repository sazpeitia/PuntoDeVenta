/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 *
 * @author SERVIDOR-PC
 */
public class SQLProducto {
    

    
    public static void main(String[] args) {
        
        PuntoventaProducto puntoventaProducto;
        puntoventaProducto = new PuntoventaProducto();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
        EntityManager em = emf.createEntityManager();
        
        //em.getTransaction().begin();
        
        TypedQuery<PuntoventaCategoria> typedQuery = em.createNamedQuery( "PuntoventaCategoria.findByNombreCategoria", PuntoventaCategoria.class);
        typedQuery.setParameter( "nombreCategoria", "SACAPUNTAS" );
        PuntoventaCategoria categoria = typedQuery.getSingleResult();
        
        System.out.println(categoria);
        
        em.close();
        emf.close();
    }
}

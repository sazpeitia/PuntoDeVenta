
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import puntodeventa.sql.PuntoventaCarrito;
import puntodeventa.sql.PuntoventaCarrito_;
import puntodeventa.sql.PuntoventaProducto;
import puntodeventa.sql.PuntoventaVenta;
import puntodeventa.sql.PuntoventaVenta_;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TestPuntoVenta {
    
    
    private static  EntityManagerFactory emf;
    private static EntityManager em;
    
    public static void main(String[] args) {
        
         try {
            emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
            em = emf.createEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            
            CriteriaQuery<PuntoventaCarrito> cq = cb.createQuery(PuntoventaCarrito.class);
            Root<PuntoventaCarrito> compra = cq.from(PuntoventaCarrito.class);
            Join<PuntoventaCarrito,PuntoventaProducto> producto = compra.join(PuntoventaCarrito_.idProducto);
            Join<PuntoventaCarrito,PuntoventaVenta> venta = compra.join(PuntoventaCarrito_.idVenta);
            
            
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaInicio = formatoDelTexto.parse("28-01-2017");
            Date fechaFin = formatoDelTexto.parse("28-01-2017");

            cq.where(cb.between(venta.get(PuntoventaVenta_.fechaVenta),fechaInicio, fechaFin));
            cq.select(compra);

            TypedQuery<PuntoventaCarrito> q = em.createQuery(cq);
            List<PuntoventaCarrito> lista = q.getResultList();
            
            for ( PuntoventaCarrito p : lista )
                 System.out.printf("%s\t%s\n", p.getIdVenta().getFechaVenta(), p.getIdProducto().getNombreProducto());
        }
        
        catch ( Exception e ) {
            
            System.out.println("No es posible establecer conexión con el servidor. El mensaje de error es: \n\n" + e.getMessage());
           
        }
    }
}

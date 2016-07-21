/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SERVIDOR-PC
 */
@Entity
@Table(name = "PUNTOVENTA_CARRITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaCarrito.findAll", query = "SELECT p FROM PuntoventaCarrito p"),
    @NamedQuery(name = "PuntoventaCarrito.findByIdCarrito", query = "SELECT p FROM PuntoventaCarrito p WHERE p.idCarrito = :idCarrito"),
    @NamedQuery(name = "PuntoventaCarrito.findByCantidadProducto", query = "SELECT p FROM PuntoventaCarrito p WHERE p.cantidadProducto = :cantidadProducto")})
public class PuntoventaCarrito implements Serializable {

    @Basic(optional = false)
    @Column(name = "TOTAL")
    private double total;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CARRITO")
    private Integer idCarrito;
    @Basic(optional = false)
    @Column(name = "CANTIDAD_PRODUCTO")
    private int cantidadProducto;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
    @ManyToOne(optional = false)
    private PuntoventaProducto idProducto;
    @JoinColumn(name = "ID_VENTA", referencedColumnName = "ID_VENTA")
    @ManyToOne(optional = false)
    private PuntoventaVenta idVenta;

    public PuntoventaCarrito() {
    }

    public PuntoventaCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public PuntoventaCarrito(Integer idCarrito, int cantidadProducto) {
        this.idCarrito = idCarrito;
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public PuntoventaProducto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(PuntoventaProducto idProducto) {
        this.idProducto = idProducto;
    }

    public PuntoventaVenta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(PuntoventaVenta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrito != null ? idCarrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaCarrito)) {
            return false;
        }
        PuntoventaCarrito other = (PuntoventaCarrito) object;
        if ((this.idCarrito == null && other.idCarrito != null) || (this.idCarrito != null && !this.idCarrito.equals(other.idCarrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puntodeventa.sql.PuntoventaCarrito[ idCarrito=" + idCarrito + " ]";
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SERVIDOR-PC
 */
@Entity
@Table(name = "PUNTOVENTA_PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaProducto.findAll", query = "SELECT p FROM PuntoventaProducto p"),
    @NamedQuery(name = "PuntoventaProducto.findByIdProducto", query = "SELECT p FROM PuntoventaProducto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "PuntoventaProducto.findByIdCodigoBarra", query = "SELECT p FROM PuntoventaProducto p WHERE p.idCodigoBarra = :idCodigoBarra"),
    @NamedQuery(name = "PuntoventaProducto.findByNombreProducto", query = "SELECT p FROM PuntoventaProducto p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "PuntoventaProducto.findLikeNombreProducto", query = "SELECT p FROM PuntoventaProducto p WHERE p.nombreProducto LIKE :nombreProductoLike"),
    @NamedQuery(name = "PuntoventaProducto.findByPrecioVenta", query = "SELECT p FROM PuntoventaProducto p WHERE p.precioVenta = :precioVenta"),
    @NamedQuery(name = "PuntoventaProducto.findByPrecioCompra", query = "SELECT p FROM PuntoventaProducto p WHERE p.precioCompra = :precioCompra"),
    @NamedQuery(name = "PuntoventaProducto.findByCantidadDisponible", query = "SELECT p FROM PuntoventaProducto p WHERE p.cantidadDisponible = :cantidadDisponible")})
    
public class PuntoventaProducto implements Serializable {

    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne
    private PuntoventaEmpresa idEmpresa;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;
    @Column(name = "ID_CODIGO_BARRA")
    private String idCodigoBarra;
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @Column(name = "PRECIO_COMPRA")
    private Double precioCompra;
    @Column(name = "CANTIDAD_DISPONIBLE")
    private Double cantidadDisponible;
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID_CATEGORIA")
    @ManyToOne
    private PuntoventaCategoria idCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private List<PuntoventaCarrito> puntoventaCarritoList;
    
    @Column(name = "FECHA_CREACION",columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @JoinColumn(name = "ID_COMMON_OBJECT", referencedColumnName = "ID_COMMON_OBJECT")
    @OneToOne
    private PuntoventaCommonObject idCommonObject;

    public PuntoventaProducto() {
    }

    public PuntoventaProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdCodigoBarra() {
        return idCodigoBarra;
    }

    public void setIdCodigoBarra(String idCodigoBarra) {
        this.idCodigoBarra = idCodigoBarra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public PuntoventaCategoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(PuntoventaCategoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    @XmlTransient
    public List<PuntoventaCarrito> getPuntoventaCarritoList() {
        return puntoventaCarritoList;
    }

    public void setPuntoventaCarritoList(List<PuntoventaCarrito> puntoventaCarritoList) {
        this.puntoventaCarritoList = puntoventaCarritoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaProducto)) {
            return false;
        }
        PuntoventaProducto other = (PuntoventaProducto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNombreProducto();
    }

    /**
     * @return the idEmpresa
     */
    public PuntoventaEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(PuntoventaEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the idCommonObject
     */
    public PuntoventaCommonObject getIdCommonObject() {
        return idCommonObject;
    }

    /**
     * @param idCommonObject the idCommonObject to set
     */
    public void setIdCommonObject(PuntoventaCommonObject idCommonObject) {
        this.idCommonObject = idCommonObject;
    }
    
}

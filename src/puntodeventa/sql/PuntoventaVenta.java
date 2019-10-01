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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import puntodeventa.PuntoventaCorteCaja;

/**
 *
 * @author SERVIDOR-PC
 */
@Entity
@Table(name = "PUNTOVENTA_VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaVenta.findAll", query = "SELECT p FROM PuntoventaVenta p"),
    @NamedQuery(name = "PuntoventaVenta.findByIdVenta", query = "SELECT p FROM PuntoventaVenta p WHERE p.idVenta = :idVenta"),
    @NamedQuery(name = "PuntoventaVenta.findByFechaVenta", query = "SELECT p FROM PuntoventaVenta p WHERE p.fechaVenta = :fechaVenta"),
    @NamedQuery(name = "PuntoventaVenta.findByTotalVenta", query = "SELECT p FROM PuntoventaVenta p WHERE p.totalVenta = :totalVenta"),
    @NamedQuery(name = "PuntoventaVenta.findByPagoVenta", query = "SELECT p FROM PuntoventaVenta p WHERE p.pagoVenta = :pagoVenta"),
    @NamedQuery(name = "PuntoventaVenta.findByIdCorteCajaNull", query = "SELECT p FROM PuntoventaVenta p WHERE p.idCorteCaja = NULL"),
    @NamedQuery(name = "PuntoventaVenta.findByCambioVenta", query = "SELECT p FROM PuntoventaVenta p WHERE p.cambioVenta = :cambioVenta")})
public class PuntoventaVenta implements Serializable {

    @JoinColumn(name = "ID_USUARIO_VENTA", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private PuntoventaUsuario idUsuarioVenta;
    
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne
    private PuntoventaEmpresa idEmpresa;
    
    @JoinColumn(name = "ID_CORTE_CAJA", referencedColumnName = "ID_CORTE_CAJA")
    @ManyToOne
    private PuntoventaCorteCaja idCorteCaja;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VENTA")
    private Integer idVenta;
    @Column(name = "FECHA_VENTA",columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_VENTA")
    private Double totalVenta;
    @Column(name = "PAGO_VENTA")
    private Double pagoVenta;
    @Column(name = "CAMBIO_VENTA")
    private Double cambioVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta")
    private List<PuntoventaCarrito> puntoventaCarritoList;

    public PuntoventaVenta() {
    }

    public PuntoventaVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Double getPagoVenta() {
        return pagoVenta;
    }

    public void setPagoVenta(Double pagoVenta) {
        this.pagoVenta = pagoVenta;
    }

    public Double getCambioVenta() {
        return cambioVenta;
    }

    public void setCambioVenta(Double cambioVenta) {
        this.cambioVenta = cambioVenta;
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
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaVenta)) {
            return false;
        }
        PuntoventaVenta other = (PuntoventaVenta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%06d", getIdVenta());
    }

    public PuntoventaCorteCaja getIdCorteCaja() {
        return idCorteCaja;
    }

    public void setIdCorteCaja(PuntoventaCorteCaja idCorteCaja) {
        this.idCorteCaja = idCorteCaja;
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
     * @return the idUsuarioVenta
     */
    public PuntoventaUsuario getIdUsuarioVenta() {
        return idUsuarioVenta;
    }

    /**
     * @param idUsuarioVenta the idUsuarioVenta to set
     */
    public void setIdUsuarioVenta(PuntoventaUsuario idUsuarioVenta) {
        this.idUsuarioVenta = idUsuarioVenta;
    }
    
}

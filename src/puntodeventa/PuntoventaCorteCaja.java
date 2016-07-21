/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import puntodeventa.sql.PuntoventaVenta;

/**
 *
 * @author SERVIDOR-PC
 */
@Entity
@Table(name = "PUNTOVENTA_CORTE_CAJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaCorteCaja.findAll", query = "SELECT p FROM PuntoventaCorteCaja p"),
    @NamedQuery(name = "PuntoventaCorteCaja.findByIdCorteCaja", query = "SELECT p FROM PuntoventaCorteCaja p WHERE p.idCorteCaja = :idCorteCaja"),
    @NamedQuery(name = "PuntoventaCorteCaja.findByTotalRecaudado", query = "SELECT p FROM PuntoventaCorteCaja p WHERE p.totalRecaudado = :totalRecaudado"),
    @NamedQuery(name = "PuntoventaCorteCaja.findByFechaCorte", query = "SELECT p FROM PuntoventaCorteCaja p WHERE p.fechaCorte = :fechaCorte")})
public class PuntoventaCorteCaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CORTE_CAJA")
    private Integer idCorteCaja;
    @Basic(optional = false)
    @Column(name = "TOTAL_RECAUDADO")
    private double totalRecaudado;
    @Basic(optional = false)
    @Column(name = "FECHA_CORTE")
    @Temporal(TemporalType.DATE)
    private Date fechaCorte;
    @OneToMany(mappedBy = "idCorteCaja")
    private Collection<PuntoventaVenta> puntoventaVentaCollection;

    public PuntoventaCorteCaja() {
    }

    public PuntoventaCorteCaja(Integer idCorteCaja) {
        this.idCorteCaja = idCorteCaja;
    }

    public PuntoventaCorteCaja(Integer idCorteCaja, double totalRecaudado, Date fechaCorte) {
        this.idCorteCaja = idCorteCaja;
        this.totalRecaudado = totalRecaudado;
        this.fechaCorte = fechaCorte;
    }

    public Integer getIdCorteCaja() {
        return idCorteCaja;
    }

    public void setIdCorteCaja(Integer idCorteCaja) {
        this.idCorteCaja = idCorteCaja;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    @XmlTransient
    public Collection<PuntoventaVenta> getPuntoventaVentaCollection() {
        return puntoventaVentaCollection;
    }

    public void setPuntoventaVentaCollection(Collection<PuntoventaVenta> puntoventaVentaCollection) {
        this.puntoventaVentaCollection = puntoventaVentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorteCaja != null ? idCorteCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaCorteCaja)) {
            return false;
        }
        PuntoventaCorteCaja other = (PuntoventaCorteCaja) object;
        if ((this.idCorteCaja == null && other.idCorteCaja != null) || (this.idCorteCaja != null && !this.idCorteCaja.equals(other.idCorteCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puntodeventa.PuntoventaCorteCaja[ idCorteCaja=" + idCorteCaja + " ]";
    }
    
}

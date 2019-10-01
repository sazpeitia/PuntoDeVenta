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
import puntodeventa.sql.PuntoventaEmpresa;
import puntodeventa.sql.PuntoventaUsuario;
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

    @JoinColumn(name = "ID_USUARIO_CORTE", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private PuntoventaUsuario idUsuarioCorte;
    
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne
    private PuntoventaEmpresa idEmpresa;

    @Basic(optional = false)
    @Column(name = "TOTAL_REAL")
    private double totalReal;
    @Column(name = "RETIRO_CAJA")
    private double retiroCaja;

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
    @Column(name = "FECHA_CORTE",columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
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

    public double getTotalReal() {
        return totalReal;
    }

    public void setTotalReal(double totalReal) {
        this.totalReal = totalReal;
    }

    /**
     * @return the retiroCaja
     */
    public double getRetiroCaja() {
        return retiroCaja;
    }

    /**
     * @param retiroCaja the retiroCaja to set
     */
    public void setRetiroCaja(double retiroCaja) {
        this.retiroCaja = retiroCaja;
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
     * @return the idUsuarioCorte
     */
    public PuntoventaUsuario getIdUsuarioCorte() {
        return idUsuarioCorte;
    }

    /**
     * @param idUsuarioCorte the idUsuarioCorte to set
     */
    public void setIdUsuarioCorte(PuntoventaUsuario idUsuarioCorte) {
        this.idUsuarioCorte = idUsuarioCorte;
    }
    
}

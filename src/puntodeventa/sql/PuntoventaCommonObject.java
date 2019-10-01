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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "PUNTOVENTA_COMMON_OBJECT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaCommonObject.findAll", query = "SELECT p FROM PuntoventaCommonObject p"),
    @NamedQuery(name = "PuntoventaCommonObject.findByIdCommonObject", query = "SELECT p FROM PuntoventaCommonObject p WHERE p.idCommonObject = :idCommonObject")})
public class PuntoventaCommonObject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMMON_OBJECT")
    private Integer idCommonObject;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCommonObject")
    private List<PuntoventaImagen> puntoventaImagenList;
    
    @Column(name = "FECHA_CREACION",columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public PuntoventaCommonObject() {
    }

    public PuntoventaCommonObject(Integer idCommonObject) {
        this.idCommonObject = idCommonObject;
    }

    public Integer getIdCommonObject() {
        return idCommonObject;
    }

    public void setIdCommonObject(Integer idCommonObject) {
        this.idCommonObject = idCommonObject;
    }

    @XmlTransient
    public List<PuntoventaImagen> getPuntoventaImagenList() {
        return puntoventaImagenList;
    }

    public void setPuntoventaImagenList(List<PuntoventaImagen> puntoventaImagenList) {
        this.puntoventaImagenList = puntoventaImagenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommonObject != null ? idCommonObject.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaCommonObject)) {
            return false;
        }
        PuntoventaCommonObject other = (PuntoventaCommonObject) object;
        if ((this.idCommonObject == null && other.idCommonObject != null) || (this.idCommonObject != null && !this.idCommonObject.equals(other.idCommonObject))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puntodeventa.sql.PuntoventaCommonObject[ idCommonObject=" + idCommonObject + " ]";
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
    
}

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
 * @author asus
 */
@Entity
@Table(name = "PUNTOVENTA_IMAGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaImagen.findAll", query = "SELECT p FROM PuntoventaImagen p"),
    @NamedQuery(name = "PuntoventaImagen.findByIdImagen", query = "SELECT p FROM PuntoventaImagen p WHERE p.idImagen = :idImagen"),
    @NamedQuery(name = "PuntoventaImagen.findByPath", query = "SELECT p FROM PuntoventaImagen p WHERE p.path = :path")})
public class PuntoventaImagen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_IMAGEN")
    private Integer idImagen;
    @Basic(optional = false)
    @Column(name = "PATH")
    private String path;
    @JoinColumn(name = "ID_COMMON_OBJECT", referencedColumnName = "ID_COMMON_OBJECT")
    @ManyToOne(optional = false)
    private PuntoventaCommonObject idCommonObject;

    public PuntoventaImagen() {
    }

    public PuntoventaImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public PuntoventaImagen(Integer idImagen, String path) {
        this.idImagen = idImagen;
        this.path = path;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PuntoventaCommonObject getIdCommonObject() {
        return idCommonObject;
    }

    public void setIdCommonObject(PuntoventaCommonObject idCommonObject) {
        this.idCommonObject = idCommonObject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImagen != null ? idImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaImagen)) {
            return false;
        }
        PuntoventaImagen other = (PuntoventaImagen) object;
        if ((this.idImagen == null && other.idImagen != null) || (this.idImagen != null && !this.idImagen.equals(other.idImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        String fileName = getPath().split("/")[getPath().split("/").length-1];
        
        return fileName;
    }
    
}

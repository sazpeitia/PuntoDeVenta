/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sazpeitia
 */
@Entity
@Table(name = "PUNTOVENTA_GRUPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaGrupo.findAll", query = "SELECT p FROM PuntoventaGrupo p")
    , @NamedQuery(name = "PuntoventaGrupo.findByIdGrupo", query = "SELECT p FROM PuntoventaGrupo p WHERE p.idGrupo = :idGrupo")
    , @NamedQuery(name = "PuntoventaGrupo.findByNombreGrupo", query = "SELECT p FROM PuntoventaGrupo p WHERE p.nombreGrupo = :nombreGrupo")})
public class PuntoventaGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_GRUPO")
    private Integer idGrupo;
    @Basic(optional = false)
    @Column(name = "NOMBRE_GRUPO")
    private String nombreGrupo;
    @OneToMany(mappedBy = "idGrupo")
    private Collection<PuntoventaCategoria> puntoventaCategoriaCollection;

    public PuntoventaGrupo() {
    }

    public PuntoventaGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public PuntoventaGrupo(Integer idGrupo, String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @XmlTransient
    public Collection<PuntoventaCategoria> getPuntoventaCategoriaCollection() {
        return puntoventaCategoriaCollection;
    }

    public void setPuntoventaCategoriaCollection(Collection<PuntoventaCategoria> puntoventaCategoriaCollection) {
        this.puntoventaCategoriaCollection = puntoventaCategoriaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaGrupo)) {
            return false;
        }
        PuntoventaGrupo other = (PuntoventaGrupo) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreGrupo;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import java.io.Serializable;
import java.util.List;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SERVIDOR-PC
 */
@Entity
@Table(name = "puntoventa_categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaCategoria.findAll", query = "SELECT p FROM PuntoventaCategoria p"),
    @NamedQuery(name = "PuntoventaCategoria.findByIdCategoria", query = "SELECT p FROM PuntoventaCategoria p WHERE p.idCategoria = :idCategoria"),
    @NamedQuery(name = "PuntoventaCategoria.findByNombreCategoria", query = "SELECT p FROM PuntoventaCategoria p WHERE p.nombreCategoria = :nombreCategoria")})
public class PuntoventaCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name = "NOMBRE_CATEGORIA")
    private String nombreCategoria;
    @OneToMany(mappedBy = "idCategoria")
    private List<PuntoventaProducto> puntoventaProductoList;
    @OneToMany(mappedBy = "idCategoriaPadre")
    private List<PuntoventaCategoria> puntoventaCategoriaList;
    @JoinColumn(name = "ID_CATEGORIA_PADRE", referencedColumnName = "ID_CATEGORIA")
    @ManyToOne
    private PuntoventaCategoria idCategoriaPadre;

    public PuntoventaCategoria() {
    }

    public PuntoventaCategoria(Integer idCategoria, String nombreCategoria, PuntoventaCategoria idCategoriaPadre) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.idCategoriaPadre = idCategoriaPadre;
    }
    
    

    public PuntoventaCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @XmlTransient
    public List<PuntoventaProducto> getPuntoventaProductoList() {
        return puntoventaProductoList;
    }

    public void setPuntoventaProductoList(List<PuntoventaProducto> puntoventaProductoList) {
        this.puntoventaProductoList = puntoventaProductoList;
    }

    @XmlTransient
    public List<PuntoventaCategoria> getPuntoventaCategoriaList() {
        return puntoventaCategoriaList;
    }

    public void setPuntoventaCategoriaList(List<PuntoventaCategoria> puntoventaCategoriaList) {
        this.puntoventaCategoriaList = puntoventaCategoriaList;
    }

    public PuntoventaCategoria getIdCategoriaPadre() {
        return idCategoriaPadre;
    }

    public void setIdCategoriaPadre(PuntoventaCategoria idCategoriaPadre) {
        this.idCategoriaPadre = idCategoriaPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaCategoria)) {
            return false;
        }
        PuntoventaCategoria other = (PuntoventaCategoria) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puntodeventa.sql.PuntoventaCategoria[ idCategoria=" + idCategoria + " ]";
    }
    
}

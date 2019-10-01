/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa.sql;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import puntodeventa.PuntoventaCorteCaja;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "puntoventa_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaEmpresa.findAll", query = "SELECT p FROM PuntoventaEmpresa p"),
    @NamedQuery(name = "PuntoventaEmpresa.findByIdEmpresa", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "PuntoventaEmpresa.findByNombreEmpresa", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.nombreEmpresa = :nombreEmpresa"),
    @NamedQuery(name = "PuntoventaEmpresa.findByDireccion", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "PuntoventaEmpresa.findByRfc", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.rfc = :rfc"),
    @NamedQuery(name = "PuntoventaEmpresa.findByTelefono", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "PuntoventaEmpresa.findByPaginaWeb", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.paginaWeb = :paginaWeb"),
    @NamedQuery(name = "PuntoventaEmpresa.findByNombreCorto", query = "SELECT p FROM PuntoventaEmpresa p WHERE p.nombreCorto = :nombreCorto")})
public class PuntoventaEmpresa implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<PuntoventaCategoria> puntoventaCategoriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<PuntoventaProducto> puntoventaProductoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<PuntoventaCorteCaja> puntoventaCorteCajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<PuntoventaVenta> puntoventaVentaList;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_EMPRESA")
    private Integer idEmpresa;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EMPRESA")
    private String nombreEmpresa;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "PAGINA_WEB")
    private String paginaWeb;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CORTO")
    private String nombreCorto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<PuntoventaEmpresaUsuario> puntoventaEmpresaUsuarioList;

    public PuntoventaEmpresa() {
    }

    public PuntoventaEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public PuntoventaEmpresa(Integer idEmpresa, String nombreEmpresa, String direccion, String rfc, String nombreCorto) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.rfc = rfc;
        this.nombreCorto = nombreCorto;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    @XmlTransient
    public List<PuntoventaEmpresaUsuario> getPuntoventaEmpresaUsuarioList() {
        return puntoventaEmpresaUsuarioList;
    }

    public void setPuntoventaEmpresaUsuarioList(List<PuntoventaEmpresaUsuario> puntoventaEmpresaUsuarioList) {
        this.puntoventaEmpresaUsuarioList = puntoventaEmpresaUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaEmpresa)) {
            return false;
        }
        PuntoventaEmpresa other = (PuntoventaEmpresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombreEmpresa();
    }

    /**
     * @return the puntoventaCategoriaList
     */
    public List<PuntoventaCategoria> getPuntoventaCategoriaList() {
        return puntoventaCategoriaList;
    }

    /**
     * @param puntoventaCategoriaList the puntoventaCategoriaList to set
     */
    public void setPuntoventaCategoriaList(List<PuntoventaCategoria> puntoventaCategoriaList) {
        this.puntoventaCategoriaList = puntoventaCategoriaList;
    }

    /**
     * @return the puntoventaProductoList
     */
    public List<PuntoventaProducto> getPuntoventaProductoList() {
        return puntoventaProductoList;
    }

    /**
     * @param puntoventaProductoList the puntoventaProductoList to set
     */
    public void setPuntoventaProductoList(List<PuntoventaProducto> puntoventaProductoList) {
        this.puntoventaProductoList = puntoventaProductoList;
    }

    /**
     * @return the puntoventaCorteCajaList
     */
    public List<PuntoventaCorteCaja> getPuntoventaCorteCajaList() {
        return puntoventaCorteCajaList;
    }

    /**
     * @param puntoventaCorteCajaList the puntoventaCorteCajaList to set
     */
    public void setPuntoventaCorteCajaList(List<PuntoventaCorteCaja> puntoventaCorteCajaList) {
        this.puntoventaCorteCajaList = puntoventaCorteCajaList;
    }

    /**
     * @return the puntoventaVentaList
     */
    public List<PuntoventaVenta> getPuntoventaVentaList() {
        return puntoventaVentaList;
    }

    /**
     * @param puntoventaVentaList the puntoventaVentaList to set
     */
    public void setPuntoventaVentaList(List<PuntoventaVenta> puntoventaVentaList) {
        this.puntoventaVentaList = puntoventaVentaList;
    }
    
}

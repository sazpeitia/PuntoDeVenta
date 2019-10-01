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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import puntodeventa.PuntoventaCorteCaja;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "puntoventa_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaUsuario.findAll", query = "SELECT p FROM PuntoventaUsuario p"),
    @NamedQuery(name = "PuntoventaUsuario.findByIdUsuario", query = "SELECT p FROM PuntoventaUsuario p WHERE p.idUsuario = :idUsuario"),
    @NamedQuery(name = "PuntoventaUsuario.findByDireccion", query = "SELECT p FROM PuntoventaUsuario p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "PuntoventaUsuario.findByTelefono", query = "SELECT p FROM PuntoventaUsuario p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "PuntoventaUsuario.findByUsernameDesk", query = "SELECT p FROM PuntoventaUsuario p WHERE p.usernameDesk = :usernameDesk"),
    @NamedQuery(name = "PuntoventaUsuario.findByPasswordDesk", query = "SELECT p FROM PuntoventaUsuario p WHERE p.passwordDesk = :passwordDesk")})
public class PuntoventaUsuario implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioCorte")
    private List<PuntoventaCorteCaja> puntoventaCorteCajaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioVenta")
    private List<PuntoventaVenta> puntoventaVentaList;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "USERNAME_DESK")
    private String usernameDesk;
    @Column(name = "PASSWORD_DESK")
    private String passwordDesk;
    @JoinColumn(name = "ID_AUTH_USER", referencedColumnName = "id")
    @OneToOne(optional = false)
    private AuthUser idAuthUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<PuntoventaEmpresaUsuario> puntoventaEmpresaUsuarioList;

    public PuntoventaUsuario() {
    }

    public PuntoventaUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public PuntoventaUsuario(Integer idUsuario, String direccion) {
        this.idUsuario = idUsuario;
        this.direccion = direccion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsernameDesk() {
        return usernameDesk;
    }

    public void setUsernameDesk(String usernameDesk) {
        this.usernameDesk = usernameDesk;
    }

    public String getPasswordDesk() {
        return passwordDesk;
    }

    public void setPasswordDesk(String passwordDesk) {
        this.passwordDesk = passwordDesk;
    }

    public AuthUser getIdAuthUser() {
        return idAuthUser;
    }

    public void setIdAuthUser(AuthUser idAuthUser) {
        this.idAuthUser = idAuthUser;
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaUsuario)) {
            return false;
        }
        PuntoventaUsuario other = (PuntoventaUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getIdAuthUser().getUsername();
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

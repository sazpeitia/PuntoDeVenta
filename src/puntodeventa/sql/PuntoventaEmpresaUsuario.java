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
@Table(name = "puntoventa_empresa_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoventaEmpresaUsuario.findAll", query = "SELECT p FROM PuntoventaEmpresaUsuario p"),
    @NamedQuery(name = "PuntoventaEmpresaUsuario.findByIdEmpresaUsuario", query = "SELECT p FROM PuntoventaEmpresaUsuario p WHERE p.idEmpresaUsuario = :idEmpresaUsuario")})
public class PuntoventaEmpresaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_EMPRESA_USUARIO")
    private Integer idEmpresaUsuario;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private PuntoventaEmpresa idEmpresa;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private PuntoventaUsuario idUsuario;

    public PuntoventaEmpresaUsuario() {
    }

    public PuntoventaEmpresaUsuario(Integer idEmpresaUsuario) {
        this.idEmpresaUsuario = idEmpresaUsuario;
    }

    public Integer getIdEmpresaUsuario() {
        return idEmpresaUsuario;
    }

    public void setIdEmpresaUsuario(Integer idEmpresaUsuario) {
        this.idEmpresaUsuario = idEmpresaUsuario;
    }

    public PuntoventaEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(PuntoventaEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public PuntoventaUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(PuntoventaUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaUsuario != null ? idEmpresaUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoventaEmpresaUsuario)) {
            return false;
        }
        PuntoventaEmpresaUsuario other = (PuntoventaEmpresaUsuario) object;
        if ((this.idEmpresaUsuario == null && other.idEmpresaUsuario != null) || (this.idEmpresaUsuario != null && !this.idEmpresaUsuario.equals(other.idEmpresaUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puntodeventa.sql.PuntoventaEmpresaUsuario[ idEmpresaUsuario=" + idEmpresaUsuario + " ]";
    }
    
}

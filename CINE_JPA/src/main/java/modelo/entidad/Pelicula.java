/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC14
 */
@Entity
@Table(name = "PELICULA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p")
    , @NamedQuery(name = "Pelicula.findByIdpel", query = "SELECT p FROM Pelicula p WHERE p.idpel = :idpel")
    , @NamedQuery(name = "Pelicula.findByNompel", query = "SELECT p FROM Pelicula p WHERE p.nompel = :nompel")
    , @NamedQuery(name = "Pelicula.findByGenpel", query = "SELECT p FROM Pelicula p WHERE p.genpel = :genpel")
    , @NamedQuery(name = "Pelicula.findByFechestreno", query = "SELECT p FROM Pelicula p WHERE p.fechestreno = :fechestreno")
    , @NamedQuery(name = "Pelicula.findByFechtermino", query = "SELECT p FROM Pelicula p WHERE p.fechtermino = :fechtermino")})
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPEL")
    private Long idpel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMPEL")
    private String nompel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "GENPEL")
    private String genpel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHESTRENO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechestreno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHTERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechtermino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpel")
    private List<VentaEntrada> ventaEntradaList;

    public Pelicula() {
    }

    public Pelicula(Long idpel) {
        this.idpel = idpel;
    }

    public Pelicula(Long idpel, String nompel, String genpel, Date fechestreno, Date fechtermino) {
        this.idpel = idpel;
        this.nompel = nompel;
        this.genpel = genpel;
        this.fechestreno = fechestreno;
        this.fechtermino = fechtermino;
    }

    public Long getIdpel() {
        return idpel;
    }

    public void setIdpel(Long idpel) {
        this.idpel = idpel;
    }

    public String getNompel() {
        return nompel;
    }

    public void setNompel(String nompel) {
        this.nompel = nompel;
    }

    public String getGenpel() {
        return genpel;
    }

    public void setGenpel(String genpel) {
        this.genpel = genpel;
    }

    public Date getFechestreno() {
        return fechestreno;
    }

    public void setFechestreno(Date fechestreno) {
        this.fechestreno = fechestreno;
    }

    public Date getFechtermino() {
        return fechtermino;
    }

    public void setFechtermino(Date fechtermino) {
        this.fechtermino = fechtermino;
    }

    @XmlTransient
    public List<VentaEntrada> getVentaEntradaList() {
        return ventaEntradaList;
    }

    public void setVentaEntradaList(List<VentaEntrada> ventaEntradaList) {
        this.ventaEntradaList = ventaEntradaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpel != null ? idpel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idpel == null && other.idpel != null) || (this.idpel != null && !this.idpel.equals(other.idpel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Pelicula[ idpel=" + idpel + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC14
 */
@Entity
@Table(name = "PERSONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByIdper", query = "SELECT p FROM Personal p WHERE p.idper = :idper")
    , @NamedQuery(name = "Personal.findByNomper", query = "SELECT p FROM Personal p WHERE p.nomper = :nomper")
    , @NamedQuery(name = "Personal.findByApeper", query = "SELECT p FROM Personal p WHERE p.apeper = :apeper")
    , @NamedQuery(name = "Personal.findByDniper", query = "SELECT p FROM Personal p WHERE p.dniper = :dniper")
    , @NamedQuery(name = "Personal.findByCelper", query = "SELECT p FROM Personal p WHERE p.celper = :celper")
    , @NamedQuery(name = "Personal.findByTipper", query = "SELECT p FROM Personal p WHERE p.tipper = :tipper")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPER")
    private Long idper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMPER")
    private String nomper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "APEPER")
    private String apeper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "DNIPER")
    private String dniper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "CELPER")
    private String celper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TIPPER")
    private String tipper;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idper")
    private List<Venta> ventaList;

    public Personal() {
    }

    public Personal(Long idper) {
        this.idper = idper;
    }

    public Personal(Long idper, String nomper, String apeper, String dniper, String celper, String tipper) {
        this.idper = idper;
        this.nomper = nomper;
        this.apeper = apeper;
        this.dniper = dniper;
        this.celper = celper;
        this.tipper = tipper;
    }

    public Long getIdper() {
        return idper;
    }

    public void setIdper(Long idper) {
        this.idper = idper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getApeper() {
        return apeper;
    }

    public void setApeper(String apeper) {
        this.apeper = apeper;
    }

    public String getDniper() {
        return dniper;
    }

    public void setDniper(String dniper) {
        this.dniper = dniper;
    }

    public String getCelper() {
        return celper;
    }

    public void setCelper(String celper) {
        this.celper = celper;
    }

    public String getTipper() {
        return tipper;
    }

    public void setTipper(String tipper) {
        this.tipper = tipper;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Personal[ idper=" + idper + " ]";
    }
    
}

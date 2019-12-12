/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "COMBO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Combo.findAll", query = "SELECT c FROM Combo c")
    , @NamedQuery(name = "Combo.findByIdcom", query = "SELECT c FROM Combo c WHERE c.idcom = :idcom")
    , @NamedQuery(name = "Combo.findByTipcom", query = "SELECT c FROM Combo c WHERE c.tipcom = :tipcom")
    , @NamedQuery(name = "Combo.findByPrecom", query = "SELECT c FROM Combo c WHERE c.precom = :precom")})
public class Combo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCOM")
    private Long idcom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIPCOM")
    private String tipcom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECOM")
    private BigDecimal precom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcom")
    private List<VentaCombos> ventaCombosList;

    public Combo() {
    }

    public Combo(Long idcom) {
        this.idcom = idcom;
    }

    public Combo(Long idcom, String tipcom, BigDecimal precom) {
        this.idcom = idcom;
        this.tipcom = tipcom;
        this.precom = precom;
    }

    public Long getIdcom() {
        return idcom;
    }

    public void setIdcom(Long idcom) {
        this.idcom = idcom;
    }

    public String getTipcom() {
        return tipcom;
    }

    public void setTipcom(String tipcom) {
        this.tipcom = tipcom;
    }

    public BigDecimal getPrecom() {
        return precom;
    }

    public void setPrecom(BigDecimal precom) {
        this.precom = precom;
    }

    @XmlTransient
    public List<VentaCombos> getVentaCombosList() {
        return ventaCombosList;
    }

    public void setVentaCombosList(List<VentaCombos> ventaCombosList) {
        this.ventaCombosList = ventaCombosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcom != null ? idcom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combo)) {
            return false;
        }
        Combo other = (Combo) object;
        if ((this.idcom == null && other.idcom != null) || (this.idcom != null && !this.idcom.equals(other.idcom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Combo[ idcom=" + idcom + " ]";
    }
    
}

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
@Table(name = "ENTRADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e")
    , @NamedQuery(name = "Entrada.findByIdent", query = "SELECT e FROM Entrada e WHERE e.ident = :ident")
    , @NamedQuery(name = "Entrada.findByTipent", query = "SELECT e FROM Entrada e WHERE e.tipent = :tipent")
    , @NamedQuery(name = "Entrada.findByPreent", query = "SELECT e FROM Entrada e WHERE e.preent = :preent")})
public class Entrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDENT")
    private Long ident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIPENT")
    private String tipent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREENT")
    private BigDecimal preent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ident")
    private List<VentaEntrada> ventaEntradaList;

    public Entrada() {
    }

    public Entrada(Long ident) {
        this.ident = ident;
    }

    public Entrada(Long ident, String tipent, BigDecimal preent) {
        this.ident = ident;
        this.tipent = tipent;
        this.preent = preent;
    }

    public Long getIdent() {
        return ident;
    }

    public void setIdent(Long ident) {
        this.ident = ident;
    }

    public String getTipent() {
        return tipent;
    }

    public void setTipent(String tipent) {
        this.tipent = tipent;
    }

    public BigDecimal getPreent() {
        return preent;
    }

    public void setPreent(BigDecimal preent) {
        this.preent = preent;
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
        hash += (ident != null ? ident.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.ident == null && other.ident != null) || (this.ident != null && !this.ident.equals(other.ident))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Entrada[ ident=" + ident + " ]";
    }
    
}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC14
 */
@Entity
@Table(name = "VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdvent", query = "SELECT v FROM Venta v WHERE v.idvent = :idvent")
    , @NamedQuery(name = "Venta.findByTipvent", query = "SELECT v FROM Venta v WHERE v.tipvent = :tipvent")
    , @NamedQuery(name = "Venta.findByFecvent", query = "SELECT v FROM Venta v WHERE v.fecvent = :fecvent")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENT")
    private Long idvent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPVENT")
    private Character tipvent;
    @Column(name = "FECVENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecvent;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne(optional = false)
    private Cliente idcli;
    @JoinColumn(name = "IDPER", referencedColumnName = "IDPER")
    @ManyToOne(optional = false)
    private Personal idper;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvent")
    private List<VentaCombos> ventaCombosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvent")
    private List<VentaEntrada> ventaEntradaList;

    public Venta() {
    }

    public Venta(Long idvent) {
        this.idvent = idvent;
    }

    public Venta(Long idvent, Character tipvent) {
        this.idvent = idvent;
        this.tipvent = tipvent;
    }

    public Long getIdvent() {
        return idvent;
    }

    public void setIdvent(Long idvent) {
        this.idvent = idvent;
    }

    public Character getTipvent() {
        return tipvent;
    }

    public void setTipvent(Character tipvent) {
        this.tipvent = tipvent;
    }

    public Date getFecvent() {
        return fecvent;
    }

    public void setFecvent(Date fecvent) {
        this.fecvent = fecvent;
    }

    public Cliente getIdcli() {
        return idcli;
    }

    public void setIdcli(Cliente idcli) {
        this.idcli = idcli;
    }

    public Personal getIdper() {
        return idper;
    }

    public void setIdper(Personal idper) {
        this.idper = idper;
    }

    @XmlTransient
    public List<VentaCombos> getVentaCombosList() {
        return ventaCombosList;
    }

    public void setVentaCombosList(List<VentaCombos> ventaCombosList) {
        this.ventaCombosList = ventaCombosList;
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
        hash += (idvent != null ? idvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idvent == null && other.idvent != null) || (this.idvent != null && !this.idvent.equals(other.idvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Venta[ idvent=" + idvent + " ]";
    }
    
}

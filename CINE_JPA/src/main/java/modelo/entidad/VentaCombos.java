/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC14
 */
@Entity
@Table(name = "VENTA_COMBOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaCombos.findAll", query = "SELECT v FROM VentaCombos v")
    , @NamedQuery(name = "VentaCombos.findByIdvenco", query = "SELECT v FROM VentaCombos v WHERE v.idvenco = :idvenco")})
public class VentaCombos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENCO")
    private Long idvenco;
    @JoinColumn(name = "IDCOM", referencedColumnName = "IDCOM")
    @ManyToOne(optional = false)
    private Combo idcom;
    @JoinColumn(name = "IDVENT", referencedColumnName = "IDVENT")
    @ManyToOne(optional = false)
    private Venta idvent;

    public VentaCombos() {
    }

    public VentaCombos(Long idvenco) {
        this.idvenco = idvenco;
    }

    public Long getIdvenco() {
        return idvenco;
    }

    public void setIdvenco(Long idvenco) {
        this.idvenco = idvenco;
    }

    public Combo getIdcom() {
        return idcom;
    }

    public void setIdcom(Combo idcom) {
        this.idcom = idcom;
    }

    public Venta getIdvent() {
        return idvent;
    }

    public void setIdvent(Venta idvent) {
        this.idvent = idvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenco != null ? idvenco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaCombos)) {
            return false;
        }
        VentaCombos other = (VentaCombos) object;
        if ((this.idvenco == null && other.idvenco != null) || (this.idvenco != null && !this.idvenco.equals(other.idvenco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.VentaCombos[ idvenco=" + idvenco + " ]";
    }
    
}

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
@Table(name = "VENTA_ENTRADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaEntrada.findAll", query = "SELECT v FROM VentaEntrada v")
    , @NamedQuery(name = "VentaEntrada.findByIdventdet", query = "SELECT v FROM VentaEntrada v WHERE v.idventdet = :idventdet")
    , @NamedQuery(name = "VentaEntrada.findByCanvendet", query = "SELECT v FROM VentaEntrada v WHERE v.canvendet = :canvendet")})
public class VentaEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENTDET")
    private Long idventdet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANVENDET")
    private long canvendet;
    @JoinColumn(name = "IDENT", referencedColumnName = "IDENT")
    @ManyToOne(optional = false)
    private Entrada ident;
    @JoinColumn(name = "IDPEL", referencedColumnName = "IDPEL")
    @ManyToOne(optional = false)
    private Pelicula idpel;
    @JoinColumn(name = "IDVENT", referencedColumnName = "IDVENT")
    @ManyToOne(optional = false)
    private Venta idvent;

    public VentaEntrada() {
    }

    public VentaEntrada(Long idventdet) {
        this.idventdet = idventdet;
    }

    public VentaEntrada(Long idventdet, long canvendet) {
        this.idventdet = idventdet;
        this.canvendet = canvendet;
    }

    public Long getIdventdet() {
        return idventdet;
    }

    public void setIdventdet(Long idventdet) {
        this.idventdet = idventdet;
    }

    public long getCanvendet() {
        return canvendet;
    }

    public void setCanvendet(long canvendet) {
        this.canvendet = canvendet;
    }

    public Entrada getIdent() {
        return ident;
    }

    public void setIdent(Entrada ident) {
        this.ident = ident;
    }

    public Pelicula getIdpel() {
        return idpel;
    }

    public void setIdpel(Pelicula idpel) {
        this.idpel = idpel;
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
        hash += (idventdet != null ? idventdet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaEntrada)) {
            return false;
        }
        VentaEntrada other = (VentaEntrada) object;
        if ((this.idventdet == null && other.idventdet != null) || (this.idventdet != null && !this.idventdet.equals(other.idventdet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.VentaEntrada[ idventdet=" + idventdet + " ]";
    }
    
}

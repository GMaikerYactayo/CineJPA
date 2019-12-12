package modelo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Entrada;
import modelo.entidad.Pelicula;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(VentaEntrada.class)
public class VentaEntrada_ { 

    public static volatile SingularAttribute<VentaEntrada, Long> canvendet;
    public static volatile SingularAttribute<VentaEntrada, Venta> idvent;
    public static volatile SingularAttribute<VentaEntrada, Entrada> ident;
    public static volatile SingularAttribute<VentaEntrada, Long> idventdet;
    public static volatile SingularAttribute<VentaEntrada, Pelicula> idpel;

}
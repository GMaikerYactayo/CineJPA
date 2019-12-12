package modelo.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Cliente;
import modelo.entidad.Personal;
import modelo.entidad.VentaCombos;
import modelo.entidad.VentaEntrada;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Character> tipvent;
    public static volatile SingularAttribute<Venta, Cliente> idcli;
    public static volatile SingularAttribute<Venta, Personal> idper;
    public static volatile SingularAttribute<Venta, Long> idvent;
    public static volatile SingularAttribute<Venta, Date> fecvent;
    public static volatile ListAttribute<Venta, VentaEntrada> ventaEntradaList;
    public static volatile ListAttribute<Venta, VentaCombos> ventaCombosList;

}
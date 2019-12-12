package modelo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, String> celper;
    public static volatile SingularAttribute<Personal, Long> idper;
    public static volatile SingularAttribute<Personal, String> nomper;
    public static volatile ListAttribute<Personal, Venta> ventaList;
    public static volatile SingularAttribute<Personal, String> apeper;
    public static volatile SingularAttribute<Personal, String> dniper;
    public static volatile SingularAttribute<Personal, String> tipper;

}
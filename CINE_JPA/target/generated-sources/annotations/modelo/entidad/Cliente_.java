package modelo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> nomcli;
    public static volatile SingularAttribute<Cliente, String> dnicli;
    public static volatile SingularAttribute<Cliente, Long> idcli;
    public static volatile SingularAttribute<Cliente, String> apecli;
    public static volatile ListAttribute<Cliente, Venta> ventaList;

}
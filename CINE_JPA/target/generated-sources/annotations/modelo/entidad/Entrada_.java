package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.VentaEntrada;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Long> ident;
    public static volatile ListAttribute<Entrada, VentaEntrada> ventaEntradaList;
    public static volatile SingularAttribute<Entrada, BigDecimal> preent;
    public static volatile SingularAttribute<Entrada, String> tipent;

}
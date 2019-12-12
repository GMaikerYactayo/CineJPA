package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.VentaCombos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Combo.class)
public class Combo_ { 

    public static volatile SingularAttribute<Combo, Long> idcom;
    public static volatile SingularAttribute<Combo, String> tipcom;
    public static volatile SingularAttribute<Combo, BigDecimal> precom;
    public static volatile ListAttribute<Combo, VentaCombos> ventaCombosList;

}
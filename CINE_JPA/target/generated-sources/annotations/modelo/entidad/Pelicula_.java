package modelo.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.VentaEntrada;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T12:55:33")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, String> genpel;
    public static volatile SingularAttribute<Pelicula, Date> fechestreno;
    public static volatile SingularAttribute<Pelicula, Date> fechtermino;
    public static volatile ListAttribute<Pelicula, VentaEntrada> ventaEntradaList;
    public static volatile SingularAttribute<Pelicula, Long> idpel;
    public static volatile SingularAttribute<Pelicula, String> nompel;

}
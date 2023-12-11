package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Inventario;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-10T13:56:38")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Personas_ {

    public static volatile SingularAttribute<Empleado, Inventario> inven;
    public static volatile SingularAttribute<Empleado, String> contrasena;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile SingularAttribute<Empleado, String> user;

}
package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Empleado;
import logica.Proveedor;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-10T13:56:38")
@StaticMetamodel(OrdenCompra.class)
public class OrdenCompra_ { 

    public static volatile SingularAttribute<OrdenCompra, Proveedor> provee;
    public static volatile SingularAttribute<OrdenCompra, Empleado> enple;
    public static volatile SingularAttribute<OrdenCompra, Integer> id;
    public static volatile SingularAttribute<OrdenCompra, Integer> nunOrden;

}
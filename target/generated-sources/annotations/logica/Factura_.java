package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Cliente;
import logica.Empleado;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-10T13:56:38")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> id;
    public static volatile SingularAttribute<Factura, Integer> numFactura;
    public static volatile SingularAttribute<Factura, Cliente> clien;
    public static volatile SingularAttribute<Factura, Empleado> emplea;

}
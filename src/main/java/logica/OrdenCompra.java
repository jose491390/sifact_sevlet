package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class OrdenCompra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nunOrden;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado enple;
    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor provee;

    public OrdenCompra() {
    }

    public OrdenCompra(int id, int nunOrden) {
        this.id = id;
        this.nunOrden = nunOrden;
    }

    public int getNunOrden() {
        return nunOrden;
    }

    public void setNunOrden(int nunOrden) {
        this.nunOrden = nunOrden;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

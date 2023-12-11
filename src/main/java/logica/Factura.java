package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numFactura;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente clien;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado emplea;

    public Factura() {
    }

    public Factura(int id, int numFactura) {
        this.id = id;
        this.numFactura = numFactura;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}

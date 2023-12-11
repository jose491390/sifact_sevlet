package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String valorCompra;
    private String iva;
    private String valorVenta;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, String valorCompra, String iva, String valorVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorCompra = valorCompra;
        this.iva = iva;
        this.valorVenta = valorVenta;
    }

    public String getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(String valorVenta) {
        this.valorVenta = valorVenta;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

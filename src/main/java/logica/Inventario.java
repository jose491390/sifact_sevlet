package logica;

import java.io.Serializable;
import javax.persistence.Entity;




@Entity
public class Inventario extends Producto implements Serializable{
    private int precio;
    private int cantidad;

    public Inventario() {
    }

    public Inventario(int precio, int cantidad, int id, String nombre, String descripcion, String valorCompra, String iva, String valorVenta) {
        super(id, nombre, descripcion, valorCompra, iva, valorVenta);
        this.precio = precio;
        this.cantidad = cantidad;
    }

    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

package logica;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Empleado extends  Personas{
    private String user;
    private String cargo;
    private String contrasena;
    @OneToOne
    private Inventario inven;
    

    public Empleado() {
    }

    public Empleado(String user, String cargo, String contrasena, Inventario inven, OrdenCompra oc, Factura factu, int id, int identificacion, String nombre, String telefono, String correo, String direccion) {
        super(id, identificacion, nombre, telefono, correo, direccion);
        this.user = user;
        this.cargo = cargo;
        this.contrasena = contrasena;
        
    }

     

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
        
    
    
}

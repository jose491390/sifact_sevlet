package logica;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class Cliente extends Personas{
    private String razonSocial;
    
    

    public Cliente() {
    }

    public Cliente(String razonSocial, Factura factu, int id, int identificacion, String nombre, String telefono, String correo, String direccion) {
        super(id, identificacion, nombre, telefono, correo, direccion);
        this.razonSocial = razonSocial;
        
    }   

  

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}

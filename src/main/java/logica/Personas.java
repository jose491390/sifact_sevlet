package logica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;




@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personas{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int identificacion;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    public Personas() {
    }

    public Personas(int id, int identificacion, String nombre, String telefono, String correo, String direccion) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}

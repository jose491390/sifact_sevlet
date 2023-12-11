package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;




public class Controladora {
    
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();
    
    public void  crearProducto(String nombreP, String descrip, String valorC, String iva, String valorV){
        Producto prod = new Producto();
        prod.setNombre(nombreP);
        prod.setDescripcion(descrip);
        prod.setValorCompra(valorC);
        prod.setIva(iva);
        prod.setValorVenta(valorV);
        
        controladoraPersis.crearProducto(prod);
    }

    public List<Producto> getProductos() {
        return (List<Producto>) controladoraPersis.getProductos();
    }

    public void borrarProd(int id) {
        controladoraPersis.borrarProd(id);
    }
    
    
    
}

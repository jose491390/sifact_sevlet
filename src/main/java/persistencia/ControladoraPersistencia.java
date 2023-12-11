package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;




public class ControladoraPersistencia {
    
    
    ClienteJpaController cienteJPA = new ClienteJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    FacturaJpaController facturaJPA = new FacturaJpaController();
    InventarioJpaController inventarioJPA = new InventarioJpaController();
    OrdenCompraJpaController ordenCompraJPA = new OrdenCompraJpaController();
    ProductoJpaController productoJPA = new ProductoJpaController();
    ProveedorJpaController ProveedorJPA = new ProveedorJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    
    public void crearProducto(Producto prod){
        productoJPA.create(prod);
    }

    public List<Producto> getProductos() {
       return productoJPA.findProductoEntities();
    }

    public void borrarProd(int id) {
        try {
            productoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int id) {
        return productoJPA.findProducto(id);
    }

    public void editarProd(Producto prodEdit) {
        try {
            productoJPA.edit(prodEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

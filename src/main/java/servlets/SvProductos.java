package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Producto;

@WebServlet(name = "SvProductos", urlPatterns = {"/SvProductos"})
public class SvProductos extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Producto> listaProductos = new ArrayList<Producto>();

        listaProductos = control.getProductos();

        HttpSession miseccion = request.getSession();
        miseccion.setAttribute("listaProductos", listaProductos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Productos.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreP = request.getParameter("nombre");
        String descrip = request.getParameter("descripcion");
        String valorC = request.getParameter("precioCompra");
        String iva = request.getParameter("iva");
        String valorV = request.getParameter("precioventa");

        control.crearProducto(nombreP, descrip, valorC, iva, valorV);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

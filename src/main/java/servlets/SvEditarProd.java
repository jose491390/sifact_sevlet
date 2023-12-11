/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Producto;

/**
 *
 * @author ISABELLA
 */
@WebServlet(name = "SvEditarProd", urlPatterns = {"/SvEditarProd"})
public class SvEditarProd extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Producto prod = control.traeraproducto(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("usuEditar", prod);
        
        response.sendRedirect("Editar.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreP = request.getParameter("nombre");
        String descrip = request.getParameter("descripcion");
        String valorC = request.getParameter("precioCompra");
        String iva = request.getParameter("iva");
        String valorV = request.getParameter("precioventa");
        
        Producto prodEdit = (Producto) request.getSession().getAttribute("usuEditar");
        prodEdit.setNombre(nombreP);
        prodEdit.setDescripcion(descrip);
        prodEdit.setValorCompra(valorC);
        prodEdit.setIva(iva);
        prodEdit.setValorVenta(valorV);
        
        control.editarProd(prodEdit);
        
        response.sendRedirect("SvProductos");
        
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

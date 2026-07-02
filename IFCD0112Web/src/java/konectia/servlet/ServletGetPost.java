/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package konectia.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Julen Profe
 */
@WebServlet(name = "ServletGetPost", urlPatterns = {"/ServletGetPost"})
public class ServletGetPost extends HttpServlet {

    int contador = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ServletGetPost</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Mi primer Servlet que está en " + request.getContextPath() + "</h1>");
//            out.println("<p>Dame veneno que quiero moril</p>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        request.getRequestDispatcher("main.html").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("nombrePavo");
            String victima = request.getParameter("victima");
            String nada = request.getParameter("estenoexiste");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet doGet ServletGetPost</title>");
            out.println("<link rel='stylesheet' href='resources/css/apuntesjsfetiq.css'/>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Mi primer Servlet que está en " + request.getContextPath() + "</h1>");
            out.println("<h1>Hola " + nombre + " ¿por qué has matado a " + victima + "?</h1>");
            out.println("<p>He llegado aquí desde una llamada <strong>GET</strong></p>");
            out.println("<p><a href='index.html'>Volver</a></p>");
            out.println("<br><p><small>Número de visitas: " + ++contador + "</small></p>");
            out.println("</body>");
            out.println("</html>");
        }
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("nombrePavo");
            String victima = request.getParameter("victima");
            String nada = request.getParameter("estenoexiste");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dePost ServletGetPost</title>");
            out.println("<link rel='stylesheet' href='resources/css/apuntesjsfetiq.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mi primer Servlet que está en " + request.getContextPath() + "</h1>");
            out.println("<h2>Hola " + nombre + " ¿por qué has matado a " + victima + "?</h2>");
            out.println("<p>He llegado aquí desde una llamada <strong>POST</strong></p>");
            out.println("<p><a href='index.html'>Volver</a></p>");
            out.println("<br><p><small>Número de visitas: " + ++contador + "</small></p>");
            out.println("</body>");
            out.println("</html>");
        }
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

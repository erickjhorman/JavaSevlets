
package Sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Sevlet", urlPatterns = {"/Sevlet"})
public class Sevlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            String[] tecnologias = request.getParameterValues("tecnologia");
            String genero = request.getParameter("genero");
            String ocupacion = request.getParameter("ocupacion");
            String[] musica = request.getParameterValues("musica");
            String comentario = request.getParameter("comentario");
            
            //Montrez le information a le client
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sevlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Paramettos procesados por el sevlet :</h1>");
            out.println("<table border='1'>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("usuario");
            out.println("</td>");
            out.println("<td>");
            out.println(usuario);
            out.println("<td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("Password");
            out.println("</td>");
            out.println("<td>");
            out.println(password);
            out.println("<td>");
            out.println("</tr>");
            
             out.println("<tr>");
            out.println("<td>");
            out.println("Tecnologias");
            out.println("</td>");
            out.println("<td>");
            for (String tecnologia : tecnologias) {
                out.println(tecnologia);
                 out.println(" / ");
            }
            out.println("<td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("Genero");
            out.println("</td>");
            out.println("<td>");
            out.println(genero);
            out.println("<td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("Occupac&oacute;n");
            out.println("</td>");
            out.println("<td>");
            out.println(ocupacion);
            out.println("<td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("M&uacute;sica favorita ");
            out.println("</td>");
            out.println("<td>");
            if(musica != null){
                for (String m : musica) {
                    out.println(m);
                    out.println(" / ");
                }
 
            }
            out.println("<td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("comentario");
            out.println("</td>");
            out.println("<td>");
            out.println(comentario);
            out.println("<td>");
            out.println("</tr>");            
            
            out.println("</body>");
            out.println("</html>");
        }
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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the writer to write the HTML output
        PrintWriter out = response.getWriter();

        // Write the HTML form
        out.println("<form method='post'>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

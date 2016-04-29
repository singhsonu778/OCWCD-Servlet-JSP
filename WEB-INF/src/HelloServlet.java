import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>HelloServlet</title>");
        out.println("<link href=\"favicon.ico\" rel=\"icon\" type=\"image/x-icon\"/></head>");
        out.println("<body><h1>HelloServlet response!!!</h1>");
        out.println("</body></html>");
	}
}
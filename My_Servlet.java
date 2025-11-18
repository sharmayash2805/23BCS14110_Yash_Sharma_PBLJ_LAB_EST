import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class MyServlet extends HttpServlet {
    @Override
    public void init(){System.out.println("init() executed");}
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Hello from service() method</h2>");
        System.out.println("service() executed");
    }
    @Override
    public void destroy() {
        System.out.println("destroy() executed");
    }
}

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.Writer;

public class HelloWorld extends javax.servlet.http.HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        // 初始化
        message="<h1> Hello, First Servlet! </h1>";
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doGet");
        response.setContentType("text/html");
        Writer writer = response.getWriter();
        writer.write(message);
    }
}

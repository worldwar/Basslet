package bananafish.worldwar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {
		String name = req.getParameter("name");
        resp.getOutputStream().write("This is Hello page.".getBytes());
		byte[] bytes = name.getBytes();
		resp.getOutputStream().write(bytes);
    }
}
package bananafish.worldwar;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/19/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Login extends HttpServlet{
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	resp.getOutputStream().write("Hello World.".getBytes());
}
}

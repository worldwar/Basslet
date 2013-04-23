package bananafish.worldwar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/24/13
 * Time: 12:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class HomeService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println("---"+username+"----");
		req.setAttribute("username", username);
		getServletContext().setAttribute("username", username);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
	}
}

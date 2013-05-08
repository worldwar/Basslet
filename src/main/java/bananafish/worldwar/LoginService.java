package bananafish.worldwar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/24/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginService extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(verifyLogin(username, password)){
//			getServletContext().setAttribute("username", username);
//			resp.sendRedirect("HomeService");
//			req.getSession().setAttribute("username", username);
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else {
			resp.sendRedirect("login.html");
		}
	}

	private boolean verifyLogin(String username, String password) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(getServletContext().getResourceAsStream("/users.txt")));
		while (true)
		{
			String line = reader.readLine();
			if(line == null)return false;
			String[] words = line.split(",");
			for(String word : words)
			{
				System.out.println("-----" + word + "----");
			}
			if(words.length != 2)continue;
			if(words[0].equals(username)){
				if(words[1].equals(password))return true;
				else return false;
			}
		}
	}
}

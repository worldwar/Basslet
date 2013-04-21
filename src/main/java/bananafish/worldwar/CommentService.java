package bananafish.worldwar;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/21/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommentService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig= getServletConfig();
		ServletContext context = servletConfig.getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("comment.html");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String comment = req.getParameter("comment");

		PrintWriter writer = resp.getWriter();
		writer.println("<body style=\"height: 100%\">\n");
		writer.println("<div style=\"position: relative;top:50%;text-align: center\">");
		writer.print(comment);
		writer.print("</div>");
		writer.print("</body>");
	}
}

package bananafish.worldwar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/20/13
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class OnlineCounterService extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		int count = OnlineCounter.count();
		System.out.println("online message.");
		String countInfo = "Current Online Count : " + String.valueOf(count);
		PrintWriter writer = response.getWriter();
		writer.println(countInfo);
	}
}

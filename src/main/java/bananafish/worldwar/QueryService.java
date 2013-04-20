package bananafish.worldwar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/20/13
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class QueryService extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset:UTF-8");

		String ipAddress = request.getRemoteAddr();
		String addressInfo = "Your IP Address is : " + ipAddress;

		DateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String time = format.format(new Date());
		String timeInfo = "The time you login in is : " + time;

		String query = request.getQueryString();
		String queryInfo = "You want to query : " + query;
		PrintWriter writer = response.getWriter();
		writer.println(addressInfo);
		writer.println(timeInfo);
		writer.print(queryInfo);
	}
}

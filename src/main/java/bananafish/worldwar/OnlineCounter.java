package bananafish.worldwar;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/20/13
 * Time: 11:59 PM
 * To change this template use File | Settings | File Templates.
 */
@WebListener
public class OnlineCounter implements HttpSessionListener {

	private static int count;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		count++;
		System.out.println(count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		count--;
	}

	public static int count() {
		return count;
	}
}

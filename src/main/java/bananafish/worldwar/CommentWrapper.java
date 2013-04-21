package bananafish.worldwar;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/21/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommentWrapper extends HttpServletRequestWrapper {
	/**
	 * Constructs a request object wrapping the given request.
	 *
	 * @throws IllegalArgumentException if the request is null
	 */
	public CommentWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String rawValue = getRequest().getParameter(name);
		return handle(rawValue);
	}

	static String handle(String comment){
		String result = StringUtils.replace(comment, "[", "<");
		return StringUtils.replace(result, "]", ">");
	}
}

package bananafish.worldwar;

import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/21/13
 * Time: 11:10 PM
 * To change this template use File | Settings | File Templates.
 */
@WebFilter("/Comment")
public class CommentFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		CommentWrapper wrapper = new CommentWrapper((HttpServletRequest)request);
		chain.doFilter(wrapper, response);
	}

	@Override
	public void destroy() {
		//To change body of implemented methods use File | Settings | File Templates.
	}
}

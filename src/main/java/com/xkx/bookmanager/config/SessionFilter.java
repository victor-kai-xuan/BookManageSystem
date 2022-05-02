package com.xkx.bookmanager.config;

import com.xkx.bookmanager.mapper.ReaderMapper;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = { "/", "/index", "/admin/*", "/user/*", "/toChPwdPage" })
public class SessionFilter implements Filter {

	private ReaderMapper readerMapper;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
    	ServletContext servletContext = filterConfig.getServletContext();
    	WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
    	readerMapper = (ReaderMapper)ctx.getBean("readerMapper");

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpSession session = request.getSession();

		if (session.getAttribute("name") == null) {
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String username = ((UserDetails) principal).getUsername();
			String name = "管理员";
			if (!username.equals("admin")) {
				name = readerMapper.getReaderName(username);
			}

			session.setAttribute("name", name);
			session.setAttribute("username", username);
		}

		filterChain.doFilter(servletRequest, servletResponse);
	}

}

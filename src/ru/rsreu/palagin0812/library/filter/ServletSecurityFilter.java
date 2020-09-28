package ru.rsreu.palagin0812.library.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.library.servlet.comand.FreeCommandEnum;

/**
 * Servlet Filter implementation class ServletSecurityFilter
 */
@WebFilter(urlPatterns = { "/controller" }, servletNames = { "FrontController" })
public class ServletSecurityFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public ServletSecurityFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String command = req.getParameter("command");
		String page = req.getParameter("page");

		if (!(isFreePage(command) || isFreePage(page))) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher(Resourcer.getString("path.page.index"));
			dispatcher.forward(req, resp);
			return;
		}
		chain.doFilter(request, response);
	}

	//проверяет, доступна ли эта страница для перехода
	public boolean isFreePage(String page) {
		boolean free = false;
		try {
			FreeCommandEnum.valueOf(page.toUpperCase());
			free = true;
		} catch (Exception e) {
			free = false;
		}
		return free;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

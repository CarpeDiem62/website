package ru.rsreu.palagin0812.library.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.rsreu.palagin0812.library.servlet.comand.ActionCommand;
import ru.rsreu.palagin0812.library.servlet.comand.ActionFactory;
import ru.rsreu.palagin0812.library.tools.Directory;

public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	/**
	 * Process POST the request
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Process POST the request
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Process the request
	 * 
	 * @param request
	 *            - request client
	 * @param response
	 *            - response server
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = null;
		String directory = null;
		
		ActionFactory client = new ActionFactory();
		ActionCommand command = client.defineCommand(request);

		page = command.execute(request);
		directory = Directory.getDirectory(request);


		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(directory + page);

		dispatcher.forward(request, response);
	}
}

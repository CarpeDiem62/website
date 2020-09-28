package ru.rsreu.palagin0812.library.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Session {

	/**
	 * Sets the values of session
	 * 
	 * @param request
	 *            request client
	 * @param atribute
	 *            name atribute
	 * @param value
	 *            value atribute
	 */
	public static void setValuesSession(HttpServletRequest request, String atribute, String value) {

		HttpSession session = request.getSession();
		session.setAttribute(atribute, value);
	}

	public static Object getValueSession(HttpServletRequest request, String atribute) {
		HttpSession session = request.getSession();
		Object sessionAtribute = session.getAttribute(atribute);
		return sessionAtribute;
	}
}

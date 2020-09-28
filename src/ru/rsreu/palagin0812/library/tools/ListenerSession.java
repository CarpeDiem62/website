package ru.rsreu.palagin0812.library.tools;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.prutzkow.resourcebundledemo.Resourcer;

/**
 * Application Lifecycle Listener implementation class ListenerSession
 *
 */
@WebListener
public class ListenerSession implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public ListenerSession() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
	}

	/**
	 * Performs a change of activity in the database when a session is deleted
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		Object userInfo = arg0.getSession().getAttribute("UserId");

		if (userInfo != null) {
			String userId = userInfo.toString();
			String status = Resourcer.getString("sql.request.changeActivityOnFalse");
			LoginLogic.ChangeActivityStatus(userId, status);
		}
	}

}

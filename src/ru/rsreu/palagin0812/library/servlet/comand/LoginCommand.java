package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;
import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.data.entity.UsersPizza;
import ru.rsreu.palagin0812.library.tools.LoginLogic;
import ru.rsreu.palagin0812.library.tools.Session;

public class LoginCommand implements ActionCommand {
	private static final String PARAM_NAME_LOGIN = "name";
	private static final String PARAM_NAME_PASSWORD = "pass";
	private static UsersPizza user;

/*	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		String login = request.getParameter(PARAM_NAME_LOGIN);
		String pass = request.getParameter(PARAM_NAME_PASSWORD);

		user = LoginLogic.checkUser(login, pass);

		if (user != null) {

			page = Resourcer.getString("path.page.main");
			String status = Resourcer.getString("sql.request.changeActivityOnTrue");
			LoginLogic.ChangeActivityStatus(user.getId(), status);
			setSessionData(request);
		} else {
			request.setAttribute("errorLoginPassMessage", Resourcer.getString("message.loginerror"));
			page = Resourcer.getString("path.page.login");
		}
		return page;
	}
	*/
	
	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		String login = request.getParameter(PARAM_NAME_LOGIN);
		String pass = request.getParameter(PARAM_NAME_PASSWORD);

		user = LoginLogic.checkUser(login, pass);

		if (user != null) {

			page = Resourcer.getString("path.page.main");
			String status = Resourcer.getString("sql.request.changeActivityOnTrue");
			LoginLogic.ChangeActivityStatus(user.getId(), status);
			setSessionData(request);
		} else {
			request.setAttribute("errorLoginPassMessage", Resourcer.getString("message.loginerror"));
			page = Resourcer.getString("path.page.login");
		}
		return page;
	}

	private void setSessionData(HttpServletRequest request) {
		Session.setValuesSession(request, "name", user.getUserName());
		Session.setValuesSession(request, "UserPhone", user.getNumberPhone());
		Session.setValuesSession(request, "UserId", user.getId());
		Session.setValuesSession(request, "role", user.getGroup().toUpperCase());
		Session.setValuesSession(request, "UserPoint", String.valueOf(user.getPoint()));
	}

}
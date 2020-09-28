package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class ProfileCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

		DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		UserDAO points = factory.getUserDAO();
		String id = request.getParameter("id");
		Users user = points.loadUserInfo(id);
		request.setAttribute("user", user);

		String page = Resourcer.getString("path.page.profile");
		return page;
	}
}
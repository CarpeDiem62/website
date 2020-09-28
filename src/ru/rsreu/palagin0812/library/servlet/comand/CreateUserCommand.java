package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.UserTypeEnum;
import ru.rsreu.palagin0812.library.tools.Session;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class CreateUserCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		String role = Session.getValueSession(request, "role").toString();
		if (UserTypeEnum.ADMIN.toString().equals(role)) {

			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			String access = request.getParameter("access");

			DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
			UserDAO user = factory.getUserDAO();
			user.CreateUser(id, name, pass, access);

		}
		request.setAttribute("condition", "Пользователь добавлен");
		page = Resourcer.getString("path.page.main");

		return page;
	}
}
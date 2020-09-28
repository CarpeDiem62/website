package ru.rsreu.palagin0812.library.servlet.comand;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class LoadListUsersCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

		DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		UserDAO points = factory.getUserDAO();

		List<Users> list = points.ListUserAll();
		request.setAttribute("list", list);

		String page = Resourcer.getString("path.page.user_list");
		return page;
	}
}
package ru.rsreu.palagin0812.library.servlet.comand;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.*;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;

public class CreationCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

		/*DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		BuildDAO build = factory.getBuildDAO();*/

		String page = Resourcer.getString("path.page.creation_build");

		return page;
	}
}
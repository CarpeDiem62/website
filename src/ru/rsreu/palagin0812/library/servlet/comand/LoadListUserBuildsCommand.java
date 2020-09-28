package ru.rsreu.palagin0812.library.servlet.comand;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.BuildConfig;
import ru.rsreu.palagin0812.library.tools.Session;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;

public class LoadListUserBuildsCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

		/*DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		BuildDAO builds = factory.getBuildDAO();

		String id = Session.getValueSession(request, "UserId").toString();
		List<BuildConfig> list = builds.ListBuildsUser(id);
		request.setAttribute("list", list);*/

		String page = Resourcer.getString("path.page.userBuilds");
		return page;
	}
}

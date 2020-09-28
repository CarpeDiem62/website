package ru.rsreu.palagin0812.library.servlet.comand;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.BuildConfig;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;

public class LoadListBuildsCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

		/*DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		BuildDAO builds = factory.getBuildDAO();
		List<BuildConfig> listBuilds = builds.ListBuildsAll();

		request.setAttribute("listBuilds", listBuilds);*/
		String page = Resourcer.getString("path.page.catalog");

		return page;
	}
}

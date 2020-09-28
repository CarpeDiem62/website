package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;

public class CreateBuildCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {

/*		String buildId = request.getParameter("id_build");
		String id = request.getParameter("id");
		String motherBoard = request.getParameter("motherboard");
		String processor = request.getParameter("processor");
		String videocard = request.getParameter("videocard");
		String ram = request.getParameter("ram");
		String datastorage = request.getParameter("datastorage");
		String powersypply = request.getParameter("powersypply");
		String casing = request.getParameter("casing");
		String comment = request.getParameter("comment");

		DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		BuildDAO build = factory.getBuildDAO();
		build.CreteBuild(buildId, id, processor, casing, datastorage, powersypply, ram, motherBoard, videocard,
				comment);

		request.setAttribute("condition", "—борка добавлена");*/
		String page = Resourcer.getString("path.page.main");

		return page;
	}
}
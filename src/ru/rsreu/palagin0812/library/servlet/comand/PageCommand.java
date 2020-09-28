package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;
import com.prutzkow.resourcebundledemo.Resourcer;

public class PageCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page;
		page = request.getParameter("page");

		return page + Resourcer.getString("path.page.fileExtention");
	}

}

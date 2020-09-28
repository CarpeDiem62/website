package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

public class EmptyCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {
		String page = Resourcer.getString("path.page.main");
		return page;
	}
}

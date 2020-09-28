package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
	ActionCommand current = new EmptyCommand();

	public ActionCommand defineCommand(HttpServletRequest request) {

		String action = request.getParameter("command");
		String page = request.getParameter("page");

		if (action == null || action.isEmpty()) {
			if (page != null) {
				ReturnEnum("page");
			}
		} else {
			ReturnEnum(action);
		}
		return current;
	}

	public ActionCommand ReturnEnum(String command) {
		try {
			CommandEnum currentEnum = CommandEnum.valueOf(command.toUpperCase());
			current = currentEnum.getCurrentCommand();
		} catch (Exception e) {
		}

		return current;
	}
}
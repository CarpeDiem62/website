package ru.rsreu.palagin0812.library.servlet.comand;

import javax.servlet.http.HttpServletRequest;
import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.UserTypeEnum;
import ru.rsreu.palagin0812.library.tools.Session;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class DeleteCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		// извлечение из запроса логина и пароля

		String role = Session.getValueSession(request, "role").toString();
		if (UserTypeEnum.ADMIN.toString().equals(role)) {

			String type = request.getParameter("type");
			String id = request.getParameter("id");

			DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
			switch (DeleteEnum.valueOf(type.toUpperCase())) {
			case USER:
				String selfId = request.getSession().getAttribute("UserId").toString();
				if (!selfId.equals(id)) {
					UserDAO user = factory.getUserDAO();
					user.DeleteUser(id);
					request.setAttribute("condition", "Пользователь удален");
				} else
					request.setAttribute("condition", "Вы не можете удалить самого себя");
				break;

			case CONFIG:
				/*BuildDAO build = factory.getBuildDAO();
				build.DeleteBuild(id);
				request.setAttribute("condition", "Сборка удалена");*/
				break;
			}
		}
		page = Resourcer.getString("path.page.main");

		return page;
	}
}

package ru.rsreu.palagin0812.library.tools;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.data.entity.UsersPizza;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class LoginLogic {

	private static DAOFactory factory = null;
	private static UserDAO user = null;

	/**
	 * Checks the existence of the user by login and password
	 * 
	 * @param enterLogin
	 *            Login user
	 * @param enterPass
	 *            Password user
	 * @return object user
	 */
	public static UsersPizza checkUser(String enterLogin, String enterPass) {

		factory = DAOFactory.getInstance(DBType.ORACLE);
		user = factory.getUserDAO();

		return user.findUser(enterLogin, enterPass);
	}

	public static void ChangeActivityStatus(String parId, String SQLRequest) {
		factory = DAOFactory.getInstance(DBType.ORACLE);
		user = factory.getUserDAO();
		user.ChangeOfActivityStatus(parId, SQLRequest);
	}
}

package ru.rsreu.palagin0812.users.dataaccessobject;

import java.util.List;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.data.entity.UsersPizza;

public interface UserDAO {

	UsersPizza findUser(String login, String pass);
	List<Users> ListUserAll();
	void ChangeOfActivityStatus (String parId,  String parSQLRequest);
	void DeleteUser (String parId);
	void CreateUser (String parId, String parName, String parPass, String parAccess);
	Users loadUserInfo (String parId);
	void ChangeUserInfo (String parId, String parName, String parPass, String parAccess);
	String GetAccessUser (String parId);
	UsersPizza CreateNewUser (String parNumberPhone, String parPass, String parAccess);
}

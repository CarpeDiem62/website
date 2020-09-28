package ru.rsreu.palagin0812.data.entity;

import java.util.List;

public class UsersPizza {

	private String Id;
	private String Group;
	private String NumberPhone;
	private String Pass;
	private String UserName;
	private int Actived;
	private int Point;

	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getGroup() {
		return Group;
	}

	public void setGroup(String group) {
		Group = group;
	}

	public String getNumberPhone() {
		return NumberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		NumberPhone = numberPhone;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getActived() {
		return Actived;
	}

	public void setActived(int actived) {
		Actived = actived;
	}

	public int getPoint() {
		return Point;
	}

	public void setPoint(int point) {
		Point = point;
	}
	
	  public UsersPizza(String id, String group, String numberPhone, String pass, String userName, int actived,
			int point) {
		super();
		Id = id;
		Group = group;
		NumberPhone = numberPhone;
		Pass = pass;
		UserName = userName;
		Actived = actived;
		Point = point;
	}

}

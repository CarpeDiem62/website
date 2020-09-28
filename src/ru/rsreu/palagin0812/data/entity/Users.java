package ru.rsreu.palagin0812.data.entity;


public class Users {
	
	
	  private String Id;
	  private String Name;
	  private String Pass;
	  private String Group;
	  int Actived;
	
	public Users(String id, String name, String pass, String group, int parActived) {
		this.Id = id;
		this.Name = name;
		this.Pass = pass;
		this.Group = group;
		this.Actived = parActived;

	}

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}

	public int getActived() {
		return Actived;
	}

	public void setActived(int actived) {
		Actived = actived;
	}



}

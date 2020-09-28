package ru.rsreu.palagin0812.data.entity;

public class Catalog {

	private String iD;
	private String name;
	private String description;
	private String components;
	private String pictureName;
	private int cost;
	
	public String getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getComponents() {
		return components;
	}

	public String getPictureName() {
		return pictureName;
	}

	public int getCost() {
		return cost;
	}
	
	public String getPictureNameForPath(String parPath) {
		return parPath+pictureName+".png";
	}
	
	public Catalog(String iD, String name, String description, String components, String pictureName, int cost) {
		super();
		this.iD = iD;
		this.name = name;
		this.description = description;
		this.components = components;
		this.pictureName = pictureName;
		this.cost = cost;
	}

}

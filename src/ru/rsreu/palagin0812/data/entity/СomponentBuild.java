package ru.rsreu.palagin0812.data.entity;

/**
 * Class entity component PC
 */
public class ÑomponentBuild {

	private String id;
	private String Name;
	private String Brand;

	public ÑomponentBuild(String id, String name, String brand) {
		super();
		this.id = id;
		Name = name;
		Brand = brand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

}

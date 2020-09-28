package ru.rsreu.palagin0812.data.entity;

/**
 * Class entity build
 */
public class BuildConfig {

	private String idBuild;
	private String userName;
	private String processor;
	private String motherBoadr;
	private String videoCards;
	private String ram;
	private String computerCase;
	private String storage;
	private String power;
	private String comment;

	public BuildConfig(String idBuild, String userName, String processor, String motherBoadr, String videoCars,
			String ram, String _case, String storage, String power, String comment) {
		super();
		this.idBuild = idBuild;
		this.userName = userName;
		this.processor = processor;
		this.motherBoadr = motherBoadr;
		this.videoCards = videoCars;
		this.ram = ram;
		this.computerCase = _case;
		this.storage = storage;
		this.power = power;
		this.comment = comment;
	}

	public String getIdBuild() {
		return idBuild;
	}

	public void setIdBuild(String idBuild) {
		this.idBuild = idBuild;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getMotherBoadr() {
		return motherBoadr;
	}

	public void setMotherBoadr(String motherBoadr) {
		this.motherBoadr = motherBoadr;
	}

	public String getVideoCards() {
		return videoCards;
	}

	public void setVideoCards(String videoCars) {
		this.videoCards = videoCars;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(String _case) {
		this.computerCase = _case;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}

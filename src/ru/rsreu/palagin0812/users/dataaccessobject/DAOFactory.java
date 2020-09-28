package ru.rsreu.palagin0812.users.dataaccessobject;

public abstract class DAOFactory {
	public static DAOFactory getInstance(DBType dbType) {
		DAOFactory result = dbType.getDAOFactory();
		return result;
	}

	public abstract UserDAO getUserDAO();
	public abstract CatalogDAO getCatalogdDAO();


}

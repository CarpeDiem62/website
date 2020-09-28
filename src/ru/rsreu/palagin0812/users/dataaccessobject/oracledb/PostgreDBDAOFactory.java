package ru.rsreu.palagin0812.users.dataaccessobject.oracledb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ru.rsreu.palagin0812.users.dataaccessobject.CatalogDAO;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class PostgreDBDAOFactory extends DAOFactory {
	private static volatile PostgreDBDAOFactory instance;
	private Connection connection;

	private PostgreDBDAOFactory() {
	}

	public static PostgreDBDAOFactory getInstance() throws ClassNotFoundException, SQLException {
		PostgreDBDAOFactory factory = instance;
		if (instance == null) {
			synchronized (PostgreDBDAOFactory.class) {
				instance = factory = new PostgreDBDAOFactory();
				factory.connected();
			}
		}
		return factory;
	}

	private void connected() throws ClassNotFoundException, SQLException {
		try {
			Locale.setDefault(Locale.ENGLISH);
			Context envCtx = (Context) (new InitialContext().lookup("java:comp/env"));
			DataSource ds = (DataSource) envCtx.lookup("jdbc/mypool"); 
			connection = ds.getConnection();

		} catch (NamingException e) {

			e.printStackTrace();
		}
	}

	@Override
	public UserDAO getUserDAO() {
		return new PostgreUserDAO(connection);
	}

	@Override
	public CatalogDAO getCatalogdDAO() {
		return new PostgreCatalogDAO(connection);
	}




	

}

package ru.rsreu.palagin0812.users.dataaccessobject;

import java.sql.SQLException;

import ru.rsreu.palagin0812.users.dataaccessobject.oracledb.PostgreDBDAOFactory;

public enum DBType {
	ORACLE {
		@Override
		public DAOFactory getDAOFactory() {
			DAOFactory postgreDBDAOFactory = null;
			try {
				postgreDBDAOFactory = PostgreDBDAOFactory.getInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return postgreDBDAOFactory;
		}
	},
	
	POSTGREE{
		@Override
		public DAOFactory getDAOFactory() {
			DAOFactory postgreDBDAOFactory = null;
			try {
				postgreDBDAOFactory = PostgreDBDAOFactory.getInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return postgreDBDAOFactory;
		}		
	};
	

	public static DBType getTypeByName(String dbType) {
		try {
			return DBType.valueOf(dbType.toUpperCase());
		} catch (Exception e) {
			throw new DBTypeException();
		}
	}

	public abstract DAOFactory getDAOFactory();

}

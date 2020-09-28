package ru.rsreu.palagin0812.users.dataaccessobject.oracledb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.Users;
import ru.rsreu.palagin0812.data.entity.UsersPizza;
import ru.rsreu.palagin0812.users.dataaccessobject.DBTypeException;
import ru.rsreu.palagin0812.users.dataaccessobject.UserDAO;

public class PostgreUserDAO implements UserDAO {

	private Connection connection;

	public PostgreUserDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public UsersPizza findUser(String login, String pass) {
		UsersPizza userInfo = null;
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {

			String sql = Resourcer.getString("sql.request.user.authorization");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, pass);
			result = preparedStatement.executeQuery();

			if (result.next()) {
				String id = result.getString(1);
				String group = result.getString(2);
				String numberPhone = result.getString(3);
				String userName = result.getString(4);
				String passUser = result.getString(5);
				int actived = result.getInt(6);
				int point = result.getInt(7);
				userInfo = new UsersPizza(id, group, numberPhone, userName, passUser, actived, point);
			}
		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		return userInfo;
	}
	
/*	@Override
	public	Users findUser(String login, String pass) {
		Users userInfo = null;
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {

			String sql = Resourcer.getString("sql.request.authorization");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, pass);
			result = preparedStatement.executeQuery();

			if (result.next()) {
				String id = result.getString(1);
				String loginUser = result.getString(2);
				String passUser = result.getString(3);
				String group = result.getString(4);
				int actived = result.getInt(5);
				userInfo = new Users(id, loginUser, passUser, group, actived);
			}
		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		return userInfo;
	}*/
	
	
	
	@Override
	public 	List<Users> ListUserAll (){
		List<Users> listUser = new ArrayList<Users>();
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.allUser");
			preparedStatement = connection.prepareStatement(sql);
			result = preparedStatement.executeQuery();
			while (result.next()) {
				String id = result.getString(1);
				String loginUser = result.getString(2);
				String passUser = result.getString(3);
				String group = result.getString(4);
				int actived = result.getInt(5);
				listUser.add(new Users(id, loginUser, passUser, group, actived));
			}
		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		return listUser;
	}
	
	


	@Override
	public void ChangeOfActivityStatus(String parId, String parSQLRequest) {

		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(parSQLRequest);
			preparedStatement.setInt(1, Integer.parseInt(parId));
			preparedStatement.executeUpdate();
			result = preparedStatement.getGeneratedKeys();

		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		
	}
	
	@Override
	public void DeleteUser(String parParameter) {

		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.delete.user");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parParameter);
			result = preparedStatement.executeQuery();

		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		
	}

	@Override
	public void CreateUser(String parId, String parName, String parPass, String parAccess) {
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.create.user");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parId);
			preparedStatement.setString(2, parName);
			preparedStatement.setString(3, parPass);
			preparedStatement.setString(4, parAccess);
			result = preparedStatement.executeQuery();

		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		
	}

	@Override
	public Users loadUserInfo(String parId) {
		ResultSet result = null;
		Users user = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.user.info");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parId);
			result = preparedStatement.executeQuery();

			if (result.next()) {
				String id = result.getString(1);
				String loginUser = result.getString(2);
				String passUser = result.getString(3);
				String group = result.getString(4);
				int actived = result.getInt(5);
				user =  new Users(id, loginUser, passUser, group, actived);
			}
			
		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		return user;
	}

	@Override
	public void ChangeUserInfo(String parId,String parName, String parPass, String parAccess) {
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.user.change");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parName);
			preparedStatement.setString(2, parPass);
			preparedStatement.setString(3, parAccess);
			preparedStatement.setString(4, parId);
			result = preparedStatement.executeQuery();

		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
	}

	@Override
	public String GetAccessUser(String parId) {
		ResultSet result = null;
		String access = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.user.access");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(parId));
			result = preparedStatement.executeQuery();

			if (result.next()) {
				access = result.getString(1);
			}
			
		} catch (SQLException e) {
			throw new DBTypeException(e.getMessage());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e) {
				throw new DBTypeException(e.getMessage());
			}
		}
		return access;
	}

	@Override
	public UsersPizza CreateNewUser(String parNumberPhone, String parPass, String parAccess) {
		// TODO Auto-generated method stub
		return null;
	}

}

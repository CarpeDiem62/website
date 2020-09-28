package ru.rsreu.palagin0812.users.dataaccessobject.oracledb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.prutzkow.resourcebundledemo.Resourcer;
import ru.rsreu.palagin0812.data.entity.Catalog;
import ru.rsreu.palagin0812.users.dataaccessobject.CatalogDAO;
import ru.rsreu.palagin0812.users.dataaccessobject.DBTypeException;


public class PostgreCatalogDAO implements CatalogDAO {

	
	private Connection connection;
	
	public PostgreCatalogDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Catalog> GetAllCatalog() {
		List<Catalog> listProduct = new ArrayList<Catalog>();
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.catalog.loadAll");
			preparedStatement = connection.prepareStatement(sql);
			result = preparedStatement.executeQuery();
			while (result.next()) {
				String iD = result.getString(1);
				String name = result.getString(2);
				String description = result.getString(3);
				String components = result.getString(4);
				String pictureName = result.getString(5);
				int cost = result.getInt(6);
				listProduct.add(new Catalog(iD, name, description, components, pictureName, cost));
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
		return listProduct;
	}

	@Override
	public List<Catalog> GetCatalogCount(int parCount) {
		List<Catalog> listProduct = new ArrayList<Catalog>();
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.catalog.loadCount");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, parCount);
			result = preparedStatement.executeQuery();
			while (result.next()) {
				String iD = result.getString(1);
				String name = result.getString(2);
				String description = result.getString(3);
				String components = result.getString(4);
				String pictureName = result.getString(5);
				int cost = result.getInt(6);
				listProduct.add(new Catalog(iD, name, description, components, pictureName, cost));
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
		return listProduct;
	}

	@Override
	public Catalog GetProductById(String parId) {
		Catalog productInfo = null;
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {

			String sql = Resourcer.getString("sql.request.catalog.loadById");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parId);
			result = preparedStatement.executeQuery();

			if (result.next()) {
				String iD = result.getString(1);
				String name = result.getString(2);
				String description = result.getString(3);
				String components = result.getString(4);
				String pictureName = result.getString(5);
				int cost = result.getInt(6);
				productInfo = new Catalog(iD, name, description, components, pictureName, cost);
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
		return productInfo;
	}

	@Override
	public int GetCostById(String parId) {
		int resultCost = 0;
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {

			String sql = Resourcer.getString("sql.request.catalog.getCost");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parId);
			result = preparedStatement.executeQuery();

			if (result.next()) {
				resultCost = result.getInt(1);
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
		return resultCost;
	}

	@Override
	public void AddProduct(String parName, String parDescription, int parCost, String Components,
			String parNamePicture) {
		ResultSet result = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = Resourcer.getString("sql.request.create.user");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parName);
			preparedStatement.setString(2, parDescription);
			preparedStatement.setInt(3, parCost);
			preparedStatement.setString(4, Components);
			preparedStatement.setString(4, parNamePicture);
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
	public boolean DeleteById(String parId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateById(String parId, String parName, String parDescription, int parCost, String Components,
			String parNamePicture) {
		// TODO Auto-generated method stub
		return false;
	}

}

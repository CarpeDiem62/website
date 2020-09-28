package ru.rsreu.palagin0812.users.dataaccessobject;

import java.util.List;
import ru.rsreu.palagin0812.data.entity.*;

public interface CatalogDAO {

	List<Catalog> GetAllCatalog();
	List<Catalog> GetCatalogCount(int parCount);
	Catalog GetProductById(String parId);
	int GetCostById(String parId);
	void AddProduct(String parName, String parDescription, int parCost, String Components, String parNamePicture);
	boolean DeleteById (String parId);
	boolean UpdateById (String parId, String parName, String parDescription, int parCost, String Components, String parNamePicture);
}

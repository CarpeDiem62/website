package ru.rsreu.palagin0812.library.servlet.comand;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.Catalog;
import ru.rsreu.palagin0812.users.dataaccessobject.CatalogDAO;
import ru.rsreu.palagin0812.users.dataaccessobject.DAOFactory;
import ru.rsreu.palagin0812.users.dataaccessobject.DBType;

public class MainCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		DAOFactory factory = DAOFactory.getInstance(DBType.ORACLE);
		CatalogDAO catalogDAO = factory.getCatalogdDAO();
		List<Catalog> listProduct = catalogDAO.GetCatalogCount(4);
		request.setAttribute("listCatalog", listProduct);

		String page = Resourcer.getString("path.page.main");
		return page;
	}

}

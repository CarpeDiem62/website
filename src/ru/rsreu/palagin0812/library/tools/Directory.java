package ru.rsreu.palagin0812.library.tools;

import javax.servlet.http.HttpServletRequest;

import com.prutzkow.resourcebundledemo.Resourcer;

import ru.rsreu.palagin0812.data.entity.UserTypeEnum;

public class Directory {

	/**
	 * Sets the directory for the user
	 * 
	 * @param request
	 *            request client
	 * @return path
	 */
	public static String getDirectory(HttpServletRequest request) {

		String directory = Resourcer.getString("path.directory.default");

		try {
			String role = request.getSession().getAttribute("role").toString();

			if (UserTypeEnum.ADMIN.toString().equals(role)) {
				directory = Resourcer.getString("path.directory.admin");
			}
			if (UserTypeEnum.USER.toString().equals(role)) {
				directory = Resourcer.getString("path.directory.user");
			}
		} catch (Exception e) {

		}
		return directory;
	}
}

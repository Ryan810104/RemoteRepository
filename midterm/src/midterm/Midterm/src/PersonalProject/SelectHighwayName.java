package midterm.Midterm.src.PersonalProject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/SelectHighwayName.do")
public class SelectHighwayName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HighwayDAO dao = new HighwayDAO();
		List<String> nums = new ArrayList<String>();
		String str = "<select name='highwayName' id='highwayName'>";
		try {
			nums = dao.findAllHighwayName();
			for (String highwayBean : nums) {
				str += "<option value='" + highwayBean + "'>" + highwayBean + "</option>";
			}
			str += "</select>";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

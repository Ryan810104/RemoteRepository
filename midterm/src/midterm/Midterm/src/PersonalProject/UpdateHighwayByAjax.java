package midterm.Midterm.src.PersonalProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SearchHighwayByAjax.do")
public class UpdateHighwayByAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HighwayDAO dao = new HighwayDAO();
		List<String> nums = new ArrayList<String>();
		String str = "<select name='namecode' id='code' onchange='selectId()'>";
		try {
			nums =dao.findAllHighwayCode();
			for(String code:nums) {
				str +="<option value='"+code+"'>"+code+"</option>";
			}
			str+="</select>";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(str);	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

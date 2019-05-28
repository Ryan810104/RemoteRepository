package midterm.Midterm.src.PersonalProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/QueryInformationForUpdateServlet.do")
public class QueryInformationForUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		request.setCharacterEncoding("UTF-8");
		String code1 = request.getParameter("namecode");
		System.out.println(code1);
		HighwayBean code2 = new HighwayBean();
		try {
			HighwayDAO dao = new HighwayDAO();
			 code2=dao.findByHighwayCode(code1);
			 request.setAttribute("query", code2);
			RequestDispatcher rd = request.getRequestDispatcher("UpdatePage.jsp");
			rd.forward(request, response);
			return;
		}catch(SQLException e) {
			errorMessage.put("exception", "資料庫存取錯誤:" + e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("UpdatePage.jsp");
		rd.forward(request, response);
		return;
	}

}

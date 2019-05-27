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


@WebServlet("/HighwayDelete.do")
public class DeleteHighwayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
          
    
        
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		request.setCharacterEncoding("UTF-8");
		String code = request.getParameter("ncode");
		if (code == null || code.trim().length() == 0) {
			errorMessage.put("code", "請輸入代碼");
		}
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/Deletepage.jsp");
			rd.forward(request, response);
			return;
		}
		HighwayDAO dao = new HighwayDAO();
		try {
			 dao.delete(code);
			response.sendRedirect("DeleteSucceed.jsp");
			return;
			
		}catch(SQLException e) {
			errorMessage.put("exception", "資料庫存取錯誤:" + e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("Deletepage.jsp");
		rd.forward(request, response);
		return;
	}

}

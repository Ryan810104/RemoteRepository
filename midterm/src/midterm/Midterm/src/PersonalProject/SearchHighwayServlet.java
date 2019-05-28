package midterm.Midterm.src.PersonalProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchHighway.do")
public class SearchHighwayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		request.setCharacterEncoding("UTF-8");
		String highwayname = request.getParameter("highwayName");
		if (highwayname == null || highwayname.trim().length() == 0) {
			errorMessage.put("highwayName", "�п�J��D�W");
		}

		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/SearchPage.jsp");
			rd.forward(request, response);
			return;
		}
//		HighwayBean HB = new HighwayBean();
//		HB.setHighwayName(highwayname);

		HighwayDAO dao = new HighwayDAO();
		try {
			List<HighwayBean> bean = dao.findByHighwayName(highwayname);
			String str=null;
			if(bean.size()==0) {
				session.setAttribute("SearchHighway", "�d�L�����");
			}else{
			str = "<table border='3'><tr><th width='200px'>��D�W</th><th width='200px'>��V</th><th width='200px'>�s��</th><th width='200px'>�N�X</th><th width='200px'>�_�I��y�D</th><th width='200px'>���I��y�D</th><th width='100px'>���O�ϳ]�w���{</th><th width='100px'>�p�����P��</th><th width='100px'>�j�����P��</th><th width='100px'>�p�����P��</th></tr>";
			for (HighwayBean highway : bean) {
				str += "<tr><td>" + highway.getHighwayName() + "</td><td>" + highway.getDirect() + "</td><td>"
						+ highway.getNumber() + "</td><td>" + highway.getCode() + "</td><td>" + highway.getStartPoint()
						+ "</td><td>" + highway.getEndPoint() + "</td><td>" + highway.getMileCharge() + "</td><td>"
						+ highway.getChargeSmallcar() + "</td><td>" + highway.getChargeBigcar() + "</td><td>"
						+ highway.getChargeTruck() + "</td></tr>";
			}
			str += "</table>";
			session.setAttribute("SearchHighway", str);
			}
			response.sendRedirect("SearchResult.jsp");
			return;
			
		} catch (SQLException e) {
			errorMessage.put("exception", "��Ʈw�s�����~:" + e.toString());
		}
		RequestDispatcher rd = request.getRequestDispatcher("SearchPage.jsp");
		rd.forward(request, response);
		return;

	}

}

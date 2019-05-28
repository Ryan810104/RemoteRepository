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
			errorMessage.put("highwayName", "請輸入國道名");
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
				session.setAttribute("SearchHighway", "查無此資料");
			}else{
			str = "<table border='3'><tr><th width='200px'>國道名</th><th width='200px'>方向</th><th width='200px'>編號</th><th width='200px'>代碼</th><th width='200px'>起點交流道</th><th width='200px'>迄點交流道</th><th width='100px'>收費區設定里程</th><th width='100px'>小型車牌價</th><th width='100px'>大型車牌價</th><th width='100px'>聯結車牌價</th></tr>";
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
			errorMessage.put("exception", "資料庫存取錯誤:" + e.toString());
		}
		RequestDispatcher rd = request.getRequestDispatcher("SearchPage.jsp");
		rd.forward(request, response);
		return;

	}

}

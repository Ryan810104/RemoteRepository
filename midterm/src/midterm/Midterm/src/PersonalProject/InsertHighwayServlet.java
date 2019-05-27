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


@WebServlet("/Highway.do")
public class InsertHighwayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		request.setCharacterEncoding("UTF-8");
		String highwayname = request.getParameter("nhighwayname");
		if (highwayname == null || highwayname.trim().length() == 0) {
			errorMessage.put("highwayName", "請輸入國道名");
		}
		String direct = request.getParameter("ndirect");
		if (direct == null || direct.trim().length() == 0) {
			errorMessage.put("direct", "請輸方向");
		}
		String number = request.getParameter("nnumber");
		if (number == null || number.trim().length() == 0) {
			errorMessage.put("number", "請輸入編號");
		}
		String code = request.getParameter("ncode");
		if (code == null || code.trim().length() == 0) {
			errorMessage.put("code", "請輸入代碼");
		}
		String startpoint = request.getParameter("nstartPoint");
		if (startpoint == null || startpoint.trim().length() == 0) {
			errorMessage.put("startpoint", "請輸入起點交流道");
		}
		String endpoint = request.getParameter("nendpoint");
		if (endpoint == null || endpoint.trim().length() == 0) {
			errorMessage.put("endpoint", "請輸入迄點交流道");
		}
		String milecharge = request.getParameter("nmilecharge");
		float  fmilecharge = 0F;
		if (milecharge != null && milecharge.trim().length() > 0) {
			try {
				fmilecharge=Float.parseFloat(milecharge.trim());
				}catch(Exception e) {
					System.out.println(e.toString());
			errorMessage.put("milecharge", "請輸入收費區設定里程且須為數字");
				}
		}
		
		String chargesmallcar = request.getParameter("nchargesmallcar");
		float  fchargesmallcar = 0F;
		if (chargesmallcar != null && chargesmallcar.trim().length() > 0) {
			try {
				fchargesmallcar=Float.parseFloat(chargesmallcar.trim());
				}catch(Exception e) {
			errorMessage.put("chargesmallcar", "請輸入小型車牌價且須為數字");
				}
		}
		String chargebigcar = request.getParameter("nchargebigcar");
		float  fchargebigcar = 0F;
		if (chargebigcar != null && chargebigcar.trim().length() > 0) {
			try {
				fchargebigcar=Float.parseFloat(chargebigcar.trim());
				}catch(Exception e) {
			errorMessage.put("chargebigcar", "請輸入大型車牌價且須為數字");
				}
		}
		String chargetruck = request.getParameter("nchargetruck");
		float  fchargetruck = 0F;
		if (chargetruck != null && chargetruck.trim().length() > 0) {
			try {
				fchargetruck=Float.parseFloat(chargetruck.trim());
				}catch(Exception e) {
			errorMessage.put("chargetruck", "請輸入聯結車牌價且須為數字");
				}
		}
		
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			return;
		}
		HighwayBean hb = new HighwayBean();
		hb.setHighwayName(highwayname);
		hb.setDirect(direct);
		hb.setNumber(number);
		hb.setCode(code);
		hb.setStartPoint(startpoint);
		hb.setEndPoint(endpoint);
		hb.setMileCharge(fmilecharge);
		hb.setChargeSmallcar(fchargesmallcar);
		hb.setChargeBigcar(fchargebigcar);
		hb.setChargeTruck(fchargetruck);
		
		try {
		HighwayDAO dao = new HighwayDAO();
		dao.insert(hb);
		session.setAttribute("HighwayBean", hb);
		response.sendRedirect("insertresult.jsp");
		return;
		}catch(SQLException e) {
			errorMessage.put("exception", "資料庫存取錯誤:" + e.toString());
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		return;
		
	}

}

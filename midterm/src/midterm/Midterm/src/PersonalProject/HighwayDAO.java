package midterm.Midterm.src.PersonalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class HighwayDAO implements IHighwayDAO {
	DataSource ds = null;

	public HighwayDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/HighwayDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	private static final String INSERT_STMT = "INSERT INTO Highway VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_STMT = "DELETE  Highway WHERE code like ?";
	private static final String GET_ONE_STMT = "SELECT * from Highway WHERE number = ?";
	private static final String GET_ALL_STMT = "SELECT * from Highway ORDER BY number";

	public void insert(HighwayBean highway) throws SQLException {

		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(INSERT_STMT);) {

			pstmt.setString(1, highway.getHighwayName());
			pstmt.setString(2, highway.getDirect());
			pstmt.setString(3, highway.getNumber());
			pstmt.setString(4, highway.getCode());
			pstmt.setString(5, highway.getStartPoint());
			pstmt.setString(6, highway.getEndPoint());
			pstmt.setFloat(7, highway.getMileCharge());
			pstmt.setFloat(8, highway.getChargeSmallcar());
			pstmt.setFloat(9, highway.getChargeBigcar());
			pstmt.setFloat(10, highway.getChargeTruck());
			pstmt.executeUpdate();
		}

	}

	private static final String UPDATE_STMT = "UPDATE Highway SET highway_name=?,direct=?,number=?,start_point=?,end_point=?,mile_charge=?,charge_smallcar=?,charge_bigcar=?,charge_truck=? WHERE code=?";

	public void update(HighwayBean code) throws SQLException {

		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(UPDATE_STMT);) {
			pstmt.setString(1, code.getHighwayName());
			pstmt.setString(2, code.getDirect());
			pstmt.setString(3, code.getNumber());
			pstmt.setString(4, code.getStartPoint());
			pstmt.setString(5, code.getEndPoint());
			pstmt.setFloat(6, code.getMileCharge());
			pstmt.setFloat(7, code.getChargeSmallcar());
			pstmt.setFloat(8, code.getChargeBigcar());
			pstmt.setFloat(9, code.getChargeTruck());
			pstmt.setString(10, code.getCode());
			pstmt.executeUpdate();
		}

	}

	public void delete(String code) throws SQLException {

		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(DELETE_STMT);) {
			pstmt.setString(1, code);
			pstmt.executeUpdate();
		}

	}

	public HighwayBean findByNumber(String number) throws SQLException {
		HighwayBean num = null;
		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(GET_ONE_STMT);) {
			pstmt.setString(1, number);
			try (ResultSet rs = pstmt.executeQuery();) {

				if (rs.next()) {

					num = new HighwayBean();
					num.setHighwayName(rs.getString("highway_name"));
					num.setDirect(rs.getString("direct"));
					num.setNumber(rs.getString("number"));
					num.setCode(rs.getString("code"));
					num.setStartPoint(rs.getNString("start_point"));
					num.setEndPoint(rs.getString("end_point"));
					num.setMileCharge(rs.getFloat("mile_charge"));
					num.setChargeSmallcar(rs.getFloat("charge_smallcar"));
					num.setChargeBigcar(rs.getFloat("charge_bigcar"));
					num.setChargeTruck(rs.getFloat("charge_truck"));
				}
			}
		}
		return num;
	}

	private static final String FIND_ALL_HigjWay_STMT_BY_CODE = "SELECT DISTINCT code from Highway";

	public List<String> findAllHighwayCode() throws SQLException {
		List<String> num = new ArrayList<>();
		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(FIND_ALL_HigjWay_STMT_BY_CODE);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				num.add(rs.getString("code"));
			}
		}
		return num;
	}

	private static final String FIND_ALL_HighWay_STMT = "SELECT DISTINCT highway_name from Highway";

	public List<String> findAllHighwayName() throws SQLException {
		List<String> num = new ArrayList<>();
		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(FIND_ALL_HighWay_STMT);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				num.add(rs.getString("highway_name"));
			}
		}
		return num;
	}

	private static final String FIND_BY_CODE = "SELECT * from Highway WHERE code=?";

	public HighwayBean findByHighwayCode(String code) throws SQLException {
		HighwayBean num = null;
		
		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(FIND_BY_CODE);) {
			pstmt.setString(1, code);
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					num = new HighwayBean();
					num.setCode(rs.getString("highway_name"));
					num.setDirect(rs.getString("direct"));
					num.setNumber(rs.getString("number"));
					num.setCode(rs.getString("code"));
					num.setStartPoint(rs.getString("start_point"));
					num.setEndPoint(rs.getString("end_point"));
					num.setMileCharge(rs.getFloat("mile_charge"));
					num.setChargeSmallcar(rs.getFloat("charge_smallcar"));
					num.setChargeBigcar(rs.getFloat("charge_bigcar"));
					num.setChargeTruck(rs.getFloat("charge_truck"));
					
				}
			}
		}
		return num;
	}

	private static final String FIND_BY_HIGHWAYNAME_STMT = "SELECT * from Highway WHERE highway_name=? ORDER BY highway_name";

	public List<HighwayBean> findByHighwayName(String highwayName) throws SQLException {
		HighwayBean num = null;
		List<HighwayBean> nums = new ArrayList<>();
		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(FIND_BY_HIGHWAYNAME_STMT);) {
			pstmt.setString(1, highwayName);
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					num = new HighwayBean();
					num.setHighwayName(rs.getString("highway_name"));
					num.setDirect(rs.getString("direct"));
					num.setNumber(rs.getString("number"));
					num.setCode(rs.getString("code"));
					num.setStartPoint(rs.getNString("start_point"));
					num.setEndPoint(rs.getString("end_point"));
					num.setMileCharge(rs.getFloat("mile_charge"));
					num.setChargeSmallcar(rs.getFloat("charge_smallcar"));
					num.setChargeBigcar(rs.getFloat("charge_bigcar"));
					num.setChargeTruck(rs.getFloat("charge_truck"));
					nums.add(num);
				}
				return nums;

			}
		}
	}

	public List<HighwayBean> getAll() throws SQLException {
		HighwayBean num = null;
		List<HighwayBean> nums = new ArrayList<>();
		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(GET_ALL_STMT);
				ResultSet rs = pstmt.executeQuery();) {

			while (rs.next()) {
				num = new HighwayBean();
				num.setHighwayName(rs.getString("highway_name"));
				num.setDirect(rs.getString("direct"));
				num.setNumber(rs.getString("number"));
				num.setCode(rs.getString("code"));
				num.setStartPoint(rs.getNString("start_point"));
				num.setEndPoint(rs.getString("end_point"));
				num.setMileCharge(rs.getFloat("mile_charge"));
				num.setChargeSmallcar(rs.getFloat("charge_smallcar"));
				num.setChargeBigcar(rs.getFloat("charge_bigcar"));
				num.setChargeTruck(rs.getFloat("charge_truck"));
				nums.add(num);
			}
		}
		return nums;
	}

	public void fileInput(String address) throws SQLException, IOException {

		BufferedReader br1 = new BufferedReader(new FileReader("C:/temp/data01.csv"));
		String insertStmt = "INSERT into Highway VALUES(?,?,?,?,?,?,?,?,?,?)";
		try (Connection conn = ds.getConnection(); PreparedStatement pstmt = conn.prepareStatement(insertStmt);) {

			String data1;
			br1.readLine();// 讓資料從表頭的下一行開始丟
			while ((data1 = br1.readLine()) != null) {

				String[] source = data1.split(",");
				pstmt.setString(1, source[0]);
				pstmt.setString(2, source[1]);
				pstmt.setString(3, source[2]);
				pstmt.setString(4, source[3]);
				pstmt.setString(5, source[4]);
				pstmt.setString(6, source[5]);
				pstmt.setFloat(7, Float.parseFloat(source[6]));
				pstmt.setFloat(8, Float.parseFloat(source[7]));
				pstmt.setFloat(9, Float.parseFloat(source[8]));
				pstmt.setFloat(10, Float.parseFloat(source[9]));
				pstmt.execute();
				// pstmt.addBatch();
				// countBatch++;
			}

		}
//		pstmt.close();
		br1.close();
	}

}

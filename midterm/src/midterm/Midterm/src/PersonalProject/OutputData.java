package midterm.Midterm.src.PersonalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OutputData {

	public static void main(String[] args) throws IOException {
		Connection conn = null;

		try {
			// BufferedReader br1 =new BufferedReader(new FileReader("C:/temp/data01.csv"));

			BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:/temp/data02.xml"));
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
			String qryStmt = "SELECT * FROM Highway";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();
			String data = "";
			bw1.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n ");
			bw1.write("<catalog>\n");

			while (rs.next()) {
				data = "<fileoutput>" + "\n" + "<highway_name>" + rs.getString(1).trim() + "</highway_name>" + "\n" + "<direct>"
						+ rs.getString(2).trim() + "</direct>" + "\n" + "<number>" + rs.getString(3).trim() + "</number>" + "\n"
						+ "<code>" + rs.getString(4).trim() + "</code>" + "\n" + "<start_point>"
						+ rs.getString(5).trim().replace("&", "&amp;") + "</start_point>" + "\n" + "<end_point>"
						+ rs.getString(6).trim().replace("&", "&amp;") + "</end_point>" + "\n" + "<mile_charge>"
						+ rs.getString(7).trim() + "</mile_charge>" + "\n" + "<charge_smallcar>" + rs.getString(8).trim() + "</charge_smallcar>"
						+ "\n" + "<charge_bigcar>" + rs.getString(9).trim() + "</charge_bigcar>" + "\n" + "<charge_truck>"
						+ rs.getString(10).trim() + "</charge_truck>" + "\n" + "</fileoutput>";
				bw1.write(data);
				System.out.println(data);
				bw1.newLine();
				// data = "";
			}
			bw1.write("</catalog>");

			bw1.close();
			rs.close();
			pstmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}

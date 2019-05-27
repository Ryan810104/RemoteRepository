package midterm.Midterm.src.PersonalProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImportData {

	public static void main(String[] args) throws IOException {
		Connection conn = null;

		try {
			BufferedReader br1 = new BufferedReader(new FileReader("C:/temp/data01.csv"));
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
			String insertStmt = "INSERT into Highway VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertStmt);
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
			}

			pstmt.close();
			br1.close();
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

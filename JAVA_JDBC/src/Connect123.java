import java.sql.*;

public class Connect123 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jmh";
		String password = "1111";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int sno = rs.getInt("sno");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				System.out.println(sno + " " + name + " " + dept);
			}
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 연결 오류");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}

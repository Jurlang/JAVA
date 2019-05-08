import java.sql.*;
public class JDBC_ex02 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jmh";
		String password = "1111";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int sno = 7;
		String name = "개구리";
		String dept = "파충류";
		
		String sql = "insert into student values(?, ?, ?)";
		//String sql1 = "update student set dept = '국문' where sno = 5";
		//String sql2 = "delete from student where sno = 1";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sno);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}

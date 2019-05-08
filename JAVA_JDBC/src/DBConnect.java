import java.sql.*;
import java.util.ArrayList;

public class DBConnect {

	private DBConnect() {
	}

	private static DBConnect db = new DBConnect();

	public static DBConnect getInstance() {
		return db;
	}
	
//	DB 연결하는 함수
	private Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jmh";
		String password = "1111";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
// Student select 하는 함수
	public ArrayList<Student> select(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from student";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Student temp = new Student();
				temp.setSno(rs.getInt("sno"));
				temp.setName(rs.getString("name"));
				temp.setDept(rs.getString("dept"));
				list.add(temp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(conn, ps, rs);
		}
		
		return list;
	}
	
	public void insert(Student s) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into student(sno, name, dept) values(?,?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, s.getSno());
			ps.setString(2, s.getName());
			ps.setString(3,  s.getDept());
			ps.executeUpdate();
		}catch(Exception e) {}
		finally{
			dbClose(conn, ps);
		}
	}
	
	public void update(Student s) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update student set name = ?, dept = ? where sno = ?";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getDept());
			ps.setInt(3, s.getSno());
			ps.executeUpdate();
		}catch(Exception e) {}
		finally {
			dbClose(conn,ps);
		}
	}
	
	public void remove(int s) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "delete from student where sno = ?";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, s);
			ps.executeUpdate();
		}catch(Exception e) {}
		finally {
			dbClose(conn,ps);
		}
	}
	
	@SuppressWarnings("unused")
	private void dbClose(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception e) {}
	}
	private void dbClose(Connection conn, PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception e) {}
	}
}

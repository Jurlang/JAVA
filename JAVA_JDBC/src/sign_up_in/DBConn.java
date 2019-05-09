package sign_up_in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConn {
   private DBConn() {}
   private static DBConn dbConn = new DBConn();
   public static DBConn getInstance() {
      return dbConn;
   }
   private Connection getConnection() {
      Connection conn = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "jmh";
      String passwd = "1111";
      String driver = "oracle.jdbc.driver.OracleDriver";
      try {
         Class.forName(driver);//오라클 서버와 연결해주는 driver가 로딩된다는 의미
         conn = DriverManager.getConnection(url, user, passwd);
      }catch(Exception e) {
         e.printStackTrace();
      }
      return conn;
   }
   
   public ArrayList<Member> selectAll() {
      ArrayList<Member> list = new ArrayList<Member>();
      Connection conn = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      String sql = "select * from member";
      
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         rs = ps.executeQuery();
         while(rs.next()) {
            Member m = new Member();
            m.setId(rs.getString("id"));
            m.setPw(rs.getString("pw"));
            m.setName(rs.getString("name"));
            m.setAge(rs.getInt("age"));
            m.setTel(rs.getString("tel"));
            list.add(m);
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps, rs);
      }
      return list;
   }
   public Member selectOne(String id) {
      Member m = null;
      Connection conn = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      String sql = "select * from member where id = ?";
      
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, id);
         rs = ps.executeQuery();
         
         while(rs.next()) {
            m = new Member();
            m.setId(rs.getString("id"));
            m.setPw(rs.getString("pw"));
            m.setName(rs.getString("name"));
            m.setAge(rs.getInt("age"));
            m.setTel(rs.getString("tel"));
            
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps, rs);
      }
      return m;
   }
   
   public void insert(Member m) {
      Connection conn = null;
      PreparedStatement ps = null;
      String sql = "insert into member(id, pw, name, age, tel) values(?,?,?,?,?)";
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, m.getId());
         ps.setString(2, m.getPw());
         ps.setString(3, m.getName());
         ps.setInt(4, m.getAge());
         ps.setString(5, m.getTel());
         int n = ps.executeUpdate();
         if(n == 1)
            System.out.println("입력성공");
         else
            System.out.println("입력실패");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps);
      }
   }
   
   public void update(Member m) {
      Connection conn = null;
      PreparedStatement ps = null;
      String sql = "update member set pw=?, name=?, age=?, tel=? where id=?";
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, m.getPw());
         ps.setString(2, m.getName());
         ps.setInt(3, m.getAge());
         ps.setString(4, m.getTel());
         ps.setString(5, m.getId());
         int n = ps.executeUpdate();//쿼리에서 변경된 행이 몇개인가를 알려주는 변수
         if(n == 1)
            System.out.println("수정 성공");
         else
            System.out.println("수정 실패");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps);
      }
   }
   
   public void delete(String id) {
      Connection conn = null;
      PreparedStatement ps = null;
      String sql = "delect from member where id=?";
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, id);
         int n = ps.executeUpdate();
         if(n == 1)
            System.out.println("삭제 성공");
         else
            System.out.println("삭제 실패");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps);
      }
   }
   
   public int confirm(String id, String pw) {
      int n = -1;
      Connection conn = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      String sql = "select pw from member where id=?";
      try {
         conn = getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, id);
         rs = ps.executeQuery();
         if(rs.next()) {//이곳에 들어가지 않으면 아예 해당 아이디가 없음
            String dbPw=rs.getString("pw");
            if(dbPw.equals(pw))
               n=1;
            else //id에 해당하는 pw가 일치하지 않음
               n=0;
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         dbClose(conn, ps, rs);
      }
      return n;
   }
   
   private void dbClose(Connection conn, PreparedStatement ps, ResultSet rs) {
      try {
         if(rs != null)   rs.close();
         if(ps != null)   ps.close();
         if(conn != null)   conn.close();
      }catch(Exception e) {}
   }
   private void dbClose(Connection conn, PreparedStatement ps) {
      try {
         if(ps != null)   ps.close();
         if(conn != null) conn.close();
      }catch(Exception e)  {}
   }
}
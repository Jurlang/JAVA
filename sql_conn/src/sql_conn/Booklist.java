package sql_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
public class Booklist {
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	Connection con;
    public Booklist(){
    	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "madang";
        String passwd = "madang";
        String driver = "oracle.jdbc.driver.OracleDriver";

        try{
            Class.forName(driver);
            System.out.println("����̹� �ε� ����");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            System.out.println("DB ���� �غ� ... " );
            con = DriverManager.getConnection(url, user, passwd);
            System.out.println("DB ���� ���� !");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void all_Book() {
    	String query = "Select * from Book";
    	try {
    		stmt = con.createStatement();
    		rs = stmt.executeQuery(query);
    		System.out.println("Book no\tbook name\t\tpublisher\tprice");
    		while(rs.next()) {
    			System.out.print("\t" + rs.getInt(1));
    			System.out.print("\t" + rs.getString(2));
    			System.out.print("\t" + rs.getString(3));
    			System.out.println("\t" + rs.getInt(4));
    		}
    		stmt.close();
    		rs.close();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    private void insert_Book(int no, String name, String pub, int price) {
    	String query = "insert into Book values (?,?,?,?)";
    	try {
			ps = con.prepareStatement(query);
			ps.setInt(1, no);
			ps.setString(2, name);
			ps.setString(3, pub);
			ps.setInt(4, price);
			ps.executeQuery();
			System.out.println("�Է� �Ϸ�");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�Է� ����");
			e.printStackTrace();
		}
    }
    
    private void delete_Book(int no) {
    	String query = "delete from Book where bookid = ?";
    	try {
			ps = con.prepareStatement(query);
			ps.setInt(1, no);
			ps.executeQuery();
			System.out.println("���� �Ϸ�");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
			e.printStackTrace();
		}
    }
    
    private void delete_Book(String name){
    	String query = "delete from Book where bookname = ?";
    	try {
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.executeQuery();
			System.out.println("���� �Ϸ�");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
			e.printStackTrace();
		}
  
    }
    
    public static void main(String args[]) {
    	Booklist so = new Booklist();
    	so.all_Book();
    	System.out.println("12 ggg ������ 100000 �� �Է�");
    	so.insert_Book(12, "ggg", "������", 10000000);
    	so.all_Book();
    	System.out.println("���̵� 12 �� ģ���� ����");
    	so.delete_Book(12);
    	so.all_Book();
    	System.out.println("12 ggg ������ 100000 �� �Է�");
    	so.insert_Book(12, "ggg", "������", 10000000);
    	so.all_Book();
    	System.out.println("�̸��� ggg �� ģ���� ����");
    	so.delete_Book("ggg");
    	so.all_Book();
    }
}

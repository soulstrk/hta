package connect.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "scott", "soul4310");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public static void closeConn(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void closeConn(ResultSet rs) {
		try {
			if(rs!=null) rs.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void closeConn(PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void closeConn(Connection conn) {
		try {
			if(conn!=null) conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

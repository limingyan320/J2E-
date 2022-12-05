package utils;

import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;

public class DBUtils {
	
    /**
     * 获取数据库连接
     * @return Connection对象
     */
    public static Connection getConnection(){
    	String dbUserName = "root";
    	String dbUserPasswd = "645545qw";
    	String dbURL = "jdbc:mysql://localhost:3306/studentinfomanagement?&useUnicode=true&characterEncoding=UTF8&serverTimezone=UTC";
    	Connection conn = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		conn = (Connection) DriverManager.getConnection(dbURL,dbUserName,dbUserPasswd);
    	} catch (ClassNotFoundException | SQLException e) {
    		e.printStackTrace();
    	} 
    	return conn;
    }
    
    /**
     * 关闭数据库连接
     * @param conn Connection对象
     */
    public static void closeConnection(Connection conn) {
		//判断conn是否为空
    	if(conn != null){
    		try {
				conn.close();//关闭数据库连接
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
    	}
	}
}

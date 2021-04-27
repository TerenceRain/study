package org.example.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

     private static MysqlDataSource ds = new MysqlDataSource();
    static {
        ds.setURL("jdbc:mysql://localhost:3306/servlet_blog");
        ds.setCharacterEncoding("UTF-8");
        ds.setUser("root");
        ds.setPassword("rW20000602");
        ds.setUseSSL(false);
    }
    public  static Connection getConnection() throws SQLException {


        Connection c = ds.getConnection();
        System.out.println(c);
        return c;
    }
    public static void close(Connection c, PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null){
            rs.close();
        }
        if (ps != null){
            ps.close();
        }
        if(c != null){
            c.close();
        }

    }
    public static  void  close(Connection c, PreparedStatement ps) throws SQLException {
        close(c, ps,null);
    }

}

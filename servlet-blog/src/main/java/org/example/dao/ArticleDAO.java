package org.example.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.example.model.Article;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    public static List<Article> query(int userId) throws SQLException {
        //jdbc查询关联的文章列表
        //1.创建连接Connection对象
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost:3306/servlet_blog");
        ds.setUser("root");
        ds.setPassword("rW20000602");
        ds.setUseSSL(false);
        Connection c = ds.getConnection();
//        System.out.println(c);
        //2.创建操作命令对象Statement
        String sql = "select id, title from article where user_id = ?";
        PreparedStatement ps =  c.prepareStatement(sql);
        ps.setInt(1,userId);
        //3.执行sql
        ResultSet rs = ps.executeQuery();
        List<Article> query = new ArrayList<>();
        //4.如果是查询操作，处理结果集
        while (rs.next()){//移动到下一行，返回true就是有数据
            int id = rs.getInt("id");
            String title = rs.getString("title");
            //每一行数据对应一个对象
            Article a = new Article();
            a.setId(id);
            a.setTitle(title);
            query.add(a);
        }
        //5.释放资源
        rs.close();
        ps.close();
        c.close();
        return query;
    }

    public static void main(String[] args) throws SQLException{
         List<Article> a = query(1);
        System.out.println(query(1));
    }
}

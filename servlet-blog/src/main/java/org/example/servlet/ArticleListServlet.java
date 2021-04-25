package org.example.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.JSONResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet
public class ArticleListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        JSONResponse json = new JSONResponse();
        //业务：查询文章列表（简化版本：查所有文章）
        //数据库查询所有文章数据，返回
        try {
            //TOdo 需要只查询当前用户的文章
           //todo 只有这一行是业务代码，每个接口不同
            List<Article> query = ArticleDAO.query(1);
           //业务处理成功：
            json.setSuccess(true);
           json.setData(query);

        }catch (Exception e){
            e.printStackTrace();
            //业务处理失败：返回false + 错误码 + 错误信息
            //TOdo
            json.setCode("ERR");
            json.setMessage("系统出错，请联系系统管理员");
        }
        ObjectMapper m = new ObjectMapper();
        String s = m.writeValueAsString(json);
        resp.getWriter().println(s);

    }
}

package org.example.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
*servlet的作用：
 * 解析HTTP请求，返回HTTP响应，以代码方式提供服务资源
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    //所有servlet代码，都有比较固定的处理
        req.setCharacterEncoding("UTF-8");//请求，响应的处理格式
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        //模拟响应一个动态的网页， 可以从其他地方获取，比如数据库
        String name = "张三";
        //通过response 对象获取输出流， 输出字符串为body内容
        PrintWriter pw = resp.getWriter();
        pw.println("<h2>欢迎你" + name  + " </h2>");
    }
}

package servlet;

import java.io.IOException;
import java.net.URL;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
 
public class AddLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String payment = req.getParameter("payment");//サーブレットで数値を受け取るにはStringから変換するしかない
        int payment2 = Integer.parseInt(payment);
        String comment = req.getParameter("comment");
        String shuushi=req.getParameter("shuushi");
        LinkData data = new LinkData(payment2,comment,shuushi);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}
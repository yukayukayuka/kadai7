package servlet;

import java.io.IOException;
 
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
        LinkData data = new LinkData(shuushi,payment2,comment);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
System.out.println("shuushi,payment2,comment: "+shuushi+", "+payment2+", "+comment);
        try {	
            manager.makePersistent(data);
System.out.println("data: "+data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}
package dkt.edu.servletcore;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiontest")
public class SessionTestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String command = request.getParameter("comm");

        HttpSession session = request.getSession();
        String sessionId = session.getId();

        out.print(sessionId);

        if(session.isNew()){
            out.print("세션이 생성됨");
        }else{
            out.print("세션이 추출됨");
        }

        session.setAttribute("sessionName", "yongSession");
        String str = (String)session.getAttribute("sessionName");
        out.print(str);



    }
}

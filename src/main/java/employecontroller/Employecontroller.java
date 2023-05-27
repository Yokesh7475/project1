package employecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employedao.Employedao;
import employedto.Employedto;

@WebServlet("/login")
public class Employecontroller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String email = req.getParameter("emailid");
		String pragiee = req.getParameter("pragiee");
		int password = Integer.parseInt(pragiee);
		
		Employedao dao= new Employedao();
		Employedto e1 = dao.login(email);
		if(e1 !=null) {
			if(pragiee.equals(e1.getPwd())) {
				//resp.getWriter().printf("<h1>Welcome to home page</h1>");
				resp.sendRedirect("https://www.facebook.com/");
				}else {
					resp.getWriter().print("<h1>enter proper password</h1>");
					RequestDispatcher rd= req.getRequestDispatcher("login.html");
					rd.include(req, resp);
					}
		}else {
			resp.getWriter().print("<h1>account not found,please signup</h1><a href='signup.html'>click here to signup</a>");
		}
	}
}

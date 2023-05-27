package employecontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employedao.Employedao;
import employedto.Employedto;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String name = req.getParameter("ename");
		String email = req.getParameter("emailid");
		String pwd = req.getParameter("pwd");
		
		Employedto dto = new Employedto();
		dto.setEname(name);
		dto.setEmail(email);
		dto.setPwd(pwd);
		
		Employedao dao = new Employedao();
		dao.signup(dto);

		//System.out.println(name+" "+email+" "+pwd);
		
	}
}

package com.sayhanabi.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sayhanabi.factory.DaoFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8") ;
		request.setCharacterEncoding("utf-8") ;
		String username = request.getParameter("username");     
        String password = request.getParameter("password");  
        HttpSession session =  request.getSession();
        int id = -1;
        System.out.println(username);
        System.out.println(password);
        
        if(( id = DaoFactory.getManager().authenticationManager(username, password) ) > -1)
        {
        	request.setAttribute("id",id);
            response.sendRedirect("pages/manager/manager.jsp") ;
        }
        else
        {
            session.setAttribute("message", "用户名或密码不匹配。");
            response.sendRedirect("pages/message/fail.jsp") ;
        }

//        //设置编码格式  
//        response.setContentType("text/html;charset=GB2312");
//        
//        //返回html页面  
//        response.getWriter().println("<html>");  
//        response.getWriter().println("<head>");     
//        response.getWriter().println("<title>登录信息</title>");      
//        response.getWriter().println("</head>");
//        response.getWriter().println("<body>");
//        if(username.equals("Season02") && password.equals("651234"))
//        	response.getWriter().println("Welcome [" + username + "] user login successful!!!");  
//        else
//        	response.getWriter().println("err!!!");
//        response.getWriter().println("</body>");    
//        response.getWriter().println("</html>");
	}

}

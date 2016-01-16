package com.sayhanabi.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String username = request.getParameter("username");     
        String password = request.getParameter("password");        
          
        //�������˴�ӡ��Ϣ  
        //System.out.println("username=" + username);  
        //System.out.println("password=" + password);  
        //���ñ����ʽ  
        response.setContentType("text/html;charset=GB2312");  
          
        //����htmlҳ��  
        response.getWriter().println("<html>");  
        response.getWriter().println("<head>");     
        response.getWriter().println("<title>��¼��Ϣ</title>");      
        response.getWriter().println("</head>");    
        response.getWriter().println("<body>");     
        response.getWriter().println("��ӭ[" + username + "]�û���¼�ɹ�������");    
        response.getWriter().println("</body>");    
        response.getWriter().println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}

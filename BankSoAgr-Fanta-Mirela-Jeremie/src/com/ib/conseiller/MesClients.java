package com.ib.conseiller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ib.beans.UserCons;

/**
 * Servlet implementation class MesClients
 */
@WebServlet("/MesClients")
public class MesClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PRIVATECONSULT_PATH = "/WEB-INF/Conseiller/listedesclients.jsp";	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MesClients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( PRIVATECONSULT_PATH ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int advisor_id= Integer.parseInt(request.getParameter("Advisor_ID"));
		UserCons.See_Account(advisor_id);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Conseiller/listedesclients.jsp" ).forward( request, response );
	}

}

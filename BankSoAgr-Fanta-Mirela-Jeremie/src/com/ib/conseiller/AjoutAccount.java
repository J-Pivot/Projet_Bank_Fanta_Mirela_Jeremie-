package com.ib.conseiller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ib.beans.UserCons;
import com.ib.client.Personn;

/**
 * Servlet implementation class AjoutAccount
 */
@WebServlet("/AjoutAccount")
public class AjoutAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Conseiller/ajoutaccount.jsp" ).forward( request, response );
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		float balance = Float.parseFloat(request.getParameter("account_balance"));
		int defaut= Integer.parseInt(request.getParameter("account_is_default"));

				
		UserCons.Ajout_Account(request.getParameter("External_ID"),request.getParameter("firstname"),request.getParameter("lastname"),request.getParameter("email") ,request.getParameter("password") , request.getParameter("dob"),request.getParameter("phone"));
		UserCons.Ajout_Account_Customer(request.getParameter("account_customer_id"),balance,request.getParameter("account_type"),defaut);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Conseiller/ajoutaccount.jsp" ).forward( request, response );
	}

}

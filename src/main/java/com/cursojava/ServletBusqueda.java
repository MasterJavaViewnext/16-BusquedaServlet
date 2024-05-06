package com.cursojava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ServletBusqueda
 */
public class ServletBusqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBusqueda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("name");
		HttpSession session = request.getSession();
		
		switch (parametro.toLowerCase()){
		case "coches": {
			session.setAttribute("map", ListaEnlaces.COCHES);
			break;
		}case "juegos": {
			session.setAttribute("map", ListaEnlaces.JUEGOS);
			break;
		}case "ropa": {
			session.setAttribute("map", ListaEnlaces.ROPA);
			break;
		}
		default:
			session.setAttribute("map", null);
		}
		response.sendRedirect("views/default.jsp");
	}

}

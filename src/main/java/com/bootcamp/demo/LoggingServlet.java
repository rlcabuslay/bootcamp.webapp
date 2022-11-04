package com.bootcamp.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class LoggingServlet
 */
@WebServlet("/LoggingServlet")
public class LoggingServlet extends HttpServlet {
    
    /**
     * 
     */
    private static final long serialVersionUID = 3860605501830809734L;
    private static final Logger LOGGER = LogManager.getLogger(LoggingServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoggingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    final String paymentMethod = request.getParameter("paymentMethod");
	    final String status = request.getParameter("status");
		LOGGER.info("action=process_payment, payment_method={}, status={}", paymentMethod, status);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

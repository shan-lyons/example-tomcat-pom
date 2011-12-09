package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleServlet extends HttpServlet {

	private static final long serialVersionUID = 2361935185838933876L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		super.doGet(request, response);
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>Example Servlet!</body></html>");
		writer.flush();
	}
}

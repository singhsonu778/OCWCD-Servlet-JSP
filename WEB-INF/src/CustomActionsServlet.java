package com.sonu.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomActionsServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String name = request.getParameter("name");
		List<String> list = Arrays.asList("Sonu", "Gaurav", "Madhuri");
		request.setAttribute("name", name);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("CustomActions.jsp");
		rd.forward(request, response);
	}
}
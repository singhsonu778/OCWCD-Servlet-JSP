package com.sonu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonu.model.MobileExpert;

public class MobileSelect extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String c = request.getParameter("os");
		MobileExpert me = new MobileExpert();
		List<String> list = me.getBrands(c);

		request.setAttribute("list", list);
		RequestDispatcher view = request.getRequestDispatcher("MobileResult.jsp");
		view.forward(request, response);
	}
}

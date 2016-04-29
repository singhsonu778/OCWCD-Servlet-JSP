package com.sonu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Beer Selection Advice From Servlet</h1>");
		for (String li : list) {
			out.print("<br>try: " + li);
		}
	}
}

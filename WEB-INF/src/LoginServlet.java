package com.sonu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		if ("sonu".equals(user) && "singh".equals(pwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(3 * 60);
            response.sendRedirect(response.encodeRedirectURL("LoginSuccess.jsp"));
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			PrintWriter out = response.getWriter();
			out.println("<p>Either user name or password is wrong.</p>");
			rd.include(request, response);
		}
	}
}

package com.sonu.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sonu.domain.Mobile;

public class MobileContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();
		String os = sc.getInitParameter("os");
		Mobile m = new Mobile(os);
		sc.setAttribute("mobile", m);
	}

	public void contextDestroyed(ServletContextEvent event) {
		// nothing to do here
	}
}
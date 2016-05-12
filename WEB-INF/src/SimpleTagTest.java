package com.sonu.domain;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest extends SimpleTagSupport {

	private String[] names;

	public void setNames(String[] names) {
		this.names = names;
	}

	public void doTag() throws JspException, IOException {
		for (String name : names) {
			getJspContext().setAttribute("name", name);
			getJspBody().invoke(null);
			if(name.equals("Gaurav")){
				throw new SkipPageException();
			}
		}
	}
}
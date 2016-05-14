package com.sonu.domain;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagTest extends TagSupport {
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("Classic tag output");
		} catch (IOException ex) {
			throw new JspException("IOException : " + ex.toString());
		}
		return SKIP_BODY;
	}
}
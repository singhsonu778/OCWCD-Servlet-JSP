package com.sonu.domain;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null);
	}
}
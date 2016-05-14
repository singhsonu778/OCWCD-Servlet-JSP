package com.sonu.domain;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagTest extends TagSupport {
	String[] names = new String[] { "Sonu", "Madhuri", "Gaurav" };
	int counter;

	public int doStartTag() throws JspException {
		counter = 0;
		return EVAL_BODY_INCLUDE;
	}

	public int doAfterBody() throws JspException {
		if (counter < names.length) {
			pageContext.setAttribute("name", names[counter]);
			counter++;
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}

	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
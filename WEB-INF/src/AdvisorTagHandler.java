package com.sonu.domain;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class AdvisorTagHandler extends SimpleTagSupport {
	private String user;

	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("Hello " + user + ", your advice is \"" + getAdvice() + "\"");
	}

	public void setUser(String user) {
		this.user = user;
	}

	private String getAdvice() {
		String[] advices = { "That color is not working for you.",
							 "You should call in sick.",
				             "You might want to rethink that haircut." 
						   };
		int random = (int) (Math.random() * advices.length);
		return advices[random];
	}
}
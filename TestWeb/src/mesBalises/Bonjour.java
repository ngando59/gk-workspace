package mesBalises;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Bonjour extends SimpleTagSupport {

	public Bonjour() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
	getJspContext().getOut().println("Ajout par Balise Bonjour");
	}

}

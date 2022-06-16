
package demo;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class Image_custom_tag extends SimpleTagSupport {

 
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        
        out.println("<img src='images/pic.jpg' ></img>");
        
    }
    
}

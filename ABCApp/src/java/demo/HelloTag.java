/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.util.GregorianCalendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

/**
 *
 * @author Zin Ko Lin
 */
public class HelloTag extends BodyTagSupport {
    
    private PageContext pageContext;
    private Tag parent;
    private String color;

  
    private String name;
    
    
      public void setName(String name) {
        this.name = name;
    }
      
        public void setColor(String color) {
        this.color = color;
    }

    
    
    public HelloTag() {
        super();
    }


    private void otherDoStartTagOperations() {
 
    }


    private void otherDoEndTagOperations() {

    }

 
    private void writeTagBodyContent(JspWriter out, BodyContent bodyContent) throws IOException {
        bodyContent.writeOut(out);

        bodyContent.clearBody();
    }

    @Override
    public int doStartTag() throws JspException {
        otherDoStartTagOperations();
        
        if (theBodyShouldBeEvaluated()) {
            return EVAL_BODY_BUFFERED;
        } else {
            return SKIP_BODY;
        }
    }


    @Override
    public int doEndTag() throws JspException {
        otherDoEndTagOperations();
        
        if (shouldEvaluateRestOfPageAfterEndTag()) {
            return EVAL_PAGE;
        } else {
            return SKIP_PAGE;
        }
    }

    @Override
    public int doAfterBody() throws JspException {
        try {
            // zkl
            BodyContent bodyCont = getBodyContent();
            JspWriter out = bodyCont.getEnclosingWriter();
            
            String info = bodyCont.getString();
            
            String dt ;
            
            GregorianCalendar now = new GregorianCalendar();
            dt = now.getTime().toString();
           dt = dt.substring(11, 16);
           
           out.println("<body bgcolor='"+color+"'>");
           
           if(info != null){
               
               out.println("<center>Hi "+info+"</center>");
               if(dt.compareTo("12")<0){
                   out.println("<center>Good Morning To You </center>");
               }
                if(dt.compareTo("12")>0 && dt.compareTo("16")<0 ){
                   out.println("<center>Good Day To You </center>");
               }
                if(dt.compareTo("16")>0 && dt.compareTo("24")<0 ){
                   out.println("<center>Good Evening To You </center>");
               }
                
                out.println("<br>");
                out.println("<center>welcome to Abc Company</center>");
                out.println("<br>");
                out.println("<center>Current time"+dt+"</center>");
                
                out.println("</body>");
                
           }
            
            
            
            
            
            
        } catch (Exception ex) {
            handleBodyContentException(ex);
        }
        
        if (theBodyShouldBeEvaluatedAgain()) {
            return EVAL_BODY_AGAIN;
        } else {
            return SKIP_BODY;
        }
    }


    private void handleBodyContentException(Exception ex) throws JspException {
        throw new JspException("Error in HelloTag tag", ex);
    }


    private boolean shouldEvaluateRestOfPageAfterEndTag() {

        return true;
    }

    private boolean theBodyShouldBeEvaluatedAgain() {

        return false;
    }

    private boolean theBodyShouldBeEvaluated() {

        return true;
    }

    
}

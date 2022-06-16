package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/tlds/Mytaglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_name_HelloTag_color;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_name_HelloTag_color = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_name_HelloTag_color.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String str = request.getParameter("r"); 
            if(str.compareTo("g")==0){
                
      out.write("\n");
      out.write("                ");
      //  name:HelloTag
      demo.HelloTag _jspx_th_name_HelloTag_0 = (demo.HelloTag) _jspx_tagPool_name_HelloTag_color.get(demo.HelloTag.class);
      _jspx_th_name_HelloTag_0.setPageContext(_jspx_page_context);
      _jspx_th_name_HelloTag_0.setParent(null);
      _jspx_th_name_HelloTag_0.setColor("lightgreen");
      int _jspx_eval_name_HelloTag_0 = _jspx_th_name_HelloTag_0.doStartTag();
      if (_jspx_eval_name_HelloTag_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_name_HelloTag_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_name_HelloTag_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_name_HelloTag_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    ");
          out.print( request.getParameter("name") );
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_name_HelloTag_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_name_HelloTag_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_name_HelloTag_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_0);
        return;
      }
      _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_0);
      out.write("\n");
      out.write("            ");
    
            }
            
             if(str.compareTo("y")==0){
                
      out.write("\n");
      out.write("                ");
      //  name:HelloTag
      demo.HelloTag _jspx_th_name_HelloTag_1 = (demo.HelloTag) _jspx_tagPool_name_HelloTag_color.get(demo.HelloTag.class);
      _jspx_th_name_HelloTag_1.setPageContext(_jspx_page_context);
      _jspx_th_name_HelloTag_1.setParent(null);
      _jspx_th_name_HelloTag_1.setColor("lightyellow");
      int _jspx_eval_name_HelloTag_1 = _jspx_th_name_HelloTag_1.doStartTag();
      if (_jspx_eval_name_HelloTag_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_name_HelloTag_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_name_HelloTag_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_name_HelloTag_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    ");
          out.print( request.getParameter("ne") );
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_name_HelloTag_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_name_HelloTag_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_name_HelloTag_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_1);
        return;
      }
      _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_1);
      out.write("\n");
      out.write("            ");
    
            }

             if(str.compareTo("b")==0){
                
      out.write("\n");
      out.write("                ");
      //  name:HelloTag
      demo.HelloTag _jspx_th_name_HelloTag_2 = (demo.HelloTag) _jspx_tagPool_name_HelloTag_color.get(demo.HelloTag.class);
      _jspx_th_name_HelloTag_2.setPageContext(_jspx_page_context);
      _jspx_th_name_HelloTag_2.setParent(null);
      _jspx_th_name_HelloTag_2.setColor("lightblue");
      int _jspx_eval_name_HelloTag_2 = _jspx_th_name_HelloTag_2.doStartTag();
      if (_jspx_eval_name_HelloTag_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_name_HelloTag_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_name_HelloTag_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_name_HelloTag_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    ");
          out.print( request.getParameter("n") );
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_name_HelloTag_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_name_HelloTag_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_name_HelloTag_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_2);
        return;
      }
      _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_2);
      out.write("\n");
      out.write("            ");
    
            }

             if(str.compareTo("red")==0){
                
      out.write("\n");
      out.write("                ");
      //  name:HelloTag
      demo.HelloTag _jspx_th_name_HelloTag_3 = (demo.HelloTag) _jspx_tagPool_name_HelloTag_color.get(demo.HelloTag.class);
      _jspx_th_name_HelloTag_3.setPageContext(_jspx_page_context);
      _jspx_th_name_HelloTag_3.setParent(null);
      _jspx_th_name_HelloTag_3.setColor("lightred");
      int _jspx_eval_name_HelloTag_3 = _jspx_th_name_HelloTag_3.doStartTag();
      if (_jspx_eval_name_HelloTag_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_name_HelloTag_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_name_HelloTag_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_name_HelloTag_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    ");
          out.print( request.getParameter("n") );
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_name_HelloTag_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_name_HelloTag_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_name_HelloTag_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_3);
        return;
      }
      _jspx_tagPool_name_HelloTag_color.reuse(_jspx_th_name_HelloTag_3);
      out.write("\n");
      out.write("            ");
    
            }

        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

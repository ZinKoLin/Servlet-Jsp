package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xml_005fif_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_parse_xml_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_if_select;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_parse_xml_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_if_select = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_x_parse_xml_var_nobody.release();
    _jspx_tagPool_x_if_select.release();
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
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_x_parse_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_x_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_x_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("        <br><h5>next line....</h5>\n");
      out.write("          ");
      if (_jspx_meth_x_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_x_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("bookinfo");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                <books>\n");
        out.write("                  <book>\n");
        out.write("                      <name>Java SE</name>\n");
        out.write("                      <author>Jame Goseleng</author>\n");
        out.write("                      <price>90</price>\n");
        out.write("                  </book>\n");
        out.write("\n");
        out.write("                  <book>\n");
        out.write("                      <name>Java EE</name>\n");
        out.write("                      <author>Matt</author>\n");
        out.write("                      <price>150</price>\n");
        out.write("                  </book>\n");
        out.write("              </books>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_x_parse_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_parse_0 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _jspx_tagPool_x_parse_xml_var_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_parse_0.setPageContext(_jspx_page_context);
    _jspx_th_x_parse_0.setParent(null);
    _jspx_th_x_parse_0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookinfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_parse_0.setVar("result");
    int _jspx_eval_x_parse_0 = _jspx_th_x_parse_0.doStartTag();
    if (_jspx_th_x_parse_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
      return true;
    }
    _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
    return false;
  }

  private boolean _jspx_meth_x_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:if
    org.apache.taglibs.standard.tag.common.xml.IfTag _jspx_th_x_if_0 = (org.apache.taglibs.standard.tag.common.xml.IfTag) _jspx_tagPool_x_if_select.get(org.apache.taglibs.standard.tag.common.xml.IfTag.class);
    _jspx_th_x_if_0.setPageContext(_jspx_page_context);
    _jspx_th_x_if_0.setParent(null);
    _jspx_th_x_if_0.setSelect("$result/books/book[1]/price<100");
    int _jspx_eval_x_if_0 = _jspx_th_x_if_0.doStartTag();
    if (_jspx_eval_x_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        book price is cheap\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_0);
      return true;
    }
    _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_0);
    return false;
  }

  private boolean _jspx_meth_x_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:if
    org.apache.taglibs.standard.tag.common.xml.IfTag _jspx_th_x_if_1 = (org.apache.taglibs.standard.tag.common.xml.IfTag) _jspx_tagPool_x_if_select.get(org.apache.taglibs.standard.tag.common.xml.IfTag.class);
    _jspx_th_x_if_1.setPageContext(_jspx_page_context);
    _jspx_th_x_if_1.setParent(null);
    _jspx_th_x_if_1.setSelect("$result/books/book[1]/price>150");
    int _jspx_eval_x_if_1 = _jspx_th_x_if_1.doStartTag();
    if (_jspx_eval_x_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        book price is expensive\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_1);
      return true;
    }
    _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_1);
    return false;
  }

  private boolean _jspx_meth_x_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:if
    org.apache.taglibs.standard.tag.common.xml.IfTag _jspx_th_x_if_2 = (org.apache.taglibs.standard.tag.common.xml.IfTag) _jspx_tagPool_x_if_select.get(org.apache.taglibs.standard.tag.common.xml.IfTag.class);
    _jspx_th_x_if_2.setPageContext(_jspx_page_context);
    _jspx_th_x_if_2.setParent(null);
    _jspx_th_x_if_2.setSelect("$result/books/book[2]/price<100");
    int _jspx_eval_x_if_2 = _jspx_th_x_if_2.doStartTag();
    if (_jspx_eval_x_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        book price is cheap\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_2);
      return true;
    }
    _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_2);
    return false;
  }

  private boolean _jspx_meth_x_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:if
    org.apache.taglibs.standard.tag.common.xml.IfTag _jspx_th_x_if_3 = (org.apache.taglibs.standard.tag.common.xml.IfTag) _jspx_tagPool_x_if_select.get(org.apache.taglibs.standard.tag.common.xml.IfTag.class);
    _jspx_th_x_if_3.setPageContext(_jspx_page_context);
    _jspx_th_x_if_3.setParent(null);
    _jspx_th_x_if_3.setSelect("$result/books/book[2]/price>=150");
    int _jspx_eval_x_if_3 = _jspx_th_x_if_3.doStartTag();
    if (_jspx_eval_x_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        book price is expensive\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_3);
      return true;
    }
    _jspx_tagPool_x_if_select.reuse(_jspx_th_x_if_3);
    return false;
  }
}

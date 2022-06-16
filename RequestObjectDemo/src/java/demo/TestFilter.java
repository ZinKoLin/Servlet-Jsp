package demo;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Zin Ko Lin
 */
public class TestFilter implements Filter {
    
        private FilterConfig filterConfig = null;
        private static final boolean debug = true;
    
        
        
        public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        
        }


    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
      
          }



    public void destroy() {        
    }
  }

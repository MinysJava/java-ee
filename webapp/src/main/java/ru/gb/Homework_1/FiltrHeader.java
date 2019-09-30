package ru.gb.Homework_1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FiltrHeader implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType ("text/html; charset=UTF-8");
        servletResponse.getWriter().println("<head><meta http-equiv='Content-Type' content='text/html; charset=utf-8' /></head>");
        filterChain.doFilter(servletRequest, servletResponse);
//        servletResponse.getWriter().println("<p>Footer from filter</p>");
    }

    @Override
    public void destroy() {

    }
}

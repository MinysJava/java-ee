package ru.gb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FirstFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().println("<p>Header from filter</p>");
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.getWriter().println("<p>Footer from filter</p>");
    }

    @Override
    public void destroy() {

    }
}

package ru.gb.Homework_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Catalog", urlPatterns = "/catalog")
public class Catalog extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(Catalog.class);

    private transient ServletConfig config;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<h1>Каталог</h1>");
        resp.getWriter().println("<p><a href='main'>Back</a></p>");
    }
}

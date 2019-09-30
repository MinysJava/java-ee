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

@WebServlet(name = "Main", urlPatterns = "/main")
public class Main extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    private transient ServletConfig config;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<h1>Main</h1>");

        resp.getWriter().println("<ul><li><a href='catalog'>Каталог</a></li>" +
                "<li><a href='product'>Продукты</a></li>" +
                "<li><a href='cart'>Корзина</a></li>" +
                "<li><a href='order'>Заказ</a></li></ul>");
    }
}

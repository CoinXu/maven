package com.coinxu.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Hello world!
 */
public class HelloWorld extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.getWriter().write("Hello world");
    }
}

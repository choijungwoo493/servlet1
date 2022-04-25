package com.nhnacademy.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class HelloServlet extends HttpServlet {

    String title;
    String name;
    @Override
    public void init(ServletConfig config) throws ServletException {
        log.error("init() called");
        super.init(config);
        title = config.getInitParameter("title");
        name = config.getInitParameter("name");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.error("service() called");
        super.service(req, resp);
    }
    @Override
    public void destroy() {
        log.error("destroy() called");
        super.destroy();
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        String title = getServletConfig().getInitParameter("title");
//        String name = getServletConfig().getInitParameter("name");
        try(PrintWriter out = resp.getWriter()) {
            out.println("Hello, Servlet" + title + name);
        } catch (IOException ex){
            log.error("",ex);
        }
    }
}

package com.nhnacademy.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@Slf4j
public class NowServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        log.error("init() called");
        super.init(config);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        try(PrintWriter out = response.getWriter()){
            out.println(date);
        }catch (IOException ex){
            log("",ex);
        }

    }

}

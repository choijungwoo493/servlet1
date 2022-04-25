package com.nhnacademy.servlet;

import javax.servlet.ServletContext;
import java.util.Optional;

public class CounterUtils {
    private CounterUtils(){
        throw new IllegalStateException("Utility Class");
    }
    public static void increaseCount(ServletContext servletContext){

        Integer count = Optional.ofNullable((Integer) servletContext.getAttribute("counter")).orElse(0);
        count++;
        servletContext.setAttribute("counter", count);

    }

}

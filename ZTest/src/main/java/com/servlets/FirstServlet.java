/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

/**
 *
 * @author shaik
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
public class FirstServlet implements Servlet {
   ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Creating object...");
    }
    public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException{
        System.out.println("Servicing...");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Today date and time now is "+new Date().toLocaleString()+".");
    }
    public void destroy(){
        System.out.println("Destroying...");
    }
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    public String getServletInfo(){
        return "First Servlet";
    }
    
}

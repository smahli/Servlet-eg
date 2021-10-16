/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author Asus
 */
public class MyServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        System.out.println("This is get method .............");
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.print("<h1>HI THIS IS GET METHOD OF MY SERVLET</h1>");
        out.print(new Date().toString());
        
        
        
    
    }
}

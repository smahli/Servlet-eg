/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.formSubmit;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author Asus
 */
public class RegisterServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        String name =request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String cond= request.getParameter("condition");
        
        if(cond!=null){
            out.println("<h2>Thanks for Connecting With us</h2>");
            out.println("<h2>Your Responses submitted successfully</h2>");
        
        
            if(cond.equals("checked")){
                out.println("<h2> Name :"+ name +"</h2>");
                out.println("<h2> password :"+ password +"</h2>");
                out.println("<h2> email :"+ email+ "</h2>");
                out.println("<h2> Gender :"+ gender+ "</h2>");
                out.println("<h2> Course :"+ course+ "</h2>");
             
                //JDBC 
                // Saved to JDBC
                RequestDispatcher rd = request.getRequestDispatcher("success");
                rd.forward(request, response);
                }
            else{
                out.println("<h2>You have not accepted terms and conditions</h2>");
            }
        }
        
        
        
        
        else{
            out.println("<h2>You have not accepted terms and conditions</h2>");
            // WE should include output of index.html
            //get the object of RequestDispacher
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response); // we include output of another index.html
            
        }
    }
    
}

<%-- 
    Document   : signup
    Created on : Oct 18, 2021, 8:50:24 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
        <title>JSP Page</title>
    </head>
    <body style="background: url(img/bgimg.jpeg); background-size: cover; background-attachment: fixed">
        <div class="container">
            <div class ="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content ">
                            <h3 style="margin-top: 10px"; class="center-align">Register here ! </h3>
                        </div>
                        <div class="form center-align" >
                            <!--// creating form-->
                            <form action="Register" method="post">
                                <input type="text" name="user_name" placeholder="enter your name"> 
                                <input type="password" name="user_password" placeholder="enter password"> 
                                <input type="email" name="user_email" placeholder="enter your email"> 
                                <button type="submit" class="btn">Submit</button>
                                
                            </form>
                            
                        </div>
                        <div class="loader center-align" style="margin-top: 10px; display: none;">
                            <div class="preloader-wrapper small active">
                                <div class="spinner-layer spinner-green-only">
                                  <div class="circle-clipper left">
                                    <div class="circle"></div>
                                  </div><div class="gap-patch">
                                    <div class="circle"></div>
                                  </div><div class="circle-clipper right">
                                    <div class="circle"></div>
                                  </div>
                                </div>
                              </div>
                            <h5>Please wait...</h5>
                            
                        </div>
                        
                            
                        </div>
                        
                    </div>
                </div>
                
            </div>>
            
        </div>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous">
            
        </script>
        
        <script>
            $(document).ready( function(){
                console.log("page is ready");
            })
        </script>
    </body>
</html>

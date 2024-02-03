package com.embeddedjetty12;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class HelloServlet extends HttpServlet {
	 @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 response.setContentType("text/html;");
		 response.getWriter().println("<h1> hello jetty 12 running!! <h1>");
		 
	}
}

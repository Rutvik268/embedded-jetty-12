package com.embeddedjetty12;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHandler;
import org.eclipse.jetty.server.Server;

public class ServerMain {
	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8681); 
		
		ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");
        
        contextHandler.addServlet(new HelloServlet(), "/home");
        server.setHandler(contextHandler);
        
        
//        ServletHandler servletHandler = new ServletHandler();
//        server.setHandler(servletHandler);
//                 
//        servletHandler.addServletWithMapping(HelloServlet.class, "/");

		server.start();
		System.out.println("Server Stated Successfully!!! ");
		
		server.join();	
	}

}

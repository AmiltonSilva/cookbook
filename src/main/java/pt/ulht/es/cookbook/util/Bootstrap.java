package pt.ulht.es.cookbook.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

import pt.ist.fenixframework.FenixFramework;

<<<<<<< HEAD
//Inicializa A FenixFramework Que E Lida Atravez PropertiesManager

	public class Bootstrap implements WebApplicationInitializer {
		public void onStartup(ServletContext ctx) throws ServletException {
			FenixFramework.initialize(PropertiesManager.getFenixFrameworkConfig());
	}	
=======
public class Bootstrap implements WebApplicationInitializer {

	
	public void onStartup(ServletContext ctx) throws ServletException {
		FenixFramework.initialize(PropertiesManager.getFenixFrameworkConfig());
	}
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0

}
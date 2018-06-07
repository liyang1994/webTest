
package com.ly.util;



import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class TestLog implements ServletContextListener  {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("项目启动了。。。。。。。。。。");
	    
	}
}
		

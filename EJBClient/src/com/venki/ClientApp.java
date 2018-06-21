package com.venki;

import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ClientApp {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Client App Started");
			Properties props = new Properties();
			props.put("java.naming.factory.url.pkgs","org.jboss.ejb.client.naming");
			Context context = new InitialContext(props);
			
			String appName = "";
			String moduleName = "MessageFromServerEJB";
			String distinctName = "";
			String beanName = ExampleServer.class.getSimpleName();
			String interfaceName = ExampleServerRemote.class.getName();
			String name = "ejb: " + appName + "/" + moduleName + "/" + distinctName
					+ "/" + beanName + "!" + interfaceName;
			System.out.println(name);
			
			ExampleServerRemote bean = (ExampleServerRemote)context.lookup(name);
			String msg = bean.getMsg();
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

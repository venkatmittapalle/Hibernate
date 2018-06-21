package com.venki;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ExampleServer
 */
@Stateless
@LocalBean
public class ExampleServer implements ExampleServerLocal, ExampleServerRemote {
	

    /**
     * Default constructor. 
     */
    public ExampleServer() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String getMsg() {
    	
    	return "This is a message from Server!";
    }

}

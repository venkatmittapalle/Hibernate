package com.venki;

import javax.ejb.Remote;

@Remote
public interface ExampleServerRemote {
	
	public String getMsg();

}

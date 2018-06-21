package com.venki;

import javax.ejb.Local;

@Local
public interface ExampleServerLocal {
	
	public String getMsg();

}

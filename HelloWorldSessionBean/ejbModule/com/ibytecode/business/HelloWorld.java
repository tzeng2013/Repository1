package com.ibytecode.business;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {
	public void sayHello(int times);
}

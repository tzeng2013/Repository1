package com.ibytecode.businesslogic;

import com.ibytecode.business.HelloWorld;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.Clustered;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@Clustered
public class HelloWorldBean implements HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }

    public void sayHello(int times) {
        System.out.println(times + " Hello World !!!");
    }
}

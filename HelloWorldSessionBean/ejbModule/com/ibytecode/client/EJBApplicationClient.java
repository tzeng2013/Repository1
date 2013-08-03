package com.ibytecode.client;

import javax.naming.Context;
import javax.naming.NamingException;
import com.ibytecode.business.HelloWorld;
import com.ibytecode.clientutility.ClientUtility;

public class EJBApplicationClient {
    private static final String LOOKUP_STRING = "HelloWorldBean/remote";
    public static void main(String[] args) {
        HelloWorld bean = doLookup();
        for (int i = 0; i < 1000; i++) {
            bean.sayHello(i); //3. Call business logic
        }
    }
 
    private static HelloWorld doLookup(){
        Context context = null;
        HelloWorld bean = null;
        try{
            //1. Obtaining Context
            context = ClientUtility.getInitialContext();
            //2. Lookup and cast
            bean = (HelloWorld)context.lookup(LOOKUP_STRING);
        }catch(NamingException e){
            e.printStackTrace();
        }
        return bean;
    }
}
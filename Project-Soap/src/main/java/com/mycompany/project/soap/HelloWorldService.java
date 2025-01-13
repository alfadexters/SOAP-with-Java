package com.mycompany.project.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "HelloWorldService")
public class HelloWorldService {
    
    @WebMethod(operationName = "greet")
    public String greet(@WebParam(name = "Richard") String nombre) {
        return "¡Hello, " + nombre + "!";
    }
}
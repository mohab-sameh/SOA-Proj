/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kokye
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Addition")
    public double Addition(@WebParam(name = "first") double first, @WebParam(name = "second") double second) {
        double result=first+second;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Subtraction")
    public double Subtraction(@WebParam(name = "first") double first, @WebParam(name = "second") double second) {
        double result=first-second;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplication")
    public double Multiplication(@WebParam(name = "first") double first, @WebParam(name = "second") double second) {
        double result=first*second;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public double Division(@WebParam(name = "first") double first, @WebParam(name = "second") double second) {
        double result=first/second;
        return result;
    }
}

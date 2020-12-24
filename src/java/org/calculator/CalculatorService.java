/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Mohab
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Add")
    public double Add(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        double result=n1+n2;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Subtract")
    public double Subtract(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        double result=n1-n2;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiply")
    public double Multiply(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        double result=n1*n2;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Divide")
    public double Divide(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        double result=n1/n2;
        return result;
    }
}

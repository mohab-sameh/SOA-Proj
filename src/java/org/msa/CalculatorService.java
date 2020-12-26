/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.msa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.lang.Math;


/**
 *
 * @author Mohab
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {


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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Power")
    public double Power(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        double base = n1, exponent = n2;
        double result = Math.pow(base, exponent);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SquareRoot")
    public double SquareRoot(@WebParam(name = "n1") double n1) {
        //TODO write your implementation code here:
        double result;
        result = Math.sqrt(n1);
        
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Factorial")
    public double Factorial(@WebParam(name = "n1") double n1) {
        //TODO write your implementation code here:
        double i,fact=1;  
        double number=n1;//It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        
        
        double result = fact;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sin")
    public double sin(@WebParam(name = "n1") double n1) {
        //TODO write your implementation code here:
        
        double x=n1;
        
        double result = Math.sin(Math.toRadians(x));
                
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cos")
    public double cos(@WebParam(name = "n1") double n1) {
        //TODO write your implementation code here:
        double x=n1;
        
        double result = Math.cos(Math.toRadians(x));
                
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tan")
    public double tan(@WebParam(name = "n1") double n1) {
        //TODO write your implementation code here:
        double x=n1;
        
        double result = Math.tan(Math.toRadians(x));
                
        return result;
    }
}

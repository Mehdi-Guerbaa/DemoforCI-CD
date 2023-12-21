package com.calculatrice.intraex2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "CalculatriceMehdi")
public class Calculatrice {

    @WebMethod
    public double addition(double a, double b) {
        return a + b;
    }

    @WebMethod
    public double soustraction(double a, double b) {
        return a - b;
    }

    @WebMethod
    public double multiplication(double a, double b) {
        return a * b;
    }

    @WebMethod
    public String division(double a, double b) {
        if (b != 0) {
            double result = a / b;
            return String.valueOf(result);
        } else {
            return "Erreur : Division par Zero !!!!!!!";
        }
    }

    @WebMethod
    public double puissance(double a, double b) {
        return Math.pow(a, b);
    }

}


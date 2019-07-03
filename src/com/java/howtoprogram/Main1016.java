/*
(Catching Exceptions with Superclasses) Use inheritance to create an exception superclass
(called ExceptionA) and exception subclasses ExceptionB and ExceptionC, where ExceptionB inherits
from ExceptionA and ExceptionC inherits from ExceptionB. Write a program to demonstrate
that the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.
 */
package com.java.howtoprogram;

public class Main1016 {

    public static void main(String[] args) {
        try {
            getExceptionB();
        } catch (ExceptionA ea) {
//            ea.printStackTrace();
            System.out.println(ea);
        }

        try {
            getExceptionC();
        } catch (Exception ea) {
//            ea.printStackTrace();
            System.out.println(ea);
        }
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("ExceptionB");
    }

    public static void getExceptionC() throws ExceptionC {
        throw new ExceptionC("ExceptionC");
    }

}

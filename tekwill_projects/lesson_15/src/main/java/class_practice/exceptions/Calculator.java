/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package class_practice.exceptions;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide  (int x, int y) throws ArithmeticException{

        return x / y;
    }
}

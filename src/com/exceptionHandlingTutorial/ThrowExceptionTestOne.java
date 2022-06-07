package com.exceptionHandlingTutorial;

public class ThrowExceptionTestOne {
    public static void main(String[] args) {
        System.out.println(divide(4, 2));
        System.out.println(divide(5, 1));
        System.out.println(divide(6, 0));
    }

    static int divide(int numberToDivide, int numberToDivideBy) {
        if (numberToDivideBy == 0 || numberToDivideBy == 1) {
            throw new BadNumberException();
            /*RuntimeException runtimeException = new RuntimeException("Cannot divide by 0");
            throw runtimeException;*/
//            throw new RuntimeException("Cannot divide by 0");
        }
        return numberToDivide / numberToDivideBy;
    }
}

class BadNumberException extends RuntimeException {
}

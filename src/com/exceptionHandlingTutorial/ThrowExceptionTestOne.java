package com.exceptionHandlingTutorial;

public class ThrowExceptionTestOne {
    public static void main(String[] args) {
        // Exception is class parent all exceptions
        // try and catch use for exception handling
        try {
            System.out.println(divide(5, 0));
        } catch (BadNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }

    // throws BadNumberException : An exception BadNumberException may occur, but I do not know how to handle this exception
    public static void callDivide() throws BadNumberException {
        int result = divide(2, 1);
        System.out.println(result);
    }

    static int divide(int numberToDivide, int numberToDivideBy) {
        if (numberToDivideBy == 0) {
            throw new BadNumberException("/by zero - 0");
            /*RuntimeException runtimeException = new RuntimeException("Cannot divide by 0");
            throw runtimeException;*/
//            throw new RuntimeException("Cannot divide by 0");
        }

        // In this program, if we do not write the following command, we can not handle exceptions
        /*if (numberToDivideBy == 0) {
            throw new BadNumberException("/by zero - 0");
        }*/
        // In this program, if we do not write the following command, we can not handle exceptions

        return numberToDivide / numberToDivideBy;
    }

    /*static void test(){
        while (true){
            try {
                System.out.println(divide(5,0));
                break;
            }catch (Exception ex){
                System.out.println("Enter right number");
            }
        }
    }*/

}

class BadNumberException extends RuntimeException {
    public BadNumberException(String message) {
        super(message);
    }
}

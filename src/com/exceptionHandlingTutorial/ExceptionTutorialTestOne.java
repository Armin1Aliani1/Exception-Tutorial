package com.exceptionHandlingTutorial;

public class ExceptionTutorialTestOne {
    // When we put the first exception in a method, in the console,
    // first the exception of that method is shown to us and then wherever that method calls the exception,
    // it is displayed to us in order and note that Only the first Exceptions are displayed
    public static void main(String[] args) {
        A();
    }

    static void A() {
        B();
    }

    static void B() {
        C();
        D();
    }

    static void C() {
        throw new RuntimeException();
    }

    static void D() {
        throw new RuntimeException();
    }
}

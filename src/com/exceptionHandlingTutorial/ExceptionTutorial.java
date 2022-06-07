package com.exceptionHandlingTutorial;

public class ExceptionTutorial {
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

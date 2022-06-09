package com.exceptionHandlingTutorial;

public class CheckedAndUnchecked {
    public static void main(String[] args) throws MyException {
        throwMyRuntimeException();
        throwMyException();
    }

    static void throwMyRuntimeException() throws MyRuntimeException {
        throw new MyRuntimeException();
    }

    static void throwMyException() throws MyException {
        throw new MyException();
    }
}

// Unchecked
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {

    }

    public MyRuntimeException(String message) {
        super(message);
    }
}

// checked
class MyException extends Exception {
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}

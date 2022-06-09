package com.exceptionHandlingTutorial;

public class MultipleCatchTwo {
    public static void main(String[] args) {
        try {
            a();
        } catch (ChildExceptionTwo e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    static void a() throws ParentExceptionTwo, ChildExceptionTwo, BrotherExceptionTwo, GrandSonExceptionTwo {
        throw new GrandSonExceptionTwo();
    }
}

class ParentExceptionTwo extends RuntimeException {
}

class ChildExceptionTwo extends ParentExceptionTwo {
}

class BrotherExceptionTwo extends ParentExceptionTwo {
}

class GrandSonExceptionTwo extends ChildExceptionTwo {
}

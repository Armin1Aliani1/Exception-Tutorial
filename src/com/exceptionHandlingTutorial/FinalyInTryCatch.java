package com.exceptionHandlingTutorial;

import java.util.Scanner;

public class FinalyInTryCatch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 4 :");
        int IntOne = 0;
        boolean flag = false;
        while (!flag) {
            try {
                String input = scanner.next();
                IntOne = Integer.parseInt(input);
                flag = true;
            } catch (Exception e) {
                System.out.println("Please enter valid number");
            }
        }
        doSomething(IntOne);
    }

    static void doSomething(int n) throws Exception {
        try {
            switch (n) {
                case 1:
                    System.out.println("1st case");
                    return;
                case 2:
                    System.out.println("2st case");
                case 3:
                    System.out.println("3st case");
                    throw new RuntimeException("3!");
                case 4:
                    System.out.println("4st case");
                    throw new Exception("4!");
            }
        } catch (RuntimeException e) {
            System.out.println("Catch block");
            a();
            System.out.println(e.getMessage());
        } finally {
            // Finally run in any case
            System.out.println("finally block");
//            a();
//            System.out.println("End finally block");
        }
    }

    private static void a() {
        throw new RuntimeException();
    }

}

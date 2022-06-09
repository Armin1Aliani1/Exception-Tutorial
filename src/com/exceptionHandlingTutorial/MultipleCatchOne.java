package com.exceptionHandlingTutorial;

import java.sql.SQLException;

public class MultipleCatchOne {
    public static void main(String[] args) {
        try {
            a();
        } catch (GrandSonException e) {
            System.out.println("GrandSonE");
        } catch (BrotherException e) {
            System.out.println("BrotherE");
        } catch (ChildException e) {
            System.out.println("ChildE");
        } catch (ParentException e) {
            System.out.println("ParentE");
        } catch (SQLException e) {
            System.out.println("Sql");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    static void a() throws ParentException, ChildException, BrotherException, GrandSonException, SQLException, Exception {
        throw new BrotherException();
    }
}

class ParentException extends Exception {
}

class ChildException extends ParentException {
}

class BrotherException extends ParentException {
}

class GrandSonException extends ChildException {
}

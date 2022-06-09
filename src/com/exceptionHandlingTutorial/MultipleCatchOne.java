package com.exceptionHandlingTutorial;

import java.sql.SQLException;

public class MultipleCatchOne {
    public static void main(String[] args) {
        try {
            a();
        } catch (GrandSonExceptionOne e) {
            System.out.println("GrandSonE");
        } catch (BrotherExceptionOne e) {
            System.out.println("BrotherE");
        } catch (ChildExceptionOne e) {
            System.out.println("ChildE");
        } catch (ParentExceptionOne e) {
            System.out.println("ParentE");
        } catch (SQLException e) {
            System.out.println("Sql");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    static void a() throws ParentExceptionOne, ChildExceptionOne, BrotherExceptionOne, GrandSonExceptionOne, SQLException, Exception {
        throw new BrotherExceptionOne();
    }
}

class ParentExceptionOne extends Exception {
}

class ChildExceptionOne extends ParentExceptionOne {
}

class BrotherExceptionOne extends ParentExceptionOne {
}

class GrandSonExceptionOne extends ChildExceptionOne {
}
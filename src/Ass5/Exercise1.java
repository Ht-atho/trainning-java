package Ass5;
     /*Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor
for Exception a String argument. Catch the exception inside a catch clause and print the String argument. Add
a finally clause and print a message to prove you were there.*/
class ExceptionEx1 extends Exception {
    public ExceptionEx1(String msg) {
        super(msg);
        System.out.println("ExceptionEx: "+ msg);
    }
}

public class Exercise1 {
    public static void f() throws ExceptionEx1 {
        System.out.println("Throwing Exception from f()");
        throw new ExceptionEx1("From f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(ExceptionEx1 e) {
            System.err.println("Caught Exception");
            e.printStackTrace();
        } finally {
            System.out.println("I was here");
        }
    }
}
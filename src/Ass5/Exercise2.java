package Ass5;
    /*Create your own exception class using the extends keyword. Write a constructor for this class that takes a
String argument and stores it inside the object with a String reference. Write a method that prints out the stored
String. Create a try-catch clause to exercise your new exception.*/


class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class ExceptionEx2 {
    void display(int x) throws MyException {
        System.out.println("x = " + x);
        throw new MyException("Another Exception Occurred");
    }
}

class Exercise2 {
    public static void main(String[] args) {
        ExceptionEx2 exceptionEx2 = new ExceptionEx2();
        try {
            exceptionEx2.display(50);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

package Ass5;

    /*Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an
exception at the base of your hierarchy. Inherit B from A and override the method so it throws an exception at
level two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then
call the method.*/

class FirstException extends Exception {}
class SecondException extends FirstException {}
class ThirdException extends SecondException {}

class A {
    void f() throws FirstException {
        throw new FirstException();
    }
}

class B extends A {
    void f() throws SecondException {
        throw new SecondException();
    }
}

class C extends B {
    void f() throws ThirdException {
        throw new ThirdException();
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.f();
        }	catch(ThirdException e3) {
            System.out.println("Caught e3");
        }	catch(SecondException e2) {
            System.out.println("Caught e2");
        }	catch(FirstException e1) {
            System.out.println("Caught e1");
        }
    }
}
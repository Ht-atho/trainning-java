package Ass4;

public class Ass4 {
    /*Write a program to print the names of students by creating a Student class. If no name is passed while creating
an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the
String value passed while creating object of Student class.*/
    public static void checkEx1(){
        System.out.println("Exercise 1");
        Student student = new Student();
        student.ss = "Thanh";
        //Student ss1 = new Student();
        System.out.println(student.ss);
        System.out.println(student.name);
    }

    /*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with
the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call
the methods 'message' by creating an object for each subclass*/
    public static void checkEx2(){
        System.out.println("Exercise 2");
        Subclass1 sb1 = new Subclass1();
        Subclass2 sb2 = new Subclass2();
        sb1.message();
        sb2.message();
    }

    /*Write a class that implements the CharSequence interface found in the java.lang package. Your
implementation should return the string backwards. Select one of the sentences from this book to use as the
data. Write a small main method to test your class; make sure to call all four methods.*/
    public static void checkEx3(){
        System.out.println("Exercise 3");
        CharReverse.runEx3();
    }

    public static void checkEx4(){
            Author author = new Author("Thanh", "thanh@gmail.com", 'f');
            System.out.println(author);
            author.setEmail("thanhCheck@somewhere.com");
            System.out.println(author);
            System.out.println("name is: " + author.getName());
            System.out.println("gender is: " + author.getGender());
            System.out.println("email is: " + author.getEmail());
    }


    public static void main(String[] argv){
        checkEx1();
        checkEx2();
        checkEx3();
        checkEx4();
    }
}

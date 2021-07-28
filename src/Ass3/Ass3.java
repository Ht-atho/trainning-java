package Ass3;

import java.util.Scanner;

public class Ass3 {
    static Scanner sc = new Scanner(System.in);
    /*Create a class named 'Ass3.Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of
roll_no as '2' and that of name as "John" by creating an object of the class Ass3.Student.*/
    static void assginValue(){
        System.out.println("Exercise 1");
        Student st = new Student();
        st.name= "John";
        st.roll_no = 2;
        System.out.println("Name: " + st.name + " and roll no: "+ st.roll_no);

    }

    /*Write a program to print the area of a rectangle by creating a class named 'Ass3.Area' taking the values of its length
and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area
of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
    static void calculateArea(){
        System.out.println("Exercise 2");
        System.out.print("Enter the lenght of Recatangle: ");
        int lenght = sc.nextInt();
        System.out.print("Enter the width of Recatangle: ");
        int width = sc.nextInt();
        Area area = new Area(lenght,width);
        System.out.println("Area = "+ area.returnArea());
    }
    /*Write a program that would print the information (name, year of joining, salary, address) of three employees
by creating a class named 'Employee'.*/
    static void showInfor(){
        System.out.println("Exercise 3");
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");
        System.out.println("Name\tYear of joining\tSalary\tAddress");
        System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t\t\t"+e1.getAddress());
        System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t\t\t"+e2.getAddress());
        System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t\t\t"+e3.getAddress());
    }

    /*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6
hours.*/
    static void calSalary(){
        System.out.println("Exercise 4");
        Employee obj = new Employee();
        obj.getInfo();
    }

    /*Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns
of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array*/
    static void creatMatrix(){
        System.out.println("Exercise 5");
        System.out.println(Matrix.random(6,7));
    }
    public static void main(String[] args){
//        assginValue();
//        calculateArea();
//        showInfor();
//        calSalary();
        creatMatrix();
        sc.close();

    }
}


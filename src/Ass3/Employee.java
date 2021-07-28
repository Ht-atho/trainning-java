package Ass3;

import java.util.Scanner;

public class Employee {
    private String name, address;
    private int year;
    public Employee() {

    }

    public Employee(String n, int y, String add) {
        name = n;
        year = y;
        address = add;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }
    void getInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = in.nextDouble();
        System.out.print("Enter the number of hours of work per day: ");
        int hours = in.nextInt();
        addSal(salary);
        addWork(salary,hours);
    }


    void addSal(double sal) {
        if (sal < 500){
            sal = sal + 10;
            System.out.println("Employee's salary is less than $500.");
        }
        System.out.println("Salary: " + sal);
    }
    void addWork(double sal,int hours ) {
        if (hours > 6){
            sal = sal + 5;
            System.out.println("The number of hours of work per day is more than 6 hours.");
        }
        System.out.println("Salary: " + sal);
    }
}


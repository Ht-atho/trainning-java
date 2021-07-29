package Ass7.Ex2;

import java.io.*;

class Student implements Serializable {
    public String first;
    public String last;
    public String email;
    
}

public class Test {

    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.first = "Ngô Thị Hoài";
        student.last = "Thanh";
        student.email= "ThanhNTH7@fsoft.com";

        try {
            FileOutputStream f = new FileOutputStream("src/Ass7/Ex2/student.txt");
            ObjectOutputStream oOT = new ObjectOutputStream(f);
            oOT.writeObject(student);
            System.out.println("Write Student....");
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Something Wrong....");
        }

        Student student1 = new Student();

        try {
            FileInputStream f = new FileInputStream("src/Ass7/Ex2/student.txt");
            ObjectInputStream oIT = new ObjectInputStream(f);
            student1 = (Student) oIT.readObject();
            oIT.close();
            f.close();
        } catch (IOException io) {
            System.out.println("Something Wrong....");
        } catch (ClassNotFoundException ex) {
            System.out.println("No Class was found.");
        }

        System.out.println("Read Student 1's information: \nFirst Name: "+student1.first +"\nLast Name: "+ student1.last+"\nEmail: "+student1.email);
    }
}
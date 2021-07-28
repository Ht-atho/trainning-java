package Ass7;

import java.io.*;

public class Student {
}


class ReadWriteObject {
    public static void main(String[] args){
        MyStudent myStudent = new MyStudent(); // tao doi tuong myStudent

        //Ghi Object vao file

        try {   // dat try cacth de tranh ngoai le khi tao va viet File
            FileOutputStream f = new FileOutputStream("student.txt"); // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(myStudent); // ghi MyStudent theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }

        // doc Object tu file
        MyStudent ms = null;

        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("student.txt"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la MyStudent
            ms = (MyStudent) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }

        // Xuat KQ
        System.out.println("My name is " + ms.name + ". I am " + ms.age + " years old");
    }
}

class MyStudent implements Serializable {
    String name = "Nguyen Van Quan";
    int age = 21;
}

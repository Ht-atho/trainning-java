//package Ass7;
//
//import Ass3.Student;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Exercise2 {
//    public static void main(String[] args) {
//        Students student = new Students("Ngô","Thanh","ThanhNTH7@fsoft.com");
//        student.write(student);
//    }
//}
//class Students{
//    private String first;
//    private String last;
//    private String email;
//    Students(){
//
//    }
//    public Students(String first, String last,String email){
//        super();
//        this.first= first;
//        this.last = last;
//        this.email = email;
//    }
//    public String getFirst() {
//        return first;
//    }
//    public void setFirt(String first){
//        this.first = first;
//    }
//    public String getLast() {
//        return last;
//    }
//    public void setLast(String last){
//        this.last = last;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email){
//        this.email = email;
//    }
//    private final static String FILE_URL = "src/Ass7/student.txt";
//    private static final File file = new File(FILE_URL);
//    public void write(Students student) {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream(new File(FILE_URL));
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(student);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            closeStream(fos);
//            closeStream(oos);
//        }
//    }
//    private void closeStream(OutputStream os) {
//        if (os != null) {
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public Student[] read() {
//        List<Student> studentList = new ArrayList<>();
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            fis = new FileInputStream(new File(FILE_URL));
//            ois = new ObjectInputStream(fis);
//            studentList = (List<Student>) ois.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            closeStream(fis);
//            closeStream(ois);
//        }
//
//        return studentList.toArray(new Student[0]);
//    }
//    private void closeStream(InputStream is) {
//        if (is != null) {
//            try {
//                is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//}
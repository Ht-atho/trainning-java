import java.util.Scanner;

import static java.lang.Math.pow;

public class Ass2 {

    static Scanner sc = new Scanner(System.in);
/*    Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise,
      print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it
      exceeds 1,000,000.*/
    static void checkPositiveNumber(){
        System.out.println("Exercise 1");
        System.out.print("Enter number: ");
        float num = sc.nextFloat();
        if (num > 0)
        {
            if (num < 1) {
                System.out.println("Positive small number");
            }
            else if (num > 1000000) {
                System.out.println("Positive large number");
            }
            else {
                System.out.println("Positive number");
            }
        }
        else if (num < 0) {
            if (Math.abs(num) < 1) {
                System.out.println("Negative small number");
            }
            else if (Math.abs(num) > 1000000) {
                System.out.println("Negative large number");
            }
            else {
                System.out.println("Negative number");
            }
        }
        else {
            System.out.println("Zero");
        }
    }

//    Write a program in Java to display the cube of the number upto given an integer.
    static void cube(){
        System.out.println("Exercise 2");
        System.out.print("Input number of terms : ");
        int num = sc.nextInt();
        System.out.println("Number is : "+ num + " and cube of 1 is : " + (int)pow(num,3) );
    }

/*    Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a
    number in a row*/
    static void drawAngleTriangle() {
        System.out.println("Exercise 3");
        System.out.print("Input number of terms : ");
        int length = sc.nextInt();
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the
number is equal to the number itself, then the number is called an Armstrong number.*/
    static void findArmstrongNumber(){
        System.out.println("Excercise 4");
        int num = 1, temp= 1;
        for( int i = 1; i <= 500; i++) {
            int rem, sum = 0;
            float cube;
            while( num != 0) {
                rem = num % 10;
                cube = ( float) pow(rem, 3);
                sum = ( int) (sum + cube);
                num = num / 10;
            }
            if( sum == temp){
                System.out.println(temp);
            }
            temp = i+1;
            num = i+1;
        }
    }
    /*Compute the natural logarithm of 2, by adding up to n terms in the series
    1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
    where n is a positive integer and input by user.*/
    static void computeLog() {
        System.out.println("Excercise 5");
        int sign = -1;
        float sum = 0;
        System.out.print("Enter the value of n : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sign *= -1;
            sum += sign * 1.0 / i;
        }
        System.out.println("log 2 : " + sum);
    }

    public static void main(String[] args){
        checkPositiveNumber();
        cube();
        drawAngleTriangle();
        findArmstrongNumber();
        computeLog();
        sc.close();
    }
}

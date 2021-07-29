import java.util.Scanner;

public class Ass1 {
    static Scanner sc = new Scanner(System.in);

//  Write a Java program to print the sum of two numbers.
    public static void sum(){
        System.out.println("Exercise 1");
        System.out.print("Input the first number: ");
        int num_1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num_2 = sc.nextInt();
        System.out.println("Sum = "+ num_1 + num_2);
    }

//Write a Java program to print the result of the following operations.
    public static void calculator(){
        System.out.println("Exercise 2");
        System.out.println(( -5 + 8 * 6 ));
        System.out.println(( 55 + 9 ) % 9);
        System.out.println( 20 + - 3 * 5 / 8);
        System.out.println(( 5 + 15 / 3 * 2 - 8 % 3));
    }

//Write a Java program to multiply two binary numbers
    public static void multiply(){
        System.out.println("Exercise 3");
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        System.out.print("Input the first binary number: ");
        binary1 = sc.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = sc.nextLong();
        while (binary2 != 0)
        {
            digit = (int)(binary2 % 10);
            if (digit == 1)
            {
                binary1 = binary1 * factor;
                multiply = binaryProduct((int) binary1, (int) multiply);
            }
            else
            {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply+"\n");
    }
    static int binaryProduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        while (i >= 0)
        {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }

/*  Write a Java program that accepts two integer values from the user and return the larger values. However if
    the two values are the same, return 0 and return the smaller value if the two values have the same remainder
    when divided by 6.*/

    public static void checkNum(){
        System.out.println("Exercise 4");
        System.out.print("Input the first number: ");
        int num_1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num_2 = sc.nextInt();
        int result;
        if(num_1 == num_2){result = 0;}
        if(num_1 % 6 == num_2 % 6) {
            result = Math.min(num_1, num_2);
        }
        result= Math.max(num_1, num_2);
        System.out.println("Result: "+ result);
    }

/*  Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
    hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per
    hour (hint: 1 mile = 1609 meters)*/

    public static void calculatorSpeed(){
        System.out.println("Exercise 5");
        System.out.print("Input distance in meters: ");
        float meters = sc.nextFloat();
        System.out.print("Input hours: ");
        float hours = sc.nextFloat();
        System.out.print("Input minutes: ");
        float minutes = sc.nextFloat();
        System.out.print("Input seconds: ");
        float seconds = sc.nextFloat();

        System.out.println("Your speed in meters/second is "+ meters / (hours * 3600 + minutes * 60 + seconds));
        System.out.println("Your speed in km/h is "+ (meters/1000) / (hours + minutes / 60 + seconds / 3600));
        System.out.println("Your speed in miles/h is "+ (meters/1609) / (hours + minutes / 60 + seconds / 3600));
    }
    public static void main(String[] args){
//        sum();
//        calculator();
//        multiply();
        checkNum();
//        calculatorSpeed();
        sc.close();
    }

}

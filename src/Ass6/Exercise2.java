package Ass6;

import java.util.Random;

public class Exercise2 {
    private static final int[] array = new int[64];
    public static void inputArr() {
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < 64; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(64);
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < 64; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void reverseArr() {
        System.out.println("\nMảng đảo ngược: ");
        for (int i = 0; i < 64; i++) {
            System.out.print(array[63-i] + "\t");
        }
    }
    public static void main(String[] args) {
        inputArr();
        reverseArr();
    }
}

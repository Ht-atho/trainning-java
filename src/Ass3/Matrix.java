package Ass3;

import java.util.Random;

public class Matrix {
    private final int row;
    private final int cols;
    private final double[][] matrix;
    public Matrix(int row, int cols){
        this.row = row;
        this.cols = cols;
        matrix = new double[row][cols];
    }
    public Matrix(double[][] matrix) {
        row = matrix.length;
        cols = matrix[0].length;
        this.matrix = new double[row][cols];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < cols; j++)
                this.matrix[i][j] = matrix[i][j];
    }
    //random value in matrix
    public static Matrix random(int row, int cols) {
        Random rand = new Random();
        Matrix A = new Matrix(row, cols);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                A.matrix[i][j] = rand.nextInt(20);
                System.out.print(A.matrix[i][j] + "\t\t\t");
            }
        System.out.println();}
        return A;
    }

}

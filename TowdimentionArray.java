package towdimentionarray;

import java.util.Scanner;

public class TowdimentionArray {

    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter 3 rows and 4 columns matrix ");

        double[][] grid = new double[3][4];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = scr.nextDouble();
            }
        }
        
        for (int col = 0; col < 4; col++) {
            double sum = sumColumn(grid, col);
            System.out.println("Sum of the elements at column " + col + ":" + sum);
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum = sum + m[row][columnIndex];
        }
        return sum;
    }

}

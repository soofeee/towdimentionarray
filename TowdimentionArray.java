/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package towdimentionarray;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class TowdimentionArray {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 3*4 matrix ");

        double[][] grid = new double[3][4];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = scan.nextDouble();

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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towdimentionarray;

import static towdimentionarray.TowdimentionArray.scan;

/**
 *
 * @author sara
 */
public class MultiplyMatrix {

    public static void main(String[] args) {
        System.out.println("Enter  matrix1 ");
        double[][] a = new double[3][3];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = scan.nextDouble();
            }
        }
        System.out.println("Enter  matrix2 ");
        double[][] b = new double[3][3];
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                b[row][col] = scan.nextDouble();
            }

        }
        double[][] c = multiplyMatrix(a, b);
        System.out.println("The multiplication is :");
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            if (row != 1) {
                System.out.print("\t \t");
            } else {
                System.out.print("\t*\t");
            }

            for (int col = 0; col < a[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }
              if (row != 1) {
                System.out.print("\t \t");
            } else {
                System.out.print("\t=\t");
            }

            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("%3.1f ",c[row][col]);
            }
             System.out.print("\n");
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double c[][]= new double[3][3];
         for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                 for (int k = 0; k < a[row].length; k++) {
                    c[row][col] += a[row][k] * b[k][col];

                  }
            }

        }
         
         return c;
    }

}

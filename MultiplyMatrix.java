package towdimentionarray;
import static towdimentionarray.TowdimentionArray.scan;
import java.util.Scanner;

public class MultiplyMatrix {

    public static void main(String[] args) {

     Scanner scr = new Scanner(System.in);
        System.out.println("Enter  matrix1 ");

        double[][] a = new double[3][3];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = scr.nextDouble();
            }
        }

        System.out.println("Enter  matrix2 ");

        double[][] b = new double[3][3];

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                b[row][col] = scr.nextDouble();
            }
        }

        double[][] c = multiplyMatrix(a, b);

        System.out.println("The multiplication is :");

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            } if (row != 1) {
                System.out.print("\t \t");
              } else {
                System.out.print("\t*\t");  }

            /////////////////////////////////////////////////////
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }  if (row != 1) {
                System.out.print("\t \t");
                } else {
                System.out.print("\t=\t");  }
            /////////////////////////////////////////////////////
            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("%3.1f ",c[row][col]);
            }
             System.out.print("\n");
        }// end of for loop

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {

        double c[][]= new double[3][3];

         for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                 for (int k = 0; k < a[row].length; k++) {
                    c[row][col] += a[row][k] * b[k][col];
                }
            }
        } return c;
    }
}

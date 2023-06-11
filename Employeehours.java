package towdimentionarray;

import static towdimentionarray.TowdimentionArray.scan;

public class Employeehours {

    public static void main(String[] args) {

        int[][] Employeehours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int max = 0;
        int maxind = -1;
        int total = 0;

        for (int row = 0; row < Employeehours.length; row++) {
            int sum = 0;// محتاجة انه كل صف يتكرر فيه
            for (int col = 0; col < Employeehours[row].length; col++) {
                sum = sum + Employeehours[row][col];
            }
            if (sum > max) {
                max = sum;
                maxind = row;
            }
            
            System.out.println("Total hours of Employee " + row + " :" + sum);
            total = total + sum;
        }
        System.out.println("The employee number who worked the maximum hours" + maxind);
        double avg = total / 8.0;
        System.out.println("The Average of the work hours for all employees." + avg);

    }
}

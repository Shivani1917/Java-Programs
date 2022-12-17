//Section C Q2//

import java.util.Scanner;

public class Mult_matrixes {

    public static void main(String[] args) {

        int m, n, p, q;
        int sum = 0;
        int c, d, k;

        Scanner sc = new Scanner(System.in);
        System.out.println("University Roll no.:20105023");
        System.out.println("Enter the number of rows(m) of first matrix:"); 
        m = sc.nextInt();
        System.out.println("Enter the number of columns(n) of first matrix:"); 
        n = sc.nextInt();
        System.out.println();

        int first[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix:");
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = sc.nextInt();

        System.out.println("Enter the number of rows(p) of second matrix:");  
        p = sc.nextInt();
        System.out.println("Enter the number of columns(q) of first matrix:"); 
        q = sc.nextInt();

        if (n != p) {
            System.out.println("The matrices cannot be multiplied with other.");
        } else {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][n];
            System.out.println();

            System.out.println("Enter the elements of second matrix");
            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = sc.nextInt();

            for (c = 0; c < m; c++) {
                for (d = 0; d < n; d++) {
                    for (k = 0; k < p; k++) {
                        sum = sum + first[c][k] * second[k][d];
                    }
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of matrices:");
            for (c = 0; c < m; c++) {
                for (d = 0; d < n; d++) {
                    System.out.print(multiply[c][d] + "\t");
                }
                System.out.println("\n");
            }
        }
    }
}

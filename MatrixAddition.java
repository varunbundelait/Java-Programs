import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows in first matrix:\n");
        int p = sc.nextInt();
        System.out.println("Enter a number of column in first matrix:");
        int q = sc.nextInt();
        System.out.println("Enter a number of rows in second matrix:");
        int r = sc.nextInt();
        System.out.println("Enter a number of column in second matrix:");
        int s = sc.nextInt();
        if (p == r && q == s) {
            int a[][] = new int[p][q];
            int b[][] = new int[r][s];
            int c[][] = new int[r][s];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("first matrix");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {

                    System.out.println(a[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    for (int k = 0; k < q; k++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.println(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
           System.out.println("addition not possible please try again...");
        }

    }
}

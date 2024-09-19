import java.util.Scanner;

public class SeriesPowerSubtract {
    public static void main(String[] args) {
        double sub=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        
        for (int i = 1; i <= n; i++) {
            sub=sub-Math.pow(i, 2);
            
            System.out.println("Result of subtracting squares from 0 to " + n + " is: " + sub);
        }
        
        
    }
}

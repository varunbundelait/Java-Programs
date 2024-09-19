import java.util.Scanner;

public class RightTriangleStarPattern{
    public static void main(String[] args) {
        int i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int n=sc.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
       
    }
} 
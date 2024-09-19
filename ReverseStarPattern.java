import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
        int i, j;
       for(i=n-1; i>=0; i--){
       for(j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println("\n");
       }
    }
}

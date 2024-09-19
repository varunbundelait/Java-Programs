import java.util.Scanner;

public class Sumofseries {
    public static void main(String[] args) {
        double sum=0.0;
        System.out.println("Enter a number sum to be calculate:\n");
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("enter a number:\n");
            int z=sc.nextInt();
            sum=sum+z;
            
        }
        System.out.println("sum of series"+" "+sum);
    }
}

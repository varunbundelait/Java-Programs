import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a numer:\n");
        int n=sc.nextInt();
                if(n==0){
            System.out.println("number is not odd or even");
        }
        else if(n%2==0){
             System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}

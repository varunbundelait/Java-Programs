import java.util.Scanner;

public class FactorialInputUser {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int i=1, fact=1;
        while(i<=n){
            fact=fact*i; 
            i++;
        }
        System.out.println("factorial of the number:"+" "+fact);
    }

}

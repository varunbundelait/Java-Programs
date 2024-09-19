//Swap a number using third number
import java.util.Scanner;

public class SwapNumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:\n");
        int n1=sc.nextInt();
        System.out.println("Enter a second number:\n");
        int n2=sc.nextInt();
        System.out.println("Before Swapping numbers\n:");
        System.out.println("First Number:"+" "+n1);
        System.out.println("Second Number:"+" "+n2);

        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swaping numbers\n");
        System.out.println("First Number:"+" "+n1);
        System.out.println("Second Number:"+" "+n2);

    }
}

import java.util.Scanner;

public class FindGreaterInThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:\n");
        int n1=sc.nextInt();
        System.out.println("Enter a second number:\n");
        int n2=sc.nextInt();
        System.out.println("Enter a third number:\n");
        int n3=sc.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println("n1 is greater number between from given number n1,n2,n3:"+ " "+n1);
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("n2 is greater number between from given number n1,n2,n3:"+ " "+n2);
        }
        else{
            System.out.println("n3 is greater number between from given number n1,n2,n3:"+ " "+n3);
        }
    }
}

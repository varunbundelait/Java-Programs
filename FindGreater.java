import java.util.Scanner;

//for two number is greater number program
public class FindGreater {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first number:\n");
    int n1=sc.nextInt();
    System.out.println("Enter the second number:\n");
    int n2=sc.nextInt();
    if(n1>n2){
        System.out.println("Number1 is greater:"+n1);
    }
    else{
        System.out.println("Number2 is greater:"+n2);
    }
  }
}

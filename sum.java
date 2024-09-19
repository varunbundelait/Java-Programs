import java.util.Scanner;

public class sum {
  //main method
  public static void main(String[] args) {
    //scanner interface
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter a number:\n");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3= n1+n2;
    System.out.println("sum of two numbers:"+" "+n3);
  }
}

import java.util.Scanner;

class Cal {
    public static void main(String[] args) {
        System.out.println("Calculator App");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter case 1 to 4 number:\n");
        int n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println(":Addition:");
                System.out.println("enter a num1:");
                int num1=sc.nextInt();
                System.out.println("enter a num2:");
                int num2=sc.nextInt();
                int num3=num1+num2;
                System.out.println("sum of two numbers:"+" "+ num3);
                break;
            case 2:
                System.out.println(":Subtraction:");
                System.out.println("enter a num1:");
                int num4=sc.nextInt();
                System.out.println("enter a num2:");
                int num5=sc.nextInt();
                int num6=num4-num5;
                System.out.println("subtract of two numbers:"+" "+ num6);
                break;
            case 3:
                System.out.println(":Multiplication:");
                System.out.println("enter a num1:");
                int num7=sc.nextInt();
                System.out.println("enter a num2:");
                int num8=sc.nextInt();
                int num9=num7*num8;
                System.out.println("Multiple of two numbers:"+" "+ num9);
                break;
            case 4:
                 System.out.println(":Division:");
                 System.out.println("enter a num1:");
                 int num10=sc.nextInt();
                 System.out.println("enter a num2:");
                 int num11=sc.nextInt();
                 int num12=num10/num11;
                 System.out.println("Division of two numbers:"+" "+ num12);
                 break;
            default:
                System.out.println("invaild input number");            
        }
    }
}

import java.util.Scanner;

public class sum {
    public static void main(String args[]){
     int a,b,sum;
     Scanner obj = new Scanner(System.in);
     System.out.print("enter the first number "); 
     a=obj.nextInt();
     System.out.print("enter the second number "); 
     b=obj.nextInt();
     sum=a+b;
     System.out.print("the sum is "+ sum);
     obj.close();
    }
}

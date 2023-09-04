import java.util.Scanner;

public class grterthrenum {
    public static void main(String args[]){
        int a,b,c;        
        Scanner obj = new Scanner(System.in);     
        System.out.print("enter the first number "); 
        a=obj.nextInt();
        System.out.print("enter the second number ");      
        b=obj.nextInt();
        System.out.print("enter third number ");      
        c=obj.nextInt();
        if (a>b && a>c)
        {
            System.out.print("a is greater "+ a);           // greatest of three number
        }
        else if (c>a && c>b)
        {
            System.out.print("c is greater "+ c);
        }
        else
        {
            System.out.print("b is greater "+ b);
        }
        obj.close();
  }
}
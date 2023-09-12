
import java.util.Scanner;

public class size {
     public static void main(String args[]){
    int n;
    System.out.println("enter size");
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    if(n==4){
         System.out.println("integer and float");
    }
    else if(n==2){
         System.out.println("character");
    }
    else if(n==8){
         System.out.println("double and long");
    }
    else if(n==1){
         System.out.println("boolean");
    }
    else
    {
        System.out.println("not a datatype");
    }
}
}
import java.util.Scanner;

public class string {
    public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("enter 1");
       String s1=obj.nextLine();
       System.out.println("enter 2");
       String s2=obj.nextLine();
       if(s1.equals(s2))
       {
         System.out.println("hello");
       }
       else
       {
         System.out.println("not hello");
       }
}
}
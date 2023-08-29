import java.util.Scanner;

public class one {
     public static void main (String args[]) {
        int a,b;                                  
        Scanner obj = new Scanner(System.in);     
        System.out.print("enter the first number "); 
        a=obj.nextInt();
        System.out.print("enter the first number "); 
        b=obj.nextInt();
        //input a=8 b= 11
        System.out.println(++a);    //a=9  
        System.out.println(a++);    //a=9 assign
        System.out.println(b--);    //b=11 assign
        System.out.println(--b);    //b=9 
        System.out.println(++a + b--);  //a=11 b= 9 aassign 20
        System.out.println(++b - a++);  //b=9 a=11 assign -2
        System.out.println(a++ - ++b);  //a=12 assign  b=10 2
        System.out.println(--a + --b);  //a=12 b=9 21
        System.out.println(--b - --a);  //b=8 a=11 -3
}
}
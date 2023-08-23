/* 
// using third variable
public class swap 
{
    public static void main(String args[]){
        int a=4,b=5,temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print("after swapping a=" + a + " b=" + b);
    }
}*/
// without using third variable
import java.util.*;
public class swap{
    public static void main(String args[]){
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a value ");
        a=obj.nextInt();
        System.out.print("enter b value ");
        b=obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("after swapping a=" + a + " b=" + b);
        obj.close();
    }
}

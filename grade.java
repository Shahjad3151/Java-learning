import java.util.*;
public class grade {
    public static void main (String args[]) {
        int num;                                             // grade problem
        Scanner obj = new Scanner(System.in);     
        System.out.print("enter the  number "); 
        num=obj.nextInt();
     
        if(num>80 && num<=100)
        {
            System.out.println("grade A");
        }
        else if(num>60 && num<=80)
        {
            System.out.println("grade B");
        }
        else
        {
            System.out.println("grade c");
        }
    obj.close();
}
}

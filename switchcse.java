import java.util.Scanner;
public class switchcse {
    public static void main (String args[]) {
        int num;                                  // grade problem
        Scanner obj = new Scanner(System.in);     
        System.out.print("enter the  number "); 
        num=obj.nextInt();
    switch(num){
        case 0: System.out.println("sunday");   
               break;                           //break ni lagaiyenge to sb print hoga
        case 1: System.out.println("monday");
               break;
        case 2: System.out.println("tuesday");
               break;
        case 3: System.out.println("wednesday");
               break;
        case 4: System.out.println("thrusday");
               break;
        case 5: System.out.println("friday");
               break;
        case 6: System.out.println("saturday");
               break;
        default:System.out.println("invalid");
               break;
    }
    obj.close();
}
}
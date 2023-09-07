import java.util.*;
public class user_input {
    public static void main(String[] args)
    {
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        two obj1=new two();
        System.out.println(obj1.w);
        System.out.println(obj1.q);
}

}
class two{
    Scanner obj=new Scanner(System.in);
    int w=obj.nextInt();
    int q=obj.nextInt();
}
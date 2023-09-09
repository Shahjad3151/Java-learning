class parents{
    int a=9;
}
class child extends parents{
    int b=8;
}
public class snglinhritance {
    public static void main(String[] args)
    {
        child obj=new child();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}

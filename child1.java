 class inheritance {
    int a=5;
    int b=9;
}
class child1 extends inheritance{
    public static void main(String[] args)
    {
        child1 obj=new child1();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
}
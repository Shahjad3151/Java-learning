class parents{
    void read(){
    //int a=9;
    System.out.println("apple");
    }
}
class child extends parents{
    void write(){
    //int b=8;
    System.out.println("orange");
    }
}
class son extends child {
    void wrote(){
    //int c=2;
    System.out.println("mango");
    }
}

public class multilevel {
     public static void main(String[] args)
    {
        son obj=new son();
       /*System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);*/
        obj.read();
        obj.write();
        obj.wrote();
    }
}

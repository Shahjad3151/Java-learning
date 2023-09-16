import java.util.*;
public class vowel {
    public static void main(String args[]){
    char ch;
    System.out.println("enter character");
    Scanner sc=new Scanner(System.in); 
    ch=sc.next().charAt(0);

    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    System.out.println("vowel");
    else if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    System.out.println("vowels");
    else
    System.out.println("constonat");

}
}
//Program to convert string to integer (no space and letters greater than s)
import java.util.Scanner;
public class w1a3
{
    public static void main(String args[])
    {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        a=s.nextLine();
        int b = Integer.parseInt(a,29);
        System.out.println(b);
        s.close();
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a3.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a3      
Enter a string : Hello
12383517
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a3
Enter a string:Toys
Exception in thread "main" java.lang.NumberFormatException: For input string: "Toys" under radix 29
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at w1a3.main(w1a3.java:11)
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
import java.util.Scanner;
public class w1a1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=s.nextInt();
        System.out.print("Enter a number:");
        b=s.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        System.out.println("Quotient: "+(a/b));
        s.close();
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a1.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a1  
Enter a number:50                    
Enter a number:2
Sum: 52
Difference: 48
Product: 100
Quotient: 25
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
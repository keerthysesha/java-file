import java.util.Scanner;
public class w1a2
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner (System.in);
        System.out.print("Enter a number: ");
        a=s.nextInt();
        System.out.print("Enter a number: ");
        b=s.nextInt();
        if(a==b)
        {
            System.out.println("Numbers are the same.");
        }
        else if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
        s.close();
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a2.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a2      
Enter a number: 20
Enter a number: 20
Numbers are the same.
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a2      
Enter a number: 70
Enter a number: 50
70 is greater than 50
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a2      
Enter a number: 6
Enter a number: 21
21 is greater than 6
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
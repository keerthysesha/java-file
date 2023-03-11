import java.util.Scanner;
public class w1a4
{
    public static void main(String args[])
    {
        int i,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Find the area of rombus using:");
        System.out.println("\t1.Diagonals");
        System.out.println("\t2.Base and Height");
        System.out.print("Enter a choice:");
        i=s.nextInt();
        switch (i) 
        {
            case 1:
                System.out.print("Enter Diagonal1: ");
                int d1=s.nextInt();
                System.out.print("Enter Diagonal2: ");
                int d2=s.nextInt();
                a=(d1*d2)/2;
                System.out.println("AREA: "+a+" sq.units");
                break;
            case 2:
                System.out.print("Enter Base: ");
                int b=s.nextInt();
                System.out.print("Enter Height: ");
                int h=s.nextInt();  
                a=b*h;    
                System.out.println("AREA: "+a+" sq.units");
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        s.close();
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a4.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a4      
Find the area of rombus using:
        1.Diagonals
        2.Base and Height
Enter a choice: 2
Enter Base: 25
Enter Height: 63
AREA: 1575 sq.units
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a4
Find the area of rombus using:
        1.Diagonals
        2.Base and Height
Enter a choice: 1
Enter Diagonal1: 52
Enter Diagonal2: 64
AREA: 1664 sq.units
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
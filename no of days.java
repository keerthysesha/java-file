import java.util.*;
public class w1a5
{
    public static void main(String args[])
    {
        String a;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the month: ");
        a=s.nextLine();
        System.out.print("Enter the year: ");
        int y=s.nextInt();
        if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("October")||a.equals("December"))
        {
            System.out.println(a+" has 31 days");
        }
        else if(a.equals("February")&&(y%4==0))
        {
            System.out.println("February has 29 days");
        }
        else if(a.equals("February"))
        {
            System.out.println("February has 28 days");
        }
        else
        {
            System.out.println(a+" has 30 days");
        }
        s.close();
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a5.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a5      
Enter the month: January
Enter the year: 2025
January has 31 days
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a5
Enter the month: February
Enter the year: 2020
February has 29 days
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a5      
Enter the month: February
Enter the year: 2023
February has 28 days
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a5
Enter the month: August
Enter the year: 2023
August has 31 days
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a5
Enter the month: June
Enter the year: 2456
June has 30 days
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
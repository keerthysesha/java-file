import java.util.Scanner;
public class w1a8
{
    public static void main(String args[])
    {
        int i,n,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Upto what do you want?: ");
        j=s.nextInt();
        System.out.println("___________________________");
        System.out.print("\n MULTIPLICATION TABLE OF ");
        n=s.nextInt();
        System.out.println("___________________________");
        System.out.println(" ");
        s.close();
        for(i=1;i<=j;i++)
        {
            System.out.println("\t"+i+" x "+n+" = "+(i*n));
        }
        System.out.println(" ");
    };
}

OUTPUT:
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a8.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a8      
Upto what do you want?: 20
___________________________

 MULTIPLICATION TABLE OF 8
___________________________
 
        1 x 8 = 8
        2 x 8 = 16
        3 x 8 = 24
        4 x 8 = 32
        5 x 8 = 40
        6 x 8 = 48
        7 x 8 = 56
        8 x 8 = 64
        9 x 8 = 72
        10 x 8 = 80
        11 x 8 = 88
        12 x 8 = 96
        13 x 8 = 104
        14 x 8 = 112
        15 x 8 = 120
        16 x 8 = 128
        17 x 8 = 136
        18 x 8 = 144
        19 x 8 = 152
        20 x 8 = 160

PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> 
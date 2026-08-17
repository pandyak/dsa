import java.util.*;
import java.util.Scanner;
class pt
{
      public void print1(int n)
         {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
         }
            
}
class pattern1
    {
        public static void main(String args[])
        {
           pt p=new pt();
           int t=2;
           for(int i=0;i<t;i++)
           {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter the value of n");
                 int n=sc.nextInt();
                 p.print1(n);
           }
          
        }
    }
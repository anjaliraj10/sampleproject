import java.util.Arrays;
import java.util.Scanner;

//3
public class ArrayIntialize
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        Arrays.fill(a,5);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("value of a["+i+"] : "+a[i]);
        }
        System.out.println();
        //Intilizing using for loo[p
     int b[] = new int[5];
        for(int i=0;i<b.length;i++)
        {
            b[i] = i+1;
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println("value of b[" + i + "] : " + b[i]);
        }
        System.out.println();
        //Intialization by user
        int c[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Integers : ");
        for(int i=0;i<c.length;i++)
        {
            c[i] = sc.nextInt();
        }
       for(int i=0;i<c.length;i++)
        {
            System.out.println("Array values for c["+i+"] :"+c[i]);
        }


    }
}

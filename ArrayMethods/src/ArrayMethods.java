import java.util.Scanner;

public class ArrayMethods
{
    public static void main(String[] args)
    {
        int a[] = new int[]{1,2,3,4,5};

        displayArray(a);
        int r[]=getValues();
        displayArray(r);

    }
    public static void displayArray(int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.println("Values of b["+i+"] : "+b[i]);
        }
    }
    //passing array to the method
    public static int[] getValues()
    {
        System.out.println("Please enter the values for array : ");
        int temp[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++)
            temp[i] = sc.nextInt();

        return temp;
        }
    }


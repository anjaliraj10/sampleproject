public class ArrayExample
{
    public static void main(String[] args)
    {
        int a[];
        int[] b;

        a = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("value of a["+i+"] : "+a[i]);
        }
        System.out.println();
        b = new int[] {100,200,300,400,500};
        for(int j=0; j<b.length;j++)
        {
            System.out.println("value of b["+j+"] : "+b[j]);
        }
    }
}

public class FirstJavaClass {
    public static void main(String []args)
    {
        int n = 15, n1 = 0, n2 = 1;
        System.out.print("First " + n + " terms are : ");
        for (int i = 1; i <= n; i++)
        {
            if(i==n)
            {
                System.out.print(n1 + ". ");
            }
            else
            {
                System.out.print(n1 + ", ");
            }
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

}

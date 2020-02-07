public class EncapsulationMain
{
   public static void main(String args[])
   {
       A a = new A();
       //a.var=100;
       System.out.println("Value of var : " +a.getVar());
       a.setVar(100);
       System.out.println("Value of var : " +a.getVar());
       a.setVar(1500);
       System.out.println("Value of var : " +a.getVar());

   }
}

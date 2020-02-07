public class A
{
    private int var;

    //Getter (in this case anyone can use private member even out of the class)
    public int getVar()
    {
        return var;
    }
    //Setter (It is used to set the value for the private member)
    public void setVar(int var)
    {
        if(var>1000)
        {
            this.var = 0;
        }
        else
        {
            this.var = var;
        }
    }
}

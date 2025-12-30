

class Demo 
{
    public int i ;
    public static int j ;

    static 
    {
        j = 21;
    }
    Demo ()
    {
        System.out.println("Inside Demo ");
        this.i = 11;
    }
    public Demo(int a )
    {
        this();
        System.out.println("Inside Parameterized ");
    }
    public void Display()
    {
        System.out.println("Inside display"+ this.i);
    }
    

}
class ThisDemo
{
    public static void main (String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();

    }
}
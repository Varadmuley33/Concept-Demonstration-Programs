class Demo
{
    public int iNo1; 
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }

    public Demo(int i,int j )
    {
        System.out.println("Inside Parameterized constructor");
    }

    protected void finalize()                      // ~Demo()    in Cpp
    {
        System.out.println("Inside finalize");
    }

}
class ConstructorDestructor
{
    public static void main (String Arr[])
    {
      Demo dobj1 = new Demo();                   //Demo dobj1();          in Cpp
      Demo dobj2 = new Demo(11,21);          // Demo dobj2(11,21);    in Cpp

      dobj1 = null;
      dobj2 = null;
      
      System.gc();

      System.out.println("End of Main");


    }
}
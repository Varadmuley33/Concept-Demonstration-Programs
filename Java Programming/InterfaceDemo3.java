 interface Demo 
 {
    int no = 11;                   // public ,static, final
    void Display ();               // public ,abstract

 }
 class Hello implements Demo
 {
   public void Display ()
   {
      System.out.println("Inside Display ");
   }
 }
 class InterfaceDemo3
 {
    public static void main (String A[])
    {
      System.out.println(Demo.no);
      // Demo.no = 12;                           // No is final 

      Hello hobj = new Hello();             // Error

      hobj.Display();
        
    }
    
 }

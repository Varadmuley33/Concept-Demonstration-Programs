import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient3
{
    public static void main (String A [])  throws Exception
    {
        System.out.println("Client is running ");


        Socket sobj = new Socket("Localhost",2100); 
        System.out.println("Server Successfully connected  ");

        DataInputStream diobj = new DataInputStream (sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int No1 = 11 , No2 = 10;

        doobj.writeInt(No1);
        doobj.writeInt(No2);



        int sum = diobj.readInt();
        System.out.println("Addition of two numbers is : "+ sum);
       
        sobj.close();

        System.out.println("Client application terminated.... ");
    }
}






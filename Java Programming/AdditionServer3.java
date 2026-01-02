import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main (String A [])  throws Exception
    {
        System.out.println("Client is running ");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port number 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and accepted by server ");

        DataInputStream diobj = new DataInputStream (sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int No1 = 0 , No2 = 0 ;

       No1 = diobj.readInt();
       No2 = diobj.readInt();

       int sum = No1 + No2 ;

       doobj.writeInt(sum);


       sobj.close();
       ssobj.close();
       System.out.println("Server application terminated.... ");
    }
}



import java.net.*;
import java.io.*;
import java.util.*;

class TCPDateServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5217);
            System.out.println("Server ready to connect ...");
            Socket soc=s.accept();
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date : " + (new Date()).toString() + "\n");
			System.out.println("Tak Completed!!\nServer Exiting!!!");
            out.close();
            soc.close();     
    }
}

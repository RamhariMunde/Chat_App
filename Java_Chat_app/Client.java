/* This is a java Application which will comunicate eith each other.
To parform the comunication we use the consept of socket programing.

import java.net.* :- ServerSocket Class is used for providing system-independent implementation of the server-side of a
                     client/server Socket Connection.

 Socket s :- it is a socket class object which is use to connect server socket.

 while creating this object we have pass two paramiter as the IP address of Server & the Port Number of the Server Application.

*/

import java.net.*;
import java.io.*;

public class Client
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client application is running...");

        Socket s = new Socket("localhost",2100);
        // it is a socket class object which is use to connect server socket.
        System.out.println("Client is waiting for the server to accept the request");

        PrintStream ps = new PrintStream(s.getOutputStream()); 
        // this object is use the to send the data to the server Application as it is send the data it is considerd as output stream.

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        // it is use the accept the input from  server input stream.

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));        
       // it is use to output from keyword

        String str1, str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.print("Enter message for server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }
    }
}

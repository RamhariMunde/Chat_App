/* This is a java Application which will comunicate eith each other.
To parform the comunication we use the consept of socket programing.
import java.net.* :- ServerSocket Class is used for providing system-independent implementation of the server-side of a
                     client/server Socket Connection.
*/
import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ss = new ServerSocket(2100);
        // it is a object of server socket class which is use to creat the server and start the server in lisning mode.
        System.out.println("Server is running at port no 2100 and waiting for client request");

        Socket s = ss.accept();
        // it is object of socket class which is use to accept the request which cons from the client.
        System.out.println("Request of client gets accepted");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // br1 it is object of print stream class use to send the data to the client application.
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        // br2 it is object of BufferedReader use to accept the Input from keyword.
        
        String str1, str2;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.print("Enter message for client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
    }
}

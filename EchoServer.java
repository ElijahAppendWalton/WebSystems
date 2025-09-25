import java.io.*;
import java.net.*;

public class EchoServer {

    public static void main(String[] args) throws IOException{
        int portNo=5000;
        ServerSocket serverSocket;
        Socket clientSocket;
        PrintWriter out;
        BufferedReader in;
        String inputLine;

        serverSocket = new ServerSocket(portNo);

            System.out.printf("Listening on Port 5000...\n");
            clientSocket = serverSocket.accept();
            System.out.printf("Client Connection accepted...\n");
            
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            inputLine = in.readLine();
            System.out.printf("Message: %s\n",inputLine);
            out.printf("Recieved: %s\n",inputLine);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        }
    }
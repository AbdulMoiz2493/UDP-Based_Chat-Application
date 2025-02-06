import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

    public static void main(String[] args) throws Exception{
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Server Connected...");
            ServerSocket ss = new ServerSocket(1500);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            while (true) {
                String receivedMessage = dis.readUTF();
                System.out.println("Client entered: " + receivedMessage);

                if (receivedMessage.equalsIgnoreCase("GoodBye")) {
                    System.out.println("Client has ended the chat. Goodbye!");
                    break; 
                }

                System.out.print("Server: ");
                String message = input.nextLine();
                dout.writeUTF(message);
                dout.flush(); 

               
            }
            
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Server Connected...");
            ServerSocket ss1 = new ServerSocket(1600);
            Socket s1 = ss1.accept();
            System.out.println();
            System.out.println();
            System.out.println("New client connected");
            DataInputStream dis1 = new DataInputStream(s1.getInputStream());
            DataOutputStream dout1 = new DataOutputStream(s1.getOutputStream());

            while (true) {
                String receivedMessage = dis1.readUTF();
                System.out.println("Client 2 entered: " + receivedMessage);

                if (receivedMessage.equalsIgnoreCase("GoodBye")) {
                    System.out.println("Client 2 has ended the chat. Goodbye!");
                    break; 
                }

                System.out.print("Server: ");
                String message = input.nextLine();
                dout1.writeUTF(message);
                dout1.flush(); 

               
            }

            ss.close();
            ss1.close();

           
            
            
 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
       
    }
}
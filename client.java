import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) throws Exception{
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Client Connected...");
            Socket s = new Socket("localhost", 1500);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            
            
            do {
                System.out.print("Client: ");
                String message = input.nextLine();
                dout.writeUTF(message);
                dout.flush(); 

                if (message.equalsIgnoreCase("GoodBye")) {
                    break; 
                }

                String receivedMessage = din.readUTF();
                System.out.println("Server entered: " + receivedMessage);
  
            }while (true);

            dout.close();
            s.close();
            
            
            
            Scanner input1 = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("New Client Connected...");
            Socket s1 = new Socket("localhost", 1600);
            DataInputStream din1 = new DataInputStream(s1.getInputStream());
            DataOutputStream dout1 = new DataOutputStream(s1.getOutputStream());

            
            
            do {
                System.out.print("Client 2: ");
                String message = input1.nextLine();
                dout1.writeUTF(message);
                dout1.flush(); 

                if (message.equalsIgnoreCase("GoodBye")) {
                    break; 
                }

                String receivedMessage = din1.readUTF();
                System.out.println("Server entered: " + receivedMessage);
  
            }while (true);

            dout1.close();
            s1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
       
        

    }
}
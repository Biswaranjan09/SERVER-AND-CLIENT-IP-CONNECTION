# SERVER-AND-CLIENT-IP-CONNECTION

server side-->>
import java.net.*;

class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(888);
            System.out.println("Server started.....");
            Socket s=ss.accept();
            System.out.println("Our 1st Server is called");
            ss.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
}

client side-->>
import java.net.Socket;

class Client {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",888);
            s.close();

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

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

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 1111;
        String host = "127.0.0.1";
        try{
            InetAddress serveraddress = InetAddress.getByName(host);
            ServerSocket socket = new ServerSocket(port,50,serveraddress);
            System.out.println("server now listening...");
            while(true){
                Socket sock = socket.accept();
                System.out.println("Client :"+sock.getInetAddress().getHostAddress());
                socket.close();
            }
        } catch(IOException ex){
            System.out.println("Server successfully connects a client and close");
        }
        
    }
}
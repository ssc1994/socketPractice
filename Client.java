import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSock = new Socket("localhost",5050);
        System.out.println("Connection Complete");


    }
}

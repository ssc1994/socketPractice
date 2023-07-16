import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        //서버 포트 지정
        int port = 5050;

        //명령줄로
        int number = Integer.parseInt(args[0]);

        try {
            ServerSocket serverSocket = new ServerSocket(port);
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("00000000000000000Socket Creat Error00000000000000000");
            System.exit(0);
        }


        System.out.println("Waiting for Connection");

        while(true){
            try {
                Socket serverSock = serverSocket.accept();
                System.out.println("Client Connected");
                System.out.println("Client IP : "+  serverSock.getInetAddress());
            }catch (){

            }
        }

    }
}

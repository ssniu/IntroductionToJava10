import java.io.*;
import java.net.*;
import java.util.Date;

public class MultiThreadServer {
  private int clientNo = 0;

  new Thread(() -> {
    try{
      //Create a server socket
      ServerSocket serverSocket = new ServerSocket(8000);

      while(true){
        //Listen for a new connection request
        Socket socket = serverSocket.accept();

        //Increment clientNo
        clientNo++;

        //Find the client's host name, and IP address
        InetAddress inetAddress = socket.getInetAddress();

        new Thread(new HandleAClient(socket)).start();
      }
    }catch(IOException ex){
      System.err.println(ex);
    }
  }).start();
}

//Define the thread class for handling new connection
class HandleAClient implements Runnable{
  //A connected socket
  private Socket socket;
  //Construc a Thread
  public HandleAClient(Socket socket){
    this.socket = socket;
  }
  //Run a thread
  public void run(){
    try{
      //Create data input and output streams
      DataInputStream inputFromClient = new DataInputStream(
         socket.getInputStream());
      DataOutputStream outputToClient = new DataOutputStream(
        socket.getOutputStream());

      //Continuously server the client
      while(true){
        //Receive radius from the client
        double radius = inputFromClient.readDouble();

        //Compute area
        double area = radius * radius * Math.PI;

        //Send area back to the client
        outputToClient.writeDouble(area);

      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}

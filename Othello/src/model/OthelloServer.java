package model;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import view.WindowsServerInfo;
/**
 * Creates a thread for every packet received
 * @author Stefano Zappa
 */
public class OthelloServer extends Thread{
    /**
    *Boolean variable to identify the first player who is connected to server 
    */
    public static boolean player1 = false;
    /**
    *Counter of started matchs
    */
    public static int MatchNumber = 0;
    /**
    *InetAddress of the first of two players who enter
    */
    public static InetAddress IP_1 = null;
    /**
    *Socket of the first of two players who enter
    */
    public static Socket S1;
    /**
    *Number of the default port of the server.
    *It can be changed
    */
    public static int Port = 2000;
    
    /**
    *Thread who start ServerThread thread, creating a socket
    */
    @Override
    public void run(){
        try{
            System.out.println("Port : " + Port);
            ServerSocket ss = new ServerSocket(Port);
            java.awt.EventQueue.invokeLater(() -> {
                new WindowsServerInfo().setVisible(true);
                WindowsServerInfo.writeNumberPort("" + Port);
            });
            while (true) {
                new ServerThread(ss.accept()).start();
            } 
        }catch(Exception ex1){ System.out.println("Eccezione nel server " + ex1); }  
    }
}
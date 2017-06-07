package model;

import java.io. *;
import java.net.*;
import java.util.Random;

/**
 * Class witch creates a socket and starts the match if two clients are connected
 * @author Stefano Zappa
 */
public class ServerThread extends Thread{
    /**
     * Local socket created
     */
    private Socket s;
    /**
     * Constructor of ServerThread 
     * @param s Socket from OthelloServer class
     */
    public ServerThread(Socket s) {
        this.s = s;
    }
    /**
     * Thread who runs GameStarter only if there are two user connected
     */
    @Override
    public void run() {
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str = in.readLine();
            if (str.equals("connection;")){
                System.out.println(str);
                if (OthelloServer.player1 == false){
                    
                    OthelloServer.S1 = s;
                    OthelloServer.IP_1 = s.getInetAddress();
                    System.out.println(s.getInetAddress()+" : "+s.getPort());
                    OthelloServer.player1 = true;
                   
                }
                else{
                    System.out.println(s.getInetAddress()+" : "+s.getPort());
                    
                    new GameStarter(OthelloServer.S1, s, NameGenerator(), 
                            OthelloServer.IP_1,s.getInetAddress()).start();
                    
                    OthelloServer.IP_1 = null;
                    OthelloServer.player1 = false;
                }
            }
            
        } catch (IOException ex) {
            System.err.println(ex);
        }
    
    }
    /**
     * Method to generate an univocal string
     * Randomly the method forms words composed by some characters of each string array
     * @return String of randomly combined characters with the addition of a sequential number
     */
    private String NameGenerator() {
        OthelloServer.MatchNumber = OthelloServer.MatchNumber +1;
        String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
         "Mar", "Luk" };
        String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
         "marac", "zoir", "slamar", "salmar", "urak" };
        String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
         "tron", "med", "ure", "zur", "cred", "mur" };
   
        Random rand = new Random();
        return Beginning[rand.nextInt(Beginning.length)] + 
                  Middle[rand.nextInt(Middle.length)]+
                  End[rand.nextInt(End.length)]+OthelloServer.MatchNumber;
	}
}

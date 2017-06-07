package model;

import controller.FieldController;
import java.io. *;
import java.net. *;

/**
 * Starts the game and checking of movements
 * @author Stefano Zappa
 */
public class GameStarter extends Thread {
    /**
     * Variable used to exit from a <code>while</code> structure while the match is finished
     */
    public static boolean b = false;
    /**
     * This variable is used to identify if the match is the first
     */
    private boolean FirstRound = true;
    /**
     * This variable contains the name of the match generated by <code>ServerThread</code>
     */
    private final String MatchName;
    /**
     * Contains the <code>InetAddress</code> of the two client identified by two differents IP and ports 
     */
    private final InetAddress IP_1, IP_2;
    /**
     * <code>BufferedReader</code> object to create a buffer for each clients
     */
    private BufferedReader in_IP1, in_IP2;
    /**
     * <code>PrintWriter</code> object to create a buffer for each clients
     */
    private PrintWriter out_IP1, out_IP2; 
    /**
     * Object <code>Socket</code> for the two clients
     */
    private final Socket S1, S2;
    /**
     * Number of pawn placed
     */
    private int Num;
    /**
     * Used to check the field and valid the movements
     */
    private FieldController FC;
    /**
     * Variables used to estabilish the round
     */
    public static String round,g;
    
    /**
     * Constructor of <code>GameStarter</code>
     * It makes only assigments
     * @param s1 Socket of the first client
     * @param s2 Socket of the second client
     * @param MatchName Name of the match generated
     * @param IP_1 IP address and port number of client one
     * @param IP_2 IP address and port number of client two
     */
    public GameStarter (Socket s1, Socket s2, String MatchName, InetAddress IP_1, InetAddress IP_2){
        S1 = s1;
        S2 = s2;
        this.IP_1 = IP_1;
        this.IP_2 = IP_2;
        this.MatchName = MatchName;

    }
    
    /**
     * This method receive positions and send positive or negative reply if the movemets are legal or not.
     */
    @Override
    public void run () {
        FC = new FieldController();
        Num = 4;
        b = false;
        round = "black";
        try {
            while (b == false){
            in_IP1 = new BufferedReader(new InputStreamReader(S1.getInputStream()));
            in_IP2 = new BufferedReader(new InputStreamReader(S2.getInputStream()));
            out_IP1 = new PrintWriter(new OutputStreamWriter(S1.getOutputStream()),true);
            out_IP2 = new PrintWriter(new OutputStreamWriter(S2.getOutputStream()),true);
            
                if (FirstRound == true){
                    out_IP1.println("start: <"+MatchName+">, <black>;");
                    out_IP1.println("round: <black>;");
                        System.out.println(IP_1+" start: <"+MatchName+">, <black>;");
                    out_IP2.println("start: <"+MatchName+">, <white>;");
                    out_IP2.println("round: <black>;");
                        System.out.println(IP_2+" start: <"+MatchName+">, <white>;");
                    FirstRound = false;
                }
                
                if (round.equals("black")){
                    System.out.println("Tocca al nero");
                    boolean h = false;
                    FC.EndGameChecker();
                        if (g.equals("round: <white>;")){
                            round = "white";
                            out_IP1.println(g);
                            out_IP2.println(g);
                            h = true;
                        }
                        if (g.contains("end")){
                            out_IP1.println(g);
                            out_IP2.println(g);
                            h = true;
                            b = true;
                        }
                    while (h == false){
                        String B = in_IP1.readLine();
                        System.out.println(B);
                        if (B.contains("place: <")){
                            int x = Character.getNumericValue(B.charAt(8));
                            int y = Character.getNumericValue(B.charAt(13));
                            System.out.println(x + "  "+ y);
                            String s = FC.Place (x,y, true);
                            
                            if (s.equals("move not valid;")){
                                out_IP1.println(s);
                            }   
                            else {
                                out_IP1.println(s);
                                out_IP2.println(s);
                                System.out.println("\n"+s);
                                
                                if (s.contains("update:")){
                                    if (Num == 63){
                                        out_IP1.println(FC.cont());
                                        out_IP2.println(FC.cont());
                                    }
                                    else{
                                        Num = Num +1;
                                        out_IP1.println("round: <white>;");
                                        out_IP2.println("round: <white>;");
                                        round = "white";
                                    }
                                }
                                h = true;
                            }
                        }
                    }
                }

                else if (round.equals("white")){
                    System.out.println("Tocca al bianco");
                    boolean h = false;
                    FC.EndGameChecker();
                        if (g.equals("round: <black>;")){
                            round = "black";
                            out_IP1.println(g);
                            out_IP2.println(g);
                            h = true;
                        }
                        if (g.contains("end")){
                            out_IP1.println(g);
                            out_IP2.println(g);
                            h = true;
                            b = true;
                        }
                    while (h == false){
                        String B = in_IP2.readLine();
                        System.out.println(B);
                        if (B.contains("place: <")){
                            int x = Character.getNumericValue(B.charAt(8));
                            int y = Character.getNumericValue(B.charAt(13));
                            System.out.println(x + "  "+ y);
                            String s = FC.Place (x,y, false);
                            
                            if (s.equals("move not valid;")){
                                out_IP2.println(s);
                            }   
                            else {
                                out_IP1.println(s);
                                out_IP2.println(s);
                                System.out.println("\n"+s);
                                
                                if (s.contains("update:")){
                                    if (Num == 63){
                                        out_IP1.println(FC.cont());
                                        out_IP2.println(FC.cont());
                                    }
                                    else{
                                        Num = Num +1;
                                        out_IP1.println("round: <black>;");
                                        out_IP2.println("round: <black>;");
                                        round = "black";
                                    }
                                }
                                h = true;
                            }
                        }
                    }
                }
                FC.printGrid();
            }
        } catch (Exception ex) {
            out_IP1.println(FC.cont());
            out_IP2.println(FC.cont());
            System.err.println("run error");
            ex.printStackTrace();
        }
        try {
            System.out.println("Closing connection...");
            S1.close();
            S2.close();
        } catch (IOException ex) {
            System.err.println("Error while closing connection");
        }
        
    }
}

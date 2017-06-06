package model;

import view.MainWindows;
import static view.MainWindows.ButtonLocation100;
import static view.MainWindows.ButtonLocation101;
import static view.MainWindows.ButtonLocation102;
import static view.MainWindows.ButtonLocation103;
import static view.MainWindows.ButtonLocation104;
import static view.MainWindows.ButtonLocation105;
import static view.MainWindows.ButtonLocation106;
import static view.MainWindows.ButtonLocation107;
import static view.MainWindows.ButtonLocation108;
import static view.MainWindows.ButtonLocation109;
import static view.MainWindows.ButtonLocation110;
import static view.MainWindows.ButtonLocation111;
import static view.MainWindows.ButtonLocation112;
import static view.MainWindows.ButtonLocation113;
import static view.MainWindows.ButtonLocation114;
import static view.MainWindows.ButtonLocation115;
import static view.MainWindows.ButtonLocation116;
import static view.MainWindows.ButtonLocation117;
import static view.MainWindows.ButtonLocation118;
import static view.MainWindows.ButtonLocation119;
import static view.MainWindows.ButtonLocation120;
import static view.MainWindows.ButtonLocation121;
import static view.MainWindows.ButtonLocation122;
import static view.MainWindows.ButtonLocation123;
import static view.MainWindows.ButtonLocation124;
import static view.MainWindows.ButtonLocation125;
import static view.MainWindows.ButtonLocation126;
import static view.MainWindows.ButtonLocation127;
import static view.MainWindows.ButtonLocation128;
import static view.MainWindows.ButtonLocation129;
import static view.MainWindows.ButtonLocation130;
import static view.MainWindows.ButtonLocation131;
import static view.MainWindows.ButtonLocation132;
import static view.MainWindows.ButtonLocation133;
import static view.MainWindows.ButtonLocation134;
import static view.MainWindows.ButtonLocation135;
import static view.MainWindows.ButtonLocation136;
import static view.MainWindows.ButtonLocation137;
import static view.MainWindows.ButtonLocation138;
import static view.MainWindows.ButtonLocation20;
import static view.MainWindows.ButtonLocation29;
import static view.MainWindows.ButtonLocation30;
import static view.MainWindows.ButtonLocation39;
import static view.MainWindows.ButtonLocation40;
import static view.MainWindows.ButtonLocation49;
import static view.MainWindows.ButtonLocation50;
import static view.MainWindows.ButtonLocation59;
import static view.MainWindows.ButtonLocation60;
import static view.MainWindows.ButtonLocation69;
import static view.MainWindows.ButtonLocation70;
import static view.MainWindows.ButtonLocation79;
import static view.MainWindows.ButtonLocation80;
import static view.MainWindows.ButtonLocation89;
import static view.MainWindows.ButtonLocation90;
import static view.MainWindows.ButtonLocation91;
import static view.MainWindows.ButtonLocation92;
import static view.MainWindows.ButtonLocation93;
import static view.MainWindows.ButtonLocation94;
import static view.MainWindows.ButtonLocation95;
import static view.MainWindows.ButtonLocation96;
import static view.MainWindows.ButtonLocation97;
import static view.MainWindows.ButtonLocation98;
import static view.MainWindows.ButtonLocation99;
import static view.MainWindows.b00;

/**
 * classe che contiene tutte le informazioni necessarie al controllo della partita
 * @author negri.gioele
 */
public class Memory {
    /*VARIABLE*/
    private static String ipAddress; //Stringa contenente l'ip server
    private static int numberPort = 0; //intero contenente il numero di porta 
    private static String myColor = ""; //stringa contenente il colore del giocatore
    private static String turnColor = "null"; //stringa contenente il colore del turno
    private static int numberTurn = 0; //intero contenente il numero di turni totali giocati
    private static boolean N, S, E, W, NE, NW, SE, SW;//boolean per la gestione del cambiamento delle pedine durante i turni
    /**
     * array della scacchiere
     * 0 --> cella vuota
     * 1 --> cella nera
     * 2 --> cella bianca
     */
    private static  int map[][] = new int[8][8];
    /**
     * aray della scacchiera per aiuti
     * 3 -> cella suggerimento
     */
    private static int mapHelp[][] = new int[8][8];
    
    /*METHODS*/
    /**
     * metodo per aggiungere l'ip alla memoria.
     * @param ip String contenente l'ip.
     */
    public static synchronized void setIpAddress(String ip){
        ipAddress = ip;
    }
    /**
     * metodo per ottenere l'ip dalla memoria.
     * @return String contenente l'ip
     */
    public static synchronized String getIpAddress(){
        return ipAddress;
    }
    /**
     * metodo per aggiungere la porta alla memoria.
     * @param port intero contenente la porta.
     */
    public static synchronized void setPort(int port){
        numberPort = port;
    }
    /**
     * metodo per restituire la porta dalla memoria.
     * @return intero contenente la porta
     */
    public static synchronized int getPort(){
        return numberPort;
    }
    /**
     * metodo inizializzare una nuova partita.
     * inizializza i colori di inizio sulla scacchiera.
     * inizializza le posizioni dei colori sulla mappa testuale.
     */
    public synchronized void newGame(){
        try{
            map[3][3] = 2;
            map[3][4] = 1;
            map[4][3] = 1;
            map[4][4] = 2;
            ButtonLocation60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
            ButtonLocation101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
            ButtonLocation112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
            ButtonLocation113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
        }catch(Exception ex){ System.out.println("array mappa : " + ex); }
    }
    /**
     * metodo per rinizializzare le variabili boolean per il cambio delle pedine durante i turni.
     */
    private synchronized void resetVariables () {
        N = false;
        S = false;
        E = false;
        W = false;
        NE = false;
        NW = false;
        SE = false;
        SW = false;
    }
    /**
     *  ? ? ? 
     * @param x
     * @param y 
     */
    private synchronized void Controller (int x, int y) {
        if (x == 0){
            if (y == 0){
                NW = true;
            }
            N = true;
        }
        if (x == 7){
            if (y == 7){
                SE = true;
            }
            S = true;
        }
        if (y == 0){
            if (x == 7){
                SW = true;
            }
            W = true;
        }
        if (y == 7){
            if (x == 0){
                NE = true;
            }
            E = true;
        }
    }
    /**
     * metodo per il cambio delle pedine durante il turno nemico.
     * aggiorna la grafica testuale.
     * @param x intero coordinata x.
     * @param y intero coordinata y.
     */
    public static synchronized void changeColorEnemyTurn(int x,int y){
        try{
        new Memory().resetVariables();
        new Memory().Controller(x, y);
        if (turnColor.equals("white")){ //Check if the player is white
            if (map [x][y]== 0){
                //nel caso la pedina fosse bianca, mangia tutti i neri a est
                //Fixed
                if (NE == false && SE == false && E == false && map [x][y+1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        else if (map [x][p2]== 2){
                            
                            do {
                                p2 = p2 - 1;
                                map [x][p2] = 2;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a ovest
                //Fixed
                if (NW == false && SW == false && W == false && map [x][y-1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        else if (map [x][p2]== 2){
                            
                            do {
                                p2 = p2 + 1;
                                map [x][p2] = 2;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri di nord
                //Fixed
                if (NW == false && NE == false && N == false && map [x-1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        else if (map [p1][y]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                map [p1][y] = 2;
                                if (p1 == x) {
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri di sud
                //Fixed
                if (SW == false && SE == false && S == false && map [x+1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                         if (p1 != 8 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        else if (map [p1][y]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                map [p1][y] = 2;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Nord-Est
                //Fixed
                if (N == false && E == false && NE == false && map [x-1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Sud-Ovest
                //Fixed
                if (S == false && W == false && SW == false && map [x+1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Nord-Ovest
                //Fixed
                if (N == false && W == false && NW == false && map [x-1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Sud-Est
                //Fixed
                if (S == false && E == false && SE == false && map [x+1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }
        }

        if (turnColor.equals("black")){ //Check if the player is black
            if (map [x][y]== 0){
                //nel caso la pedina fosse nera, mangia tutti i bianchi a est
                //Fixed
                if (NE == false && SE == false && E == false && map [x][y+1]== 2){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            
                            do {
                                p2 = p2 - 1;
                                map [x][p2] = 1;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a ovest
                //Fixed
                if (NW == false && SW == false && W == false && map [x][y-1]== 2){System.out.println("Nero / Nord");
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            
                            do {
                                p2 = p2 + 1;
                                map [x][p2] = 1;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi di nord
                //Fixed
                if (NW == false && NE == false && N == false && map [x-1][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                map [p1][y] = 1;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi di sud
                //Fixed
                if (SW == false && SE == false && S == false && map [x+1][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if (p1 != 8 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                map [p1][y] = 1;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Nord-Est
                //Fixed
                if (N == false && E == false && NE == false && map [x-1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }                
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Sud-Ovest
                //Fixed
                if (S == false && W == false && SW == false && map [x+1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Nord-Ovest
                //Fixed
                if (N == false && W == false && NW == false && map [x-1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Sud-Est
                //Fixed
                if (S == false && E == false && SE == false && map [x+1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                       
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }

        }
        cunterDiscs();
        }catch(Exception ex){ System.out.println("array mappa : " + ex); }
    }
    /**
     * metodo per il cambio delle pedine durante il turno corrente
     * @param x intero coordinata x.
     * @param y intero coordinata y.
     */
    public static synchronized void changeColor(int x,int y){
        try{
        new Memory().resetVariables();
        new Memory().Controller(x, y);
        if (myColor.equals("white")){ //Check if the player is white
            if (map [x][y]== 0 || map[x][y] == 3){
                //nel caso la pedina fosse bianca, mangia tutti i neri a est
                //Fixed
                if (NE == false && SE == false && E == false && map [x][y+1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        else if (map [x][p2]== 2){
                            
                            do {
                                p2 = p2 - 1;
                                map [x][p2] = 2;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a ovest
                //Fixed
                if (NW == false && SW == false && W == false && map [x][y-1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        else if (map [x][p2]== 2){
                            
                            do {
                                p2 = p2 + 1;
                                map [x][p2] = 2;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri di nord
                //Fixed
                if (NW == false && NE == false && N == false && map [x-1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        else if (map [p1][y]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                map [p1][y] = 2;
                                if (p1 == x) {
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri di sud
                //Fixed
                if (SW == false && SE == false && S == false && map [x+1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                         if (p1 != 8 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        else if (map [p1][y]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                map [p1][y] = 2;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Nord-Est
                //Fixed
                if (N == false && E == false && NE == false && map [x-1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Sud-Ovest
                //Fixed
                if (S == false && W == false && SW == false && map [x+1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Nord-Ovest
                //Fixed
                if (N == false && W == false && NW == false && map [x-1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse bianca, mangia tutti i neri a Sud-Est
                //Fixed
                if (S == false && E == false && SE == false && map [x+1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 2;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }
        }

        if (myColor.equals("black")){ //Check if the player is black
            if (map [x][y]== 0 || map[x][y] == 3){
                //nel caso la pedina fosse nera, mangia tutti i bianchi a est
                //Fixed
                if (NE == false && SE == false && E == false && map [x][y+1]== 2){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            
                            do {
                                p2 = p2 - 1;
                                map [x][p2] = 1;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a ovest
                //Fixed
                if (NW == false && SW == false && W == false && map [x][y-1]== 2){System.out.println("Nero / Nord");
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && map [x][p2]== 0){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            
                            do {
                                p2 = p2 + 1;
                                map [x][p2] = 1;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi di nord
                //Fixed
                if (NW == false && NE == false && N == false && map [x-1][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                map [p1][y] = 1;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi di sud
                //Fixed
                if (SW == false && SE == false && S == false && map [x+1][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if (p1 != 8 && map [p1][y]== 0){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                map [p1][y] = 1;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Nord-Est
                //Fixed
                if (N == false && E == false && NE == false && map [x-1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }                
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Sud-Ovest
                //Fixed
                if (S == false && W == false && SW == false && map [x+1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Nord-Ovest
                //Fixed
                if (N == false && W == false && NW == false && map [x-1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                //nel caso la pedina fosse nera, mangia tutti i bianchi a Sud-Est
                //Fixed
                if (S == false && E == false && SE == false && map [x+1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && map [p1][p2]== 0){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                       
                        else if (map [p1][p2]== 1){
                            
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                map [p1][p2] = 1;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }

        }
        cunterDiscs();
        }catch(Exception ex){ System.out.println("array mappa : " + ex); }
    }
    /**
     * metodo per aggiornare la view grafica
     */
    public synchronized void upgradeView(){
        int cont = 0;
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){     
                if(map[x][y] == 0){   }
                if(map[x][y] == 1){ changeColorButton(cont, 1); }
                if(map[x][y] == 2){ changeColorButton(cont, 2); }
                cont = cont + 1;
            }
        }
    }
    /**
     * metodo per cambiare l'immagine sulle pedine da nera a bianca o viceversa.
     * @param position posizione da 0 a 63. lo 0 corrisponde al bottone 0 - 0.
     * @param color intero corrispondente al colore ( 1 = nero; 2 = bianco ).
     */
    public synchronized void changeColorButton(int position, int color){
        switch(position){
            case 0:
                if(color == 1){ 
                    b00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    b00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 1:
                if(color == 1){ 
                   ButtonLocation20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png"))); 
                }else{
                    ButtonLocation20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 2:
                if(color == 1){ 
                    ButtonLocation117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 3:
                if(color == 1){ 
                   ButtonLocation118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png"))); 
                }else{
                    ButtonLocation118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
             case 4:
                if(color == 1){ 
                    ButtonLocation119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 5:
                if(color == 1){ 
                    ButtonLocation120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 6:
                if(color == 1){ 
                    ButtonLocation121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 7:
                if(color == 1){ 
                    ButtonLocation122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 8:
                if(color == 1){ 
                    ButtonLocation29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
            case 9:
                if(color == 1){ 
                    ButtonLocation30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 10:
                if(color == 1){ 
                    ButtonLocation39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 11:
                if(color == 1){ 
                    ButtonLocation40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 12:
                if(color == 1){ 
                    ButtonLocation105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;   
            case 13:
                if(color == 1){ 
                    ButtonLocation106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 14:
                if(color == 1){ 
                    ButtonLocation107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 15:
                if(color == 1){ 
                    ButtonLocation108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
             case 16:
                if(color == 1){ 
                    ButtonLocation131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 17:
                if(color == 1){ 
                    ButtonLocation132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 18:
                if(color == 1){ 
                    ButtonLocation133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 19:
                if(color == 1){ 
                    ButtonLocation134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 20:
                if(color == 1){ 
                    ButtonLocation135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 21:
                if(color == 1){ 
                    ButtonLocation136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 22:
                if(color == 1){ 
                    ButtonLocation137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 23:
                if(color == 1){ 
                    ButtonLocation138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
            case 24:
                if(color == 1){ 
                    ButtonLocation49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 25:
                if(color == 1){ 
                    ButtonLocation50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 26:
                if(color == 1){ 
                    ButtonLocation59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 27:
                if(color == 1){ 
                    ButtonLocation60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
             case 28:
                if(color == 1){ 
                    ButtonLocation101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 29:
                if(color == 1){ 
                    ButtonLocation102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 30:
                if(color == 1){ 
                    ButtonLocation103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 31:
                if(color == 1){ 
                    ButtonLocation104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
            case 32:
                if(color == 1){ 
                    ButtonLocation109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 33:
                if(color == 1){ 
                    ButtonLocation110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 34:
                if(color == 1){ 
                    ButtonLocation111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 35:
                if(color == 1){ 
                    ButtonLocation112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 36:
                if(color == 1){ 
                    ButtonLocation113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 37:
                if(color == 1){ 
                    ButtonLocation114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 38:
                if(color == 1){ 
                    ButtonLocation115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 39:
                if(color == 1){ 
                    ButtonLocation116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
            case 40:
                if(color == 1){ 
                    ButtonLocation69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 41:
                if(color == 1){ 
                    ButtonLocation70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 42:
                if(color == 1){ 
                    ButtonLocation95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 43:
                if(color == 1){ 
                    ButtonLocation96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 44:
                if(color == 1){ 
                    ButtonLocation97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 45:
                if(color == 1){ 
                    ButtonLocation98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 46:
                if(color == 1){ 
                    ButtonLocation99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 47:
                if(color == 1){ 
                    ButtonLocation100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
           //giusto
            case 48:
                if(color == 1){ 
                    ButtonLocation79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 49:
                if(color == 1){ 
                    ButtonLocation80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 50:
                if(color == 1){ 
                    ButtonLocation89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 51:
                if(color == 1){ 
                    ButtonLocation90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 52:
                if(color == 1){ 
                    ButtonLocation91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 53:
                if(color == 1){ 
                    ButtonLocation92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 54:
                if(color == 1){ 
                    ButtonLocation93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 55:
                if(color == 1){ 
                    ButtonLocation94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            //giusto
            case 56:
                if(color == 1){ 
                    ButtonLocation123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 57:
                if(color == 1){ 
                    ButtonLocation124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break; 
            case 58:
                if(color == 1){ 
                    ButtonLocation125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 59:
                if(color == 1){ 
                    ButtonLocation126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break; 
            case 60:
                if(color == 1){ 
                    ButtonLocation127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 61:
                if(color == 1){ 
                    ButtonLocation128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 62:
                if(color == 1){ 
                    ButtonLocation129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
            case 63:
                if(color == 1){ 
                    ButtonLocation130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png")));
                }else{
                    ButtonLocation130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png")));
                }
                break;
        }
    }
    /**.
     * metodo per resettare la partita e la grafica
     */
    public static synchronized void resetView(){
        int cont = 0;
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                new Memory().resetColorView(cont);
                new Memory().newGame();
                cont = cont + 1;
            }
        }
        System.out.println("MEMORY: reset della  scacchiera");
        new Memory().newGame();      
        Memory.printMap();
    }
    /**
     * metodo per reimpostare l'immagini allo stato iniziale
     * @param position posizione da 0 a 63. lo 0 corrisponde al bottone 0 - 0.
     */
    public synchronized void resetColorView(int position){
        switch(position){
            case 0:
                    b00.setIcon(null);
                break;
            case 1:
                   ButtonLocation20.setIcon(null);
                break;
            case 2:
                    ButtonLocation117.setIcon(null);
                break;
            case 3:
                   ButtonLocation118.setIcon(null); 
                break;
             case 4:
                    ButtonLocation119.setIcon(null);
                break;
            case 5:
                    ButtonLocation120.setIcon(null);
                break;
            case 6:
                    ButtonLocation121.setIcon(null);
                break;
            case 7:
                    ButtonLocation122.setIcon(null);
                break;
            case 8:
                    ButtonLocation29.setIcon(null);
                break;
            case 9:
                    ButtonLocation30.setIcon(null);
                break;
            case 10:
                    ButtonLocation39.setIcon(null);
                break;
            case 11:
                    ButtonLocation40.setIcon(null);
                break;
            case 12:
                    ButtonLocation105.setIcon(null);
                break;   
            case 13:
                    ButtonLocation106.setIcon(null);
                break;
            case 14:
                    ButtonLocation107.setIcon(null);
                break;
            case 15:
                    ButtonLocation108.setIcon(null);
                break;
             case 16: 
                    ButtonLocation131.setIcon(null);
                break;
            case 17:
                    ButtonLocation132.setIcon(null);
                break;
            case 18:
                    ButtonLocation133.setIcon(null);
                break;
            case 19:
                    ButtonLocation134.setIcon(null);
                break;
            case 20:
                    ButtonLocation135.setIcon(null);
                break;
            case 21:
                    ButtonLocation136.setIcon(null);
                break;
            case 22:
                    ButtonLocation137.setIcon(null);
                break;
            case 23:
                    ButtonLocation138.setIcon(null);
                break;
            case 24:
                    ButtonLocation49.setIcon(null);
                break;
            case 25:
                    ButtonLocation50.setIcon(null);
                break;
            case 26:
                    ButtonLocation59.setIcon(null);
                    break;
            case 27: 
                    ButtonLocation60.setIcon(null);
                break;
             case 28: 
                    ButtonLocation101.setIcon(null);
                break;
            case 29:
                    ButtonLocation102.setIcon(null);
                break;
            case 30:
                    ButtonLocation103.setIcon(null);
                break;
            case 31:
                    ButtonLocation104.setIcon(null);
                break;
            case 32:
                    ButtonLocation109.setIcon(null);
                break;
            case 33:
                    ButtonLocation110.setIcon(null);
                break;
            case 34: 
                    ButtonLocation111.setIcon(null);
                break;
            case 35:
                    ButtonLocation112.setIcon(null);
                break;
            case 36:
                    ButtonLocation113.setIcon(null);
                break;
            case 37: 
                    ButtonLocation114.setIcon(null);
                break;
            case 38:
                    ButtonLocation115.setIcon(null);
                break;
            case 39: 
                    ButtonLocation116.setIcon(null);
                break;
            case 40:
                    ButtonLocation69.setIcon(null);
                break;
            case 41:
                    ButtonLocation70.setIcon(null);
                break;
            case 42:
                    ButtonLocation95.setIcon(null);
                break;
            case 43:
                    ButtonLocation96.setIcon(null);
                break;
            case 44:
                    ButtonLocation97.setIcon(null);
                break;
            case 45:
                    ButtonLocation98.setIcon(null);
                break;
            case 46:
                    ButtonLocation99.setIcon(null);
                break;
            case 47: 
                    ButtonLocation100.setIcon(null);
                break;
            case 48:
                    ButtonLocation79.setIcon(null);
                break;
            case 49:
                    ButtonLocation80.setIcon(null);
                break;
            case 50:
                    ButtonLocation89.setIcon(null);
                break;
            case 51:
                    ButtonLocation90.setIcon(null);
                break;
            case 52: 
                    ButtonLocation91.setIcon(null);
                break;
            case 53:
                    ButtonLocation92.setIcon(null);
                break;
            case 54: 
                    ButtonLocation93.setIcon(null);
                break;
            case 55: 
                    ButtonLocation94.setIcon(null);
                break;
            case 56:
                    ButtonLocation123.setIcon(null);
                break;
            case 57:
                    ButtonLocation124.setIcon(null);
                break; 
            case 58:
                    ButtonLocation125.setIcon(null);
                break;
            case 59: 
                    ButtonLocation126.setIcon(null);
                break; 
            case 60:
                    ButtonLocation127.setIcon(null);
                break;
            case 61:
                    ButtonLocation128.setIcon(null);
                break;
            case 62:
                    ButtonLocation129.setIcon(null);
                break;
            case 63:
                    ButtonLocation130.setIcon(null);
                break;
        }
    }
    /**
     * metodo per disabilitare i bottoni
     */
    public synchronized void disableButton(){
        System.out.println("MEMORY: disabilito i bottoni");
        for(int i = 0; i < 64; i = i + 1){
            switch(i){
                case 0:
                        b00.setIcon(null);
                        b00.enable(false);
                    break;
                case 1:
                       ButtonLocation20.setIcon(null);
                       ButtonLocation20.enable(false);
                    break;
                case 2:
                        ButtonLocation117.setIcon(null);
                        ButtonLocation117.enable(false);
                    break;
                case 3:
                       ButtonLocation118.setIcon(null);
                       ButtonLocation118.enable(false);
                    break;
                 case 4:
                        ButtonLocation119.setIcon(null);
                        ButtonLocation119.enable(false);
                    break;
                case 5:
                        ButtonLocation120.setIcon(null);
                        ButtonLocation120.enable(false);
                    break;
                case 6:
                        ButtonLocation121.setIcon(null);
                        ButtonLocation121.enable(false);
                    break;
                case 7:
                        ButtonLocation122.setIcon(null);
                        ButtonLocation122.enable(false);
                    break;
                case 8:
                        ButtonLocation29.setIcon(null);
                        ButtonLocation29.enable(false);
                    break;
                case 9:
                        ButtonLocation30.setIcon(null);
                        ButtonLocation30.enable(false);
                    break;
                case 10:
                        ButtonLocation39.setIcon(null);
                        ButtonLocation39.enable(false);
                    break;
                case 11:
                        ButtonLocation40.setIcon(null);
                        ButtonLocation40.enable(false);
                    break;
                case 12:
                        ButtonLocation105.setIcon(null);
                        ButtonLocation105.enable(false);
                    break;   
                case 13:
                        ButtonLocation106.setIcon(null);
                        ButtonLocation106.enable(false);
                    break;
                case 14:
                        ButtonLocation107.setIcon(null);
                        ButtonLocation107.enable(false);
                    break;
                case 15:
                        ButtonLocation108.setIcon(null);
                        ButtonLocation108.enable(false);
                    break;
                 case 16: 
                        ButtonLocation131.setIcon(null);
                        ButtonLocation131.enable(false);
                    break;
                case 17:
                        ButtonLocation132.setIcon(null);
                        ButtonLocation132.enable(false);
                    break;
                case 18:
                        ButtonLocation133.setIcon(null);
                        ButtonLocation133.enable(false);
                    break;
                case 19:
                        ButtonLocation134.setIcon(null);
                        ButtonLocation134.enable(false);
                    break;
                case 20:
                        ButtonLocation135.setIcon(null);
                        ButtonLocation135.enable(false);
                    break;
                case 21:
                        ButtonLocation136.setIcon(null);
                        ButtonLocation136.enable(false);
                    break;
                case 22:
                        ButtonLocation137.setIcon(null);
                        ButtonLocation137.enable(false);
                    break;
                case 23:
                        ButtonLocation138.setIcon(null);
                        ButtonLocation138.enable(false);
                    break;
                case 24:
                        ButtonLocation49.setIcon(null);
                        ButtonLocation49.enable(false);
                    break;
                case 25:
                        ButtonLocation50.setIcon(null);
                        ButtonLocation50.enable(false);
                    break;
                case 26:
                        ButtonLocation59.setIcon(null);
                        ButtonLocation59.enable(false);
                case 27: 
                        ButtonLocation60.setIcon(null);
                        ButtonLocation60.enable(false);
                    break;
                 case 28: 
                        ButtonLocation101.setIcon(null);
                        ButtonLocation101.enable(false);
                    break;
                case 29:
                        ButtonLocation102.setIcon(null);
                        ButtonLocation102.enable(false);
                    break;
                case 30:
                        ButtonLocation103.setIcon(null);
                        ButtonLocation103.enable(false);
                    break;
                case 31:
                        ButtonLocation104.setIcon(null);
                        ButtonLocation104.enable(false);
                    break;
                case 32:
                        ButtonLocation109.setIcon(null);
                        ButtonLocation109.enable(false);
                    break;
                case 33:
                        ButtonLocation110.setIcon(null);
                        ButtonLocation110.enable(false);
                    break;
                case 34: 
                        ButtonLocation111.setIcon(null);
                        ButtonLocation111.enable(false);
                    break;
                case 35:
                        ButtonLocation112.setIcon(null);
                        ButtonLocation112.enable(false);
                    break;
                case 36:
                        ButtonLocation113.setIcon(null);
                        ButtonLocation113.enable(false);
                    break;
                case 37: 
                        ButtonLocation114.setIcon(null);
                        ButtonLocation114.enable(false);
                    break;
                case 38:
                        ButtonLocation115.setIcon(null);
                        ButtonLocation115.enable(false);
                    break;
                case 39: 
                        ButtonLocation116.setIcon(null);
                        ButtonLocation116.enable(false);
                    break;
                case 40:
                        ButtonLocation69.setIcon(null);
                        ButtonLocation69.enable(false);
                    break;
                case 41:
                        ButtonLocation70.setIcon(null);
                        ButtonLocation70.enable(false);
                    break;
                case 42:
                        ButtonLocation95.setIcon(null);
                        ButtonLocation95.enable(false);
                    break;
                case 43:
                        ButtonLocation96.setIcon(null);
                        ButtonLocation96.enable(false);
                    break;
                case 44:
                        ButtonLocation97.setIcon(null);
                        ButtonLocation97.enable(false);
                    break;
                case 45:
                        ButtonLocation98.setIcon(null);
                        ButtonLocation98.enable(false);
                    break;
                case 46:
                        ButtonLocation99.setIcon(null);
                        ButtonLocation99.enable(false);
                    break;
                case 47: 
                        ButtonLocation100.setIcon(null);
                        ButtonLocation100.enable(false);
                    break;
                case 48:
                        ButtonLocation79.setIcon(null);
                        ButtonLocation79.enable(false);
                    break;
                case 49:
                        ButtonLocation80.setIcon(null);
                        ButtonLocation80.enable(false);
                    break;
                case 50:
                        ButtonLocation89.setIcon(null);
                        ButtonLocation89.enable(false);
                    break;
                case 51:
                        ButtonLocation90.setIcon(null);
                        ButtonLocation90.enable(false);
                    break;
                case 52: 
                        ButtonLocation91.setIcon(null);
                        ButtonLocation91.enable(false);
                    break;
                case 53:
                        ButtonLocation92.setIcon(null);
                        ButtonLocation92.enable(false);
                    break;
                case 54: 
                        ButtonLocation93.setIcon(null);
                        ButtonLocation93.enable(false);
                    break;
                case 55: 
                        ButtonLocation94.setIcon(null);
                        ButtonLocation94.enable(false);
                    break;
                case 56:
                        ButtonLocation123.setIcon(null);
                        ButtonLocation123.enable(false);
                    break;
                case 57:
                        ButtonLocation124.setIcon(null);
                        ButtonLocation124.enable(false);
                    break; 
                case 58:
                        ButtonLocation125.setIcon(null);
                        ButtonLocation125.enable(false);
                    break;
                case 59: 
                        ButtonLocation126.setIcon(null);
                        ButtonLocation126.enable(false);
                    break; 
                case 60:
                        ButtonLocation127.setIcon(null);
                        ButtonLocation127.enable(false);
                    break;
                case 61:
                        ButtonLocation128.setIcon(null);
                        ButtonLocation128.enable(false);
                    break;
                case 62:
                        ButtonLocation129.setIcon(null);
                        ButtonLocation129.enable(false);
                    break;
                case 63:
                        ButtonLocation130.setIcon(null);
                        ButtonLocation130.enable(false);
                    break;
            }
        }
    }
    /**
     * metodo per stampare la mappa in testuale
     */
    public static synchronized void printMap(){
        for(int x = 0;x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                System.out.print(map[x][y] + " ");
            }
            System.out.println("");
        }
    }
    /**
     * metodo per aggiungere il colore del giocatore alla memoria.
     * scrive in automatico il colore nella jtextfield corrispondente.
     * @param color Stringa contenente il colore del giocatore
     */
    public static synchronized void setMyColor(String color){
        myColor = color;
        MainWindows.writeYourColorArea(color);
    }
    /**
     * metodo per restituire il colore del giocatore corrente dalla memoria
     * @return stringa contenente il colore del giocatore.
     */
    public static synchronized String getMyColor(){
        return myColor;
    }
    /**
     * metodo per aggiungere il colore del turno corrente alla memoria
     * @param color Stringa contenente il turno corrente
     */
    public static synchronized void setTurnColor(String color){
        turnColor = color;
        MainWindows.writeTurnOfColor(color);
    }
    /**
     * metodo per restituire il colore del turno corrente dalla memoria
     * @return Stringa contenente il turno corrente
     */
    public static synchronized String getTurnColor(){
        return turnColor;
    }
    /**
     * +1 ai turni giocati.
     * aggiorna automaticamente la jtextfield corrispondente.
     */
    public static synchronized void upTurn(){
        numberTurn = numberTurn + 1;
        MainWindows.writeNumberTurn("" + numberTurn);
    }
    /**
     * -1 ai turni gioacati.
     * aggiorna automaticamente la jtextfield corrispondente.
     */
    public static synchronized void downTurn(){
        numberTurn = numberTurn - 1;
        MainWindows.writeNumberTurn("" + numberTurn);
    }
    /**
     * resetta i  turni giocati
     */
    public static synchronized void resetNumberTurn( ){
        numberTurn = 0;
        MainWindows.writeNumberTurn("" + 0);
    }
    /**
     * resetta la mappa testuale
     */
    public static synchronized void resetMap(){
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                map[x][y] = 0;
            }
        }
    }
    /**
     * metodo per contare le pedine nere, bianche e vuote.
     * scrive in automatico sulla textfield corrispondente.
     */
    public static synchronized void cunterDiscs(){
        int countWhite = 0;
        int countBlack = 0;
        int countNull = 0;
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                if(map[x][y] == 0){ countNull = countNull + 1; }
                if(map[x][y] == 1){ countBlack = countBlack + 1; }
                if(map[x][y] == 2){ countWhite = countWhite + 1;  }
            }
        }
        MainWindows.writeNumberDiscs("white : " + countWhite + " - black : " + countBlack + " - blank : " + countNull);
    }
    /**
     * metodo per stabilire chi ha vinto la partita
     * @return striga contenente il vincitore
     */
    public static synchronized String winnerGame(){
       int countWhite = 0;
        int countBlack = 0;
        int countNull = 0;
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                if(map[x][y] == 0){ countNull = countNull + 1; }
                if(map[x][y] == 1){ countBlack = countBlack + 1; }
                if(map[x][y] == 2){ countWhite = countWhite + 1;  }
            }
        }
        if(countBlack < countWhite){ return "winner is: withe with " + countWhite + " discs"; }
        if(countBlack > countWhite){ return "winner is: black with " + countBlack + " discs"; }
        if(countBlack == countWhite){ return "the game is drawn"; }
        return "";
    }
    /**
     * metodo per aggiugnere l'immagine di aiuto
     * @param position della pedina
     */
    public synchronized void positionHIntDiscs(int position){
        switch(position){
            case 0:
                    b00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 1:
                   ButtonLocation20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 2:
                    ButtonLocation117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 3:
                   ButtonLocation118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
             case 4:
                    ButtonLocation119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 5:
                    ButtonLocation120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 6:
                    ButtonLocation121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 7:
                    ButtonLocation122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 8:
                    ButtonLocation29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 9:
                    ButtonLocation30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 10:
                    ButtonLocation39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 11:
                    ButtonLocation40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 12:
                    ButtonLocation105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;   
            case 13:
                    ButtonLocation106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 14:
                    ButtonLocation107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 15:
                    ButtonLocation108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
             case 16: 
                    ButtonLocation131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 17:
                    ButtonLocation132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 18:
                    ButtonLocation133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 19:
                    ButtonLocation134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 20:
                    ButtonLocation135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 21:
                    ButtonLocation136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 22:
                    ButtonLocation137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 23:
                    ButtonLocation138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 24:
                    ButtonLocation49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 25:
                    ButtonLocation50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 26:
                    ButtonLocation59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                    break;
            case 27: 
                    ButtonLocation60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
             case 28: 
                    ButtonLocation101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 29:
                    ButtonLocation102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 30:
                    ButtonLocation103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 31:
                    ButtonLocation104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 32:
                    ButtonLocation109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 33:
                    ButtonLocation110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 34: 
                    ButtonLocation111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 35:
                    ButtonLocation112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 36:
                    ButtonLocation113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 37: 
                    ButtonLocation114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 38:
                    ButtonLocation115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 39: 
                    ButtonLocation116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 40:
                    ButtonLocation69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 41:
                    ButtonLocation70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 42:
                    ButtonLocation95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 43:
                    ButtonLocation96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 44:
                    ButtonLocation97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 45:
                    ButtonLocation98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 46:
                    ButtonLocation99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 47: 
                    ButtonLocation100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 48:
                    ButtonLocation79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 49:
                    ButtonLocation80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 50:
                    ButtonLocation89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 51:
                    ButtonLocation90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 52: 
                    ButtonLocation91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 53:
                    ButtonLocation92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 54: 
                    ButtonLocation93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 55: 
                    ButtonLocation94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 56:
                    ButtonLocation123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 57:
                    ButtonLocation124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break; 
            case 58:
                    ButtonLocation125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 59: 
                    ButtonLocation126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break; 
            case 60:
                    ButtonLocation127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 61:
                    ButtonLocation128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 62:
                    ButtonLocation129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
            case 63:
                    ButtonLocation130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/legalSlot.png")));
                break;
        }
    }
    /**
     * metodo per rimuovere tutti gli aiuti
     */
    public static synchronized void removeHint(){
        int cont = 0;
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                if(map[x][y] == 3){
                    System.out.println("MEMORY: rimuovo la pedina numero: " + cont + " | posizione" + x +", "+ y);
                    resetHint(cont);
                    if(map[x][y] != 1 || map[x][y] != 2){
                        map[x][y] = 0;
                    }
                }
                cont = cont + 1;
            }
        }
    }
    /**
     * metodo per rimuovere le immagoini di aiuto
     * @param position posizione bottone
     */
    public static synchronized void resetHint(int position){
        switch(position){
            case 0:
                    b00.setIcon(null);
                break;
            case 1:
                   ButtonLocation20.setIcon(null);
                break;
            case 2:
                    ButtonLocation117.setIcon(null);
                break;
            case 3:
                   ButtonLocation118.setIcon(null); 
                break;
             case 4:
                    ButtonLocation119.setIcon(null);
                break;
            case 5:
                    ButtonLocation120.setIcon(null);
                break;
            case 6:
                    ButtonLocation121.setIcon(null);
                break;
            case 7:
                    ButtonLocation122.setIcon(null);
                break;
            case 8:
                    ButtonLocation29.setIcon(null);
                break;
            case 9:
                    ButtonLocation30.setIcon(null);
                break;
            case 10:
                    ButtonLocation39.setIcon(null);
                break;
            case 11:
                    ButtonLocation40.setIcon(null);
                break;
            case 12:
                    ButtonLocation105.setIcon(null);
                break;   
            case 13:
                    ButtonLocation106.setIcon(null);
                break;
            case 14:
                    ButtonLocation107.setIcon(null);
                break;
            case 15:
                    ButtonLocation108.setIcon(null);
                break;
             case 16: 
                    ButtonLocation131.setIcon(null);
                break;
            case 17:
                    ButtonLocation132.setIcon(null);
                break;
            case 18:
                    ButtonLocation133.setIcon(null);
                break;
            case 19:
                    ButtonLocation134.setIcon(null);
                break;
            case 20:
                    ButtonLocation135.setIcon(null);
                break;
            case 21:
                    ButtonLocation136.setIcon(null);
                break;
            case 22:
                    ButtonLocation137.setIcon(null);
                break;
            case 23:
                    ButtonLocation138.setIcon(null);
                break;
            case 24:
                    ButtonLocation49.setIcon(null);
                break;
            case 25:
                    ButtonLocation50.setIcon(null);
                break;
            case 26:
                    ButtonLocation59.setIcon(null);
                    break;
            case 27: 
                    ButtonLocation60.setIcon(null);
                break;
             case 28: 
                    ButtonLocation101.setIcon(null);
                break;
            case 29:
                    ButtonLocation102.setIcon(null);
                break;
            case 30:
                    ButtonLocation103.setIcon(null);
                break;
            case 31:
                    ButtonLocation104.setIcon(null);
                break;
            case 32:
                    ButtonLocation109.setIcon(null);
                break;
            case 33:
                    ButtonLocation110.setIcon(null);
                break;
            case 34: 
                    ButtonLocation111.setIcon(null);
                break;
            case 35:
                    ButtonLocation112.setIcon(null);
                break;
            case 36:
                    ButtonLocation113.setIcon(null);
                break;
            case 37: 
                    ButtonLocation114.setIcon(null);
                break;
            case 38:
                    ButtonLocation115.setIcon(null);
                break;
            case 39: 
                    ButtonLocation116.setIcon(null);
                break;
            case 40:
                    ButtonLocation69.setIcon(null);
                break;
            case 41:
                    ButtonLocation70.setIcon(null);
                break;
            case 42:
                    ButtonLocation95.setIcon(null);
                break;
            case 43:
                    ButtonLocation96.setIcon(null);
                break;
            case 44:
                    ButtonLocation97.setIcon(null);
                break;
            case 45:
                    ButtonLocation98.setIcon(null);
                break;
            case 46:
                    ButtonLocation99.setIcon(null);
                break;
            case 47: 
                    ButtonLocation100.setIcon(null);
                break;
            case 48:
                    ButtonLocation79.setIcon(null);
                break;
            case 49:
                    ButtonLocation80.setIcon(null);
                break;
            case 50:
                    ButtonLocation89.setIcon(null);
                break;
            case 51:
                    ButtonLocation90.setIcon(null);
                break;
            case 52: 
                    ButtonLocation91.setIcon(null);
                break;
            case 53:
                    ButtonLocation92.setIcon(null);
                break;
            case 54: 
                    ButtonLocation93.setIcon(null);
                break;
            case 55: 
                    ButtonLocation94.setIcon(null);
                break;
            case 56:
                    ButtonLocation123.setIcon(null);
                break;
            case 57:
                    ButtonLocation124.setIcon(null);
                break; 
            case 58:
                    ButtonLocation125.setIcon(null);
                break;
            case 59: 
                    ButtonLocation126.setIcon(null);
                break; 
            case 60:
                    ButtonLocation127.setIcon(null);
                break;
            case 61:
                    ButtonLocation128.setIcon(null);
                break;
            case 62:
                    ButtonLocation129.setIcon(null);
                break;
            case 63:
                    ButtonLocation130.setIcon(null);
                break;
        }
    }
    /**
     * metodo per settare gli aiuti 
     */
    public synchronized void printMapHelp(){
        System.out.println("MAP HELP");
        for(int x = 0; x < 8; x = x + 1){
            for(int y = 0; y < 8; y = y + 1){
                System.out.print(mapHelp[x][y] + " ");
            }
            System.out.println("");
        }
    }
    public synchronized void Checker (){
        System.out.println("MEMORY: controllo gli aiuti");
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(map[i][j] == 0){
                    if (myColor.equals("white") && checker(i, j, false) == true){
                        map[i][j] = 3;
                        System.out.println("MEMORY: BIANCO: posiziono il disco");
                        positionHIntDiscs(cont);
                    }
                    if (myColor.equals("black") && checker(i, j, true) == true){
                        map[i][j] = 3;
                        System.out.println("MEMORY: NERO: posiziono il disco");
                        positionHIntDiscs(cont);
                    }
                }
                cont = cont + 1;
            }
        }
    }
    /**
     * metodo per controllare le possibili mosse
     * @param x coordinate
     * @param y coordinate
     * @param b colore
     * @return boolean true se la posizione è valida
     */
    private synchronized boolean checker (int x, int y, boolean b){
        resetVariables();
        Controller(x, y);
        boolean valid = false;
        
        if (b == false){ //Check if the player is white
            if (map[x][y]== 0){
                //EAST
                if (NE == false && SE == false && E == false && map [x][y+1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                         if ((p2 != 8 && map [x][p2] == 0) || (p2 != 8 && map [x][p2] == 3)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                       
                        else if (map [x][p2]== 2){
                            valid = true;
                        }
                    }
                }
                //WEST
                if (NW == false && SW == false && W == false && map [x][y-1]== 1){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                         if ((p2 != -1 && map [x][p2]== 0)||(p2 != -1 && map [x][p2]== 3)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                       
                        else if (map [x][p2]== 2){
                            valid = true;
                        }
                    }
                }
                //NORTH
                if (NW == false && NE == false && N == false && map [x-1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if ((p1 != -1 && map [p1][y]== 0)||(p1 != -1 && map [p1][y]==3)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 2){
                            valid = true;
                        }
                    }
                }
                //SOUTH
                if (SW == false && SE == false && S == false && map [x+1][y]== 1){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if ((p1 != 8 && map [p1][y]== 0)||(p1 != 8 && map [p1][y]== 3)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                       
                        else if (map [p1][y]== 2){
                            valid = true;
                        }
                    }
                }
                //NORTH - EAST
                if (N == false && E == false && NE == false && map [x-1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if ((p1 != -1 && p2 != 8 && map [p1][p2]== 0)||(p1 != -1 && p2 != 8 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - WEST
                if (S == false && W == false && SW == false && map [x+1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if ((p1 != 8 && p2 != -1 && map [p1][p2]== 0)||(p1 != 8 && p2 != -1 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            valid = true;    
                        }
                    }
                }
                //NORTH - WEST
                if (N == false && W == false && NW == false && map [x-1][y-1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if ((p1 != -1 && p2 != -1 && map [p1][p2]== 0)||(p1 != -1 && p2 != -1 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - EAST
                if (S == false && E == false && SE == false && map [x+1][y+1]== 1){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if ((p1 != 8 && p2 != 8 && map [p1][p2]== 0)||(p1 != 8 && p2 != 8 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 2){
                            valid = true;    
                        }
                    }
                }
            }

            if (valid == false) {
                return false;
            }
            
            if ( valid == true)
                return true;
        }

        if (b == true){ //Check if the player is black
            if (map [x][y]== 0){
                //EAST
                if (NE == false && SE == false && E == false && map [x][y+1]== 2){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if ((p2 != 8 && map [x][p2]== 0)||(p2 != 8 && map [x][p2]== 3)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            valid = true;
                        }
                    }
                }
                //WEST
                if (NW == false && SW == false && W == false && map [x][y-1]== 2){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if ((p2 != -1 && map [x][p2]== 0)||(p2 != -1 && map [x][p2]== 3)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        
                        else if (map [x][p2]== 1){
                            valid = true;
                        }
                    }
                }
                //NORTH
                if (NW == false && NE == false && N == false && map [x-1][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if ((p1 != -1 && map [p1][y]== 0)||(p1 != -1 && map [p1][y]== 3)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            valid = true;
                        }
                    }
                }
                //SOUTH
                if (SW == false && SE == false && S == false && map [(x+1)][y]== 2){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if ((p1 != 8 && map [p1][y]== 0)||(p1 != 8 && map [p1][y]== 3)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][y]== 1){
                            valid = true;
                        }
                    }
                }
                //NORTH - EAST
                if (N == false && E == false && NE == false && map [x-1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if ((p1 != -1 && p2 != 8 && map [p1][p2]== 0)||(p1 != -1 && p2 != 8 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - WEST
                if (S == false && W == false && SW == false && map [x+1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if ((p1 != 8 && p2 != -1 && map [p1][p2]== 0)||(p1 != 8 && p2 != -1 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            valid = true;    
                        }
                    }
                }
                //NORTH - WEST
                if (N == false && W == false && NW == false && map [x-1][y-1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if ((p1 != -1 && p2 != -1 && map [p1][p2]== 0)||(p1 != -1 && p2 != -1 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - EAST
                if (S == false && E == false && SE == false && map [x+1][y+1]== 2){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if ((p1 != 8 && p2 != 8 && map [p1][p2]== 0)||(p1 != 8 && p2 != 8 && map [p1][p2]== 3)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (map [p1][p2]== 1){
                            valid = true;    
                        }
                    }
                }
            }

            if (valid == false) {
                return false;
            }
            
            if ( valid == true){
                return true;
            }
        }
        return false;
    }
}

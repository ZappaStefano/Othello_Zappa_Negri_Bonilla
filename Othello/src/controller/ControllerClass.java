package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import model.Memory;
import view.ConnectionWindows;
import view.MainWindows;

/**
 * classe che gestisce la connessione fra client e server
 * @author negri.gioele
 */
public class ControllerClass {
    /*VARIABLE*/
    public static Socket socket; //socket per la connessione fra server e client
    public static PrintWriter send; //oggetto per spedire messaggi sulla socket
    public static BufferedReader read; //oggetto per leggere messaggi dalla socket
    public static boolean gameStatus = false; //variabile per stabilire se esiste una connessione fra server e client
    public static int endGame = 10;//variabile per stabilire la fine della partita
    private static boolean moveValid = true;//variabile per stabilire se la mossa selezionata è valida o no
    private static String enemyMove = "";//testo ricevuto dall'avversario
    /*METHODS*/
    /**
     * metodo per stabilire una connessione fra server e client.
     * crea una socket per la comunicazione.
     * @param ip stringa contenente l'ip del server
     * @param port intero contenente la porta del server
     */
    public void connectServer(String ip,int port){
        System.out.println("try to connect at: " +ip);
        try{
            if(gameStatus == false){
                socket = new Socket(ip, port);
                send = new PrintWriter(socket.getOutputStream(), true);
                read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                MainWindows.writeChronologyArea("i'm connect with : " + ip + " : " + port);
                Memory.setIpAddress(ip);
                Memory.setPort(port);
                send.println("connection;");
                System.out.println("CONTROLLERCLASS: connect to server");MainWindows.writeChronologyArea("conncet to server"); MainWindows.writeIpServerArea(ip + " : " + port); gameStatus = true;MainWindows.writeChronologyArea("______________________________________________________");
                new Memory().newGame();
                startGame();
            }else{
                MainWindows.writeChronologyArea("you don't play in two game simultaneusly");
            }
        }
        catch(UnknownHostException exc){ 
            MainWindows.writeChronologyArea("i don't have a connection with : " + ip + " : " + port);
            System.out.println("CONTROLLERCLASS: no start the game");
                java.awt.EventQueue.invokeLater(() -> {
                    new ConnectionWindows().setVisible(true);
            });
        }
        catch(java.net.ConnectException exc1){
            MainWindows.writeChronologyArea("Connection timed out");
        }
        catch(IOException ex2){
            System.out.println("CONTROLLERCLASS: eccezione nel metodo connectServer" + ex2);
        }
        catch(NullPointerException ex3){ System.out.println("CONTROLLERCLASS: fine game"); }
        catch(Exception ex){
            MainWindows.writeChronologyArea("error connection");
            System.out.println("CONTROLLERCLASS: exception when try to connect " + ex);
        }
        try{
            
            socket.close();
            MainWindows.writeChronologyArea(Memory.winnerGame());
            MainWindows.jMenu2.enable(true);
            Memory.setIpAddress("");
            MainWindows.writeIpServerArea("");
            Memory.setMyColor("");
            Memory.setPort(0);
            Memory.setTurnColor("");
            Memory.resetMap();
            Memory.resetNumberTurn();
        }
        catch(IOException ex1){ System.out.println("CONTROLLERCLASS: chiusura socket" + ex1); }
        catch(Exception ex2){ System.out.println("CONTROLLERCLASS: eccezzione" +ex2); }
    }
    /** 
     * metodo per giocare.
     * contiene tutta la logica del gioco online
     */
    private void startGame() throws IOException{
        String text;
        String firstMessage = read.readLine();
        
        Memory.setMyColor(textOfFirstMessage(firstMessage));
        while(endGame != 0 ){
            if(moveValid == true){
                    Memory.removeHint();
                    text = read.readLine();
                    System.out.println("CONTROLLERCLASS: testo letto: " + text);
                if(controllEndGame(text).equals("end")){
                    System.out.println("gioco finito");MainWindows.writeChronologyArea("end game." );
                    String winner = "Discs: " + text;
                    /**
                     * CODICE DA SISTEMARE:
                     * A: deve ottenere il numero di pedine esatte per colore.
                     * B: uso il contatore interno delle pedine
                     */
                    /*if(text.length() <29){ 
                            winner = winner + " black : " + text.substring(13,14);
                            winner = winner + " white : " + text.substring(25,26);
                    }else{
                            winner = winner + " black : " + text.substring(13,15);
                            winner = winner + " white : " + text.substring(25,27);
                    }
                        */
                        MainWindows.writeChronologyArea(winner);
                        MainWindows.writeNumberDiscs(text);
                        winner = "";
                }else{
                    
                    Memory.setTurnColor(TurnOf(text));
                    MainWindows.writeTurnOfColor(Memory.getTurnColor());
                    if(TurnOf(text).equals(Memory.getMyColor())){
                        try{
                            System.out.println("CONTROLLERCLASS: controllo le mosse possibili");
                            new Memory().Checker();
                            System.out.println("CONTROLLERCLASS: my turn");System.out.println("CONTROLLERCLASS: colore turno : " + Memory.getTurnColor());MainWindows.writeChronologyArea("turn of : " + Memory.getTurnColor());
                            Memory.setTurnColor(TurnOf(text));
                            String replay = read.readLine();
                            if(replay.equals("move not valid;")){
                                MainWindows.writeChronologyArea("move not valid");
                                System.out.println("CONTROLLERCLASS: move not valid");moveValid = false;
                            }else{
                                if(replay.substring(0,3).equals("end")){
                                    MainWindows.writeChronologyArea(replay);
                                    socket.close();
                                    MainWindows.writeChronologyArea(Memory.winnerGame());
                                    MainWindows.jMenu2.enable(true);
                                    gameStatus = false;
                                    endGame = 0; 
                                }else{
                                    if(replay.substring(0,5).equals("round")){
                                        System.out.println("CONTROLLERCLASS: testo ricevuto : " + enemyMove);
                                        if(enemyMove.substring(0,3).equals("end")){ //end game
                                            MainWindows.writeChronologyArea(enemyMove);
                                            socket.close();
                                            MainWindows.writeChronologyArea(Memory.winnerGame());
                                            MainWindows.jMenu2.enable(true);
                                            gameStatus = false;
                                            endGame = 0; 
                                        }
                                        else{
                                            String x1 = enemyMove.substring(18,19);
                                            String x2 = enemyMove.substring(23,24);
                                            int x = Integer.parseInt(x1);
                                            int y = Integer.parseInt(x2);
                                            System.out.println("CONTROLLERCLASS: mosse turno avversario: x " + x + " y " + y);
                                            Memory.changeColorEnemyTurn(x, y);
                                            Memory.printMap();
                                            new Memory().upgradeView();
                                        }
                                    }else{
                                        System.out.println("CONTROLLERCLASS: mossaa accettata " + replay);
                                        String x1 = replay.substring(18,19);
                                        String x2 = replay.substring(23,24);
                                        int x = Integer.parseInt(x1);
                                        int y = Integer.parseInt(x2);
                                        System.out.println("CONTROLLERCLASS: MOSSE TURNO CORRENTE--> x " + x + " y " + y);
                                        Memory.changeColor(x, y);
                                        Memory.printMap();
                                        new Memory().upgradeView();
                                    }
                                }
                            }
                        }
                        catch(IOException | NumberFormatException ex1){ System.out.println("CONTROLLERCLASS: eccezione mio turno" + ex1); }
                        //catch(Exception ex2){ System.out.println("eccezione nel mio turno (generica)"); }
                    }else{
                        try{
                            System.out.println("CONTROLLERCLASS: enemy turn");MainWindows.writeChronologyArea("turn of : " + Memory.getTurnColor());
                            Memory.setTurnColor(TurnOf(text));
                            enemyMove = read.readLine();
                            System.out.println("CONTROLLERCLASS: testo ricevuto : " + enemyMove);
                            if(enemyMove.substring(0,3).equals("end")){ //end game
                                MainWindows.writeChronologyArea(enemyMove);
                                socket.close();
                                MainWindows.writeChronologyArea(Memory.winnerGame());
                                MainWindows.jMenu2.enable(true);
                                gameStatus = false;
                                endGame = 0; 
                            }
                            else{
                                String x1 = enemyMove.substring(18,19);
                                String x2 = enemyMove.substring(23,24);
                                int x = Integer.parseInt(x1);
                                int y = Integer.parseInt(x2);
                                System.out.println("CONTROLLERCLASS: mosse turno avversario: x " + x + " y " + y);
                                Memory.changeColorEnemyTurn(x, y);
                                Memory.printMap();
                                new Memory().upgradeView();
                                
                            }
                        }
                        catch(IOException | NumberFormatException ex1){ System.out.println("CONTROLLERCLASS: eccezione turno nemico" + ex1); }
                        //catch(Exception ex2){ System.out.println("eccezione generale "  + ex2); }
                    }
                    Memory.upTurn();
                }
        }else{
                System.out.println("CONTROLLERCLASS: reinserisci le coordinate");
                String replay = read.readLine();
                if(replay.equals("move not valid;")){
                    MainWindows.writeChronologyArea("move not valid");
                    System.out.println("CONTROLLERCLASS: move non valid");
                }else{
                    System.out.println("mossa valida " + replay);
                    moveValid = true;
                    String x1 = replay.substring(18,19);
                    String x2 = replay.substring(23,24);
                    int x = Integer.parseInt(x1);
                    int y = Integer.parseInt(x2);
                    Memory.changeColor(x, y);
                    Memory.printMap();
                    new Memory().upgradeView();
                }
            }
        }
    }
    /**
     * metodo per ottenere le informazioni dal testo iniziale.
     * separa il nome della partita e il colore del giocatore.
     * @param text Stringa da analizzare.
     * @return Stringa di informazioni per il gioco ( colore del giocatore ). 
     */
    private String textOfFirstMessage(String text){
        char array[] = text.toCharArray();
        String modifyString = "";
        String text1 = "";
        String text2 = "";
        boolean aass = false;
        for(int i = 0; i < array.length; i = i + 1 ){
            if(array[i] == '<'){ aass = true;  }
            if(array[i] == '>'){ aass = false; }
            if(aass == true){
                modifyString = modifyString + array[i];
            }
        }
        array = modifyString.toCharArray();
        int textDifferent = 0;
        for(int i = 0; i < modifyString.length(); i = i + 1 ){
            if(array[i] == '<'){  textDifferent = textDifferent + 1;  }else{
                if(textDifferent == 1){ text1 = text1 + array[i]; }
                if(textDifferent == 2){ text2 = text2 + array[i]; }
            }    
        }
        System.out.println("CONTROLLERCLASS: 1: " + text1 + " | 2: " + text2);
        MainWindows.writeChronologyArea("your color : " + text2 + "\nname of game : " + text1);
        return text2;
    }
    /**
     * metodo per ottenere l'informazione dal server.
     * ottiene il colore del turno.
     * @param text Stringa da analizzare
     * @return Stringa contenente il colore del turno.
     */
    private String TurnOf(String text){
        char array[] = text.toCharArray();
        String modifyString = "";
        boolean aass = false;
        for(int i = 0; i < array.length; i = i + 1 ){
            if(array[i] == '<'){ aass = true;  }
            if(array[i] == '>'){ aass = false; }
            if(aass == true){
                modifyString = modifyString + array[i];
            }
        }
        modifyString  = modifyString.substring(1,modifyString.length());
        Memory.setTurnColor(modifyString);
        MainWindows.writeTurnOfColor(modifyString);
        return modifyString;
    }
    /**
     * spedisce al server la posizione cliccata dal bottone.
     * @param x intero posizione asse x
     * @param y intero posizione asse y
     */
    public static void sendPosition(int x,int y){
        try{
            send.println("place: <" + x + ">, <" + y + ">;");
        }
        catch(NullPointerException ex1){ System.out.println("CONTROLLERCLASS: you don't play without the server"+ex1);MainWindows.writeChronologyArea("you don't play without the server"); }
        catch(Exception ex2){ System.out.println(ex2); }
        
    }
    
    /**
     * metodo per controllare la fine del gioco
     * @param text Stringa da analizzare
     * @return restituisce il testo analizzato ( da protocollo 'end' se corretto ).
     */
    public static String controllEndGame(String text){
        String firstText = text.substring(0,3);
        return firstText ;
    }
    /**
     * metodo per disconnettersi dal server in qualsiasi momoneto della partita.
     * 1. chiude la socket.
     * 2. pulisce tutte le aree di testo.
     * 3. riorganizza la scacchiera.
     */
    public static void disconnectToServer(){
        try{
            gameStatus = false;
            socket.close();
            MainWindows.writeChronologyArea(Memory.winnerGame());
            MainWindows.jMenu2.enable(true);
            Memory.setIpAddress("");
            MainWindows.writeIpServerArea("");
            Memory.setMyColor("");
            Memory.setPort(0);
            Memory.setTurnColor("");
            Memory.resetMap();
            Memory.resetNumberTurn();
            MainWindows.writeChronologyArea("i'm disconnect to server");
        }
        catch(IOException ex1){ System.out.println("CONTROLLERCLASS: i don't disconnect to server"+ex1); }
        catch(Exception ex2){ System.out.println("CONTROLLERCLASS: eccezione " + ex2); }
    }
}

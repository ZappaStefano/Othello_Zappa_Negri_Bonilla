package controller;

import model.GameStarter;

/**
 *
 * @author Stefano Zappa
 */
public class FieldController {
    /**
     * Enum variable whitch can assume different values: White, Black or None
     */
    private enum Pawn {White, Black, None}
    /**
     * Array of type Pawn
     */
    private Pawn field [][];
    /**
     * Variables to identify when the position is on the borders to prevent OutOfBound Exception
     */
    private boolean N, S, E, W, NE, NW, SE, SW;
    
    /**
     * Constructor whitch inizialize every positon of the Pawn array as 'None'
     * To inizialize the field this constructor adds four pawn in the center of the Pawn grid
     */
    public FieldController () {
        field = new Pawn [8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field [i][j] = Pawn.None;
            }
        }
        field [3][3] = Pawn.White;
        field [3][4] = Pawn.Black;
        field [4][3] = Pawn.Black;
        field [4][4] = Pawn.White;
    }
    
    /**
     * This method verify if there are legal movements. If there are, pawns of the opposite color will change color
     * @param x Number of column
     * @param y Number of line
     * @param b True if the player is black, false if the player is white
     * @return A string content an 'Update' if the movement is valid, or a string which contains 'move not vaid' if the movement is not valid
     */
    public synchronized String Place (int x, int y, boolean b){
        resetVariables();
        Controller(x, y);
        boolean valid = false;
        if (b == false){ //Check if the player is white
            if (field [x][y].equals(Pawn.None)){
                
                //Est
                if (NE == false && SE == false && E == false && field [x][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        else if (field [x][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p2 = p2 - 1;
                                field [x][p2] = Pawn.White;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //WEST
                if (NW == false && SW == false && W == false && field [x][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        else if (field [x][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p2 = p2 + 1;
                                field [x][p2] = Pawn.White;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH
                if (NW == false && NE == false && N == false && field [x-1][y].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        else if (field [p1][y].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                field [p1][y] = Pawn.White;
                                if (p1 == x) {
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //SOUTH
                if (SW == false && SE == false && S == false && field [x+1][y].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                         if (p1 != 8 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        else if (field [p1][y].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                field [p1][y] = Pawn.White;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH-EAST
                if (N == false && E == false && NE == false && field [x-1][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                field [p1][p2] = Pawn.White;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //SOUTH-WEST
                if (S == false && W == false && SW == false && field [x+1][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                field [p1][p2] = Pawn.White;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH-WEST
                if (N == false && W == false && NW == false && field [x-1][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                field [p1][p2] = Pawn.White;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //SOUTH-EAST
                if (S == false && E == false && SE == false && field [x+1][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                field [p1][p2] = Pawn.White;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }

            if (valid == false) {
                return "move not valid;";
            }
            
            if (valid == true){
                return "update: <white>, <"+x+">, <"+y+">;";
            }
        }

        if (b == true){ //Check if the player is black
            if (field [x][y].equals(Pawn.None)){
                
                //EAST
                if (NE == false && SE == false && E == false && field [x][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        
                        else if (field [x][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p2 = p2 - 1;
                                field [x][p2] = Pawn.Black;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //WEST
                if (NW == false && SW == false && W == false && field [x][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        
                        else if (field [x][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p2 = p2 + 1;
                                field [x][p2] = Pawn.Black;
                                if (p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH
                if (NW == false && NE == false && N == false && field [x-1][y].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][y].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                field [p1][y] = Pawn.Black;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //SOUTH
                if (SW == false && SE == false && S == false && field [x+1][y].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if (p1 != 8 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][y].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                field [p1][y] = Pawn.Black;
                                if (p1 == x){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH-EAST
                if (N == false && E == false && NE == false && field [x-1][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                p2 = p2 - 1;
                                field [p1][p2] = Pawn.Black;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }           
                
                //SOUTH-WEST
                if (S == false && W == false && SW == false && field [x+1][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                p2 = p2 + 1;
                                field [p1][p2] = Pawn.Black;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //NORTH-WEST
                if (N == false && W == false && NW == false && field [x-1][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 + 1;
                                p2 = p2 + 1;
                                field [p1][p2] = Pawn.Black;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
                
                //SOUTH-EAST
                if (S == false && E == false && SE == false && field [x+1][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                       
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;
                            do {
                                p1 = p1 - 1;
                                p2 = p2 - 1;
                                field [p1][p2] = Pawn.Black;
                                if ( p1 == x && p2 == y){
                                    exit = true;
                                }
                                
                            } while (exit == false);
                            
                        }
                    }
                }
            }

           if (valid == false) {
                return "move not valid;";
            }
            
            if (valid == true){
                return "update: <black>, <"+x+">, <"+y+">;";
            }
        }
        

        
        
        return "error";
    }
    
    /**
     * Check if the movement to check is on the borders
     * @param x Number of column
     * @param y Number of line
     */
    private void Controller (int x, int y) {
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
     * Inizialize variables as <code>false</code>
     */
    private void resetVariables () {
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
     * This method checks if there are others movements to do.
     * If there aren't, the game finishes 
     */
    public synchronized void EndGameChecker (){
        int Wmovements = 0;
        int Bmovements = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (field [i][j].equals(Pawn.None)){
                    if (checker(i, j, false) == true){
                        Wmovements ++;
                    }
                    if (checker(i, j, true) == true){
                        Bmovements ++;
                    }
                }
                
            }
        }
        System.out.print("\n");
        System.out.println("Ci sono "+Wmovements+" possibili mosse per il bianco");
        System.out.println("Ci sono "+Bmovements+" possibili mosse per il nero");
        
        if (Wmovements == 0 && Bmovements == 0){
            GameStarter.g = cont ();
            //return cont ();
        }
        
        else if (GameStarter.round.equals("white") && Wmovements == 0){
            System.out.println("Non più bianchi");
            GameStarter.g = "round: <black>;";
            //return "round: <black>;";
        }
        else if (GameStarter.round.equals("black") && Bmovements == 0){
            System.out.println("Non più neri");
            GameStarter.g = "round: <white>;";
            //return "round: <white>;";
        }
        
        else
            GameStarter.g = "move not valid;";
        
    }
    
    /**
     * Method who count the number of black and white pawn on the field
     * @return A string witch contains the number of black and white pawn presents on the field
     */
    public String cont () {
        int Black = 0;
        int White = 0;
                    
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (field [i][j].equals(Pawn.Black))
                    Black = Black +1;
                if (field [i][j].equals(Pawn.White))
                    White = White +1;
            }
        }
        GameStarter.b = true;
        return "end: black, <"+Black+">, white, <"+White+">;";
    }
    
    /**
     * Method witch print the grid
     */
    public void printGrid () {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (field[i][j].equals(Pawn.None)){
                        System.out.print(" 0");
                }
                if (field[i][j].equals(Pawn.Black)){
                    System.out.print(" B");
                }
                if (field[i][j].equals(Pawn.White)){
                    System.out.print(" W");
                }
            }
            System.out.println("");
        }
    }
    
    /**
     * Check if there are legal movements to do
     * @param x Number of column
     * @param y Number of line
     * @param b True if the player is black, false if the player is white
     * @return true if there are movements, false if there aren't
     */
    private boolean checker (int x, int y, boolean b){
        resetVariables();
        Controller(x, y);
        boolean valid = false;
        
        if (b == false){ //Check if the player is white
            if (field [x][y].equals(Pawn.None)){
                //EAST
                if (NE == false && SE == false && E == false && field [x][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                         if (p2 != 8 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                       
                        else if (field [x][p2].equals(Pawn.White)){
                            valid = true;
                        }
                    }
                }
                //WEST
                if (NW == false && SW == false && W == false && field [x][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                         if (p2 != -1 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                       
                        else if (field [x][p2].equals(Pawn.White)){
                            valid = true;
                        }
                    }
                }
                //NORTH
                if (NW == false && NE == false && N == false && field [x-1][y].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][y].equals(Pawn.White)){
                            valid = true;
                        }
                    }
                }
                //SOUTH
                if (SW == false && SE == false && S == false && field [x+1][y].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if (p1 != 8 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                       
                        else if (field [p1][y].equals(Pawn.White)){
                            valid = true;
                        }
                    }
                }
                //NORTH - EAST
                if (N == false && E == false && NE == false && field [x-1][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - WEST
                if (S == false && W == false && SW == false && field [x+1][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;    
                        }
                    }
                }
                //NORTH - WEST
                if (N == false && W == false && NW == false && field [x-1][y-1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - EAST
                if (S == false && E == false && SE == false && field [x+1][y+1].equals(Pawn.Black)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.White)){
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
            if (field [x][y].equals(Pawn.None)){
                //EAST
                if (NE == false && SE == false && E == false && field [x][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 + 1;
                        if (p2 != 8 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == 8){
                            exit = true;
			}
                        
                        else if (field [x][p2].equals(Pawn.Black)){
                            valid = true;
                        }
                    }
                }
                //WEST
                if (NW == false && SW == false && W == false && field [x][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p2 = y;
                    while (exit == false) {
			p2 = p2 - 1;
                        if (p2 != -1 && field [x][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p2 == -1){
                            exit = true;
			}
                        
                        else if (field [x][p2].equals(Pawn.Black)){
                            valid = true;
                        }
                    }
                }
                //NORTH
                if (NW == false && NE == false && N == false && field [x-1][y].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 - 1;
                        if (p1 != -1 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][y].equals(Pawn.Black)){
                            valid = true;
                        }
                    }
                }
                //SOUTH
                if (SW == false && SE == false && S == false && field [(x+1)][y].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    while (exit == false) {
			p1 = p1 + 1;
                        if (p1 != 8 && field [p1][y].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][y].equals(Pawn.Black)){
                            valid = true;
                        }
                    }
                }
                //NORTH - EAST
                if (N == false && E == false && NE == false && field [x-1][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 + 1;
                        if (p1 != -1 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - WEST
                if (S == false && W == false && SW == false && field [x+1][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 - 1;
                        if (p1 != 8 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;    
                        }
                    }
                }
                //NORTH - WEST
                if (N == false && W == false && NW == false && field [x-1][y-1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 - 1;
			p2 = p2 - 1;
                        if (p1 != -1 && p2 != -1 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == -1 || p2 == -1){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
                            valid = true;    
                        }
                    }
                }
                //SOUTH - EAST
                if (S == false && E == false && SE == false && field [x+1][y+1].equals(Pawn.White)){
                    boolean exit = false;
                    int p1 = x;
                    int p2 = y;
                    while (exit == false) {
			p1 = p1 + 1;
			p2 = p2 + 1;
                        if (p1 != 8 && p2 != 8 && field [p1][p2].equals(Pawn.None)){
                            exit = true;
                        }
                        if (p1 == 8 || p2 == 8){
                            exit = true;
			}
                        
                        else if (field [p1][p2].equals(Pawn.Black)){
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

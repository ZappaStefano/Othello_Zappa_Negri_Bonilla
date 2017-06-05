package controller;

/**
 * thread per la creazione di una connessione tra server e client
 * @author negri.gioele
 */
public class connection extends Thread{
    private ControllerClass c;
    private final String ip;
    private final int port;
    /**
     * costruttore per ottenere le informazioni necessarie affinche inizi una partita.
     * @param ip Stringa contenente l'ip.
     * @param port intero contenente la porta.
     */
    public connection(String ip,int port){
        this.ip = ip;
        this.port = port;
    }
    /**
     * metodo run del thread.
     */
    @Override
    public void run(){
        c = new ControllerClass();
        c.connectServer(ip,port);
    }
}

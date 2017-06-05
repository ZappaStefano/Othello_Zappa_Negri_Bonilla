package view;

import controller.ControllerClass;
import controller.connection;

/**
 * classe per la connessione al server.
 * contiene la grafica per connettersi.
 * @author negri.gioele
 */
public class ConnectionWindows extends javax.swing.JFrame {
    public ConnectionWindows() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IpLabel = new javax.swing.JLabel();
        Ip1Textfield = new javax.swing.JTextField();
        Connect = new javax.swing.JButton();
        LabelPort = new javax.swing.JLabel();
        PortTextfield2 = new javax.swing.JTextField();
        localHostButton = new javax.swing.JButton();
        jLabelOptions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Connection");
        setResizable(false);

        IpLabel.setText("IP:");

        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        LabelPort.setText("Port:");

        localHostButton.setText("LocalHost");
        localHostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localHostButtonActionPerformed(evt);
            }
        });

        jLabelOptions.setText("Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localHostButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ip1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(LabelPort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PortTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ip1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IpLabel)
                    .addComponent(LabelPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PortTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localHostButton)
                    .addComponent(jLabelOptions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Connect)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * it's a button for confirm the IP address
     */
    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        ControllerClass controller = new ControllerClass(); 
        String ip = Ip1Textfield.getText();
        int port ;
        try{
            String portTest = PortTextfield2.getText();
            port = Integer.parseInt(portTest);
            connection connect = new connection(ip, port);
            connect.start();
            closeWindow();   
        }
        catch(NumberFormatException ex){ System.out.println("CONNECTIONWINDOWS: non inserire lettere"); }
        catch(Exception ex1){ System.out.println("CONNECTIONWINDOWS: " + ex1); }
        
    }//GEN-LAST:event_ConnectActionPerformed
    //button of local host
    private void localHostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localHostButtonActionPerformed
        Ip1Textfield.setText("0.0.0.0");
        PortTextfield2.setText("2000");
    }//GEN-LAST:event_localHostButtonActionPerformed
    /**
     * metodo per chiudere la finestras
     */
    public void closeWindow(){
        setVisible(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JTextField Ip1Textfield;
    private javax.swing.JLabel IpLabel;
    private javax.swing.JLabel LabelPort;
    private javax.swing.JTextField PortTextfield2;
    private javax.swing.JLabel jLabelOptions;
    private javax.swing.JButton localHostButton;
    // End of variables declaration//GEN-END:variables
}
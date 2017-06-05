package view;

import controller.ControllerClass;
import model.Memory;
import model.OthelloServer;

/**
 * classe principale.
 * contiene la grafica del gioco.
 * @author negri.gioele
 */
public class MainWindows extends javax.swing.JFrame {
    public MainWindows() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Info = new javax.swing.JPanel();
        infoBoxLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChronologyActionsArea = new javax.swing.JTextArea();
        chronologyLabel = new javax.swing.JLabel();
        ipServerLabel = new javax.swing.JLabel();
        IpServerArea = new javax.swing.JTextField();
        yourColorArea = new javax.swing.JTextField();
        yourColorLabel = new javax.swing.JLabel();
        turnOfLabel = new javax.swing.JLabel();
        TurnColorArea = new javax.swing.JTextField();
        NumberTurnLabel = new javax.swing.JLabel();
        NumberTextField = new javax.swing.JTextField();
        labelNumberDiscs = new javax.swing.JLabel();
        numberDiscsTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sfondo = new javax.swing.JPanel();
        Chessboard8 = new javax.swing.JPanel();
        ButtonLocation79 = new javax.swing.JButton();
        ButtonLocation80 = new javax.swing.JButton();
        ButtonLocation89 = new javax.swing.JButton();
        ButtonLocation90 = new javax.swing.JButton();
        ButtonLocation91 = new javax.swing.JButton();
        ButtonLocation92 = new javax.swing.JButton();
        ButtonLocation93 = new javax.swing.JButton();
        ButtonLocation94 = new javax.swing.JButton();
        Chessboard9 = new javax.swing.JPanel();
        ButtonLocation69 = new javax.swing.JButton();
        ButtonLocation70 = new javax.swing.JButton();
        ButtonLocation95 = new javax.swing.JButton();
        ButtonLocation96 = new javax.swing.JButton();
        ButtonLocation97 = new javax.swing.JButton();
        ButtonLocation98 = new javax.swing.JButton();
        ButtonLocation99 = new javax.swing.JButton();
        ButtonLocation100 = new javax.swing.JButton();
        Chessboard10 = new javax.swing.JPanel();
        ButtonLocation49 = new javax.swing.JButton();
        ButtonLocation50 = new javax.swing.JButton();
        ButtonLocation59 = new javax.swing.JButton();
        ButtonLocation60 = new javax.swing.JButton();
        ButtonLocation101 = new javax.swing.JButton();
        ButtonLocation102 = new javax.swing.JButton();
        ButtonLocation103 = new javax.swing.JButton();
        ButtonLocation104 = new javax.swing.JButton();
        Chessboard11 = new javax.swing.JPanel();
        ButtonLocation29 = new javax.swing.JButton();
        ButtonLocation30 = new javax.swing.JButton();
        ButtonLocation39 = new javax.swing.JButton();
        ButtonLocation40 = new javax.swing.JButton();
        ButtonLocation105 = new javax.swing.JButton();
        ButtonLocation106 = new javax.swing.JButton();
        ButtonLocation107 = new javax.swing.JButton();
        ButtonLocation108 = new javax.swing.JButton();
        Chessboard12 = new javax.swing.JPanel();
        ButtonLocation109 = new javax.swing.JButton();
        ButtonLocation110 = new javax.swing.JButton();
        ButtonLocation111 = new javax.swing.JButton();
        ButtonLocation112 = new javax.swing.JButton();
        ButtonLocation113 = new javax.swing.JButton();
        ButtonLocation114 = new javax.swing.JButton();
        ButtonLocation115 = new javax.swing.JButton();
        ButtonLocation116 = new javax.swing.JButton();
        Chessboard13 = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        ButtonLocation20 = new javax.swing.JButton();
        ButtonLocation117 = new javax.swing.JButton();
        ButtonLocation118 = new javax.swing.JButton();
        ButtonLocation119 = new javax.swing.JButton();
        ButtonLocation120 = new javax.swing.JButton();
        ButtonLocation121 = new javax.swing.JButton();
        ButtonLocation122 = new javax.swing.JButton();
        Chessboard14 = new javax.swing.JPanel();
        ButtonLocation123 = new javax.swing.JButton();
        ButtonLocation124 = new javax.swing.JButton();
        ButtonLocation125 = new javax.swing.JButton();
        ButtonLocation126 = new javax.swing.JButton();
        ButtonLocation127 = new javax.swing.JButton();
        ButtonLocation128 = new javax.swing.JButton();
        ButtonLocation129 = new javax.swing.JButton();
        ButtonLocation130 = new javax.swing.JButton();
        Chessboard15 = new javax.swing.JPanel();
        ButtonLocation131 = new javax.swing.JButton();
        ButtonLocation132 = new javax.swing.JButton();
        ButtonLocation133 = new javax.swing.JButton();
        ButtonLocation134 = new javax.swing.JButton();
        ButtonLocation135 = new javax.swing.JButton();
        ButtonLocation136 = new javax.swing.JButton();
        ButtonLocation137 = new javax.swing.JButton();
        ButtonLocation138 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        StartServerMenu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Othello");
        setResizable(false);

        infoBoxLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infoBoxLabel.setText("Info box");

        ChronologyActionsArea.setEditable(false);
        ChronologyActionsArea.setColumns(20);
        ChronologyActionsArea.setRows(5);
        jScrollPane1.setViewportView(ChronologyActionsArea);

        chronologyLabel.setText(" Chronology of actions:");

        ipServerLabel.setText("Ip server :");

        IpServerArea.setEditable(false);

        yourColorArea.setEditable(false);

        yourColorLabel.setText("Your color :");

        turnOfLabel.setText("Turn of :");

        TurnColorArea.setEditable(false);

        NumberTurnLabel.setText("Number :");

        NumberTextField.setEditable(false);

        labelNumberDiscs.setText("Number discs");

        numberDiscsTextField.setEditable(false);

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoBoxLabel)
                .addGap(173, 173, 173))
            .addGroup(InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addComponent(chronologyLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoLayout.createSequentialGroup()
                                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipServerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yourColorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(turnOfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addGroup(InfoLayout.createSequentialGroup()
                                .addComponent(labelNumberDiscs)
                                .addGap(1, 1, 1)))
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberDiscsTextField)
                            .addComponent(yourColorArea, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(IpServerArea)
                            .addGroup(InfoLayout.createSequentialGroup()
                                .addComponent(TurnColorArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumberTurnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoBoxLabel)
                .addGap(7, 7, 7)
                .addComponent(chronologyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IpServerArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipServerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourColorLabel)
                    .addComponent(yourColorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(turnOfLabel)
                    .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TurnColorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NumberTurnLabel)
                        .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumberDiscs)
                    .addComponent(numberDiscsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chessboard");

        sfondo.setBackground(new java.awt.Color(0, 0, 102));
        sfondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Chessboard8.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard8.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation79.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation79ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation79);

        ButtonLocation80.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation80ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation80);

        ButtonLocation89.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation89ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation89);

        ButtonLocation90.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation90ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation90);

        ButtonLocation91.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation91ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation91);

        ButtonLocation92.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation92ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation92);

        ButtonLocation93.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation93ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation93);

        ButtonLocation94.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation94ActionPerformed(evt);
            }
        });
        Chessboard8.add(ButtonLocation94);

        Chessboard9.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard9.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation69.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation69ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation69);

        ButtonLocation70.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation70ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation70);

        ButtonLocation95.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation95ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation95);

        ButtonLocation96.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation96ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation96);

        ButtonLocation97.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation97ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation97);

        ButtonLocation98.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation98ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation98);

        ButtonLocation99.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation99ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation99);

        ButtonLocation100.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation100ActionPerformed(evt);
            }
        });
        Chessboard9.add(ButtonLocation100);

        Chessboard10.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard10.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation49.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation49ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation49);

        ButtonLocation50.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation50ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation50);

        ButtonLocation59.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation59ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation59);

        ButtonLocation60.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png"))); // NOI18N
        ButtonLocation60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation60ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation60);

        ButtonLocation101.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png"))); // NOI18N
        ButtonLocation101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation101ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation101);

        ButtonLocation102.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation102ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation102);

        ButtonLocation103.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation103ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation103);

        ButtonLocation104.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation104ActionPerformed(evt);
            }
        });
        Chessboard10.add(ButtonLocation104);

        Chessboard11.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard11.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation29.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation29ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation29);

        ButtonLocation30.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation30ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation30);

        ButtonLocation39.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation39ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation39);

        ButtonLocation40.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation40ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation40);

        ButtonLocation105.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation105ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation105);

        ButtonLocation106.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation106ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation106);

        ButtonLocation107.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation107ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation107);

        ButtonLocation108.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation108ActionPerformed(evt);
            }
        });
        Chessboard11.add(ButtonLocation108);

        Chessboard12.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard12.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation109.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation109ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation109);

        ButtonLocation110.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation110ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation110);

        ButtonLocation111.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation111ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation111);

        ButtonLocation112.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/black.png"))); // NOI18N
        ButtonLocation112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation112ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation112);

        ButtonLocation113.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/white.png"))); // NOI18N
        ButtonLocation113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation113ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation113);

        ButtonLocation114.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation114ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation114);

        ButtonLocation115.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation115ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation115);

        ButtonLocation116.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation116ActionPerformed(evt);
            }
        });
        Chessboard12.add(ButtonLocation116);

        Chessboard13.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard13.setLayout(new java.awt.GridLayout(1, 0));

        b00.setBackground(new java.awt.Color(0, 102, 51));
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        Chessboard13.add(b00);

        ButtonLocation20.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation20ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation20);

        ButtonLocation117.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation117ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation117);

        ButtonLocation118.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation118ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation118);

        ButtonLocation119.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation119ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation119);

        ButtonLocation120.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation120ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation120);

        ButtonLocation121.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation121ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation121);

        ButtonLocation122.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation122ActionPerformed(evt);
            }
        });
        Chessboard13.add(ButtonLocation122);

        Chessboard14.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard14.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation123.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation123ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation123);

        ButtonLocation124.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation124ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation124);

        ButtonLocation125.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation125ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation125);

        ButtonLocation126.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation126ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation126);

        ButtonLocation127.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation127ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation127);

        ButtonLocation128.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation128ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation128);

        ButtonLocation129.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation129ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation129);

        ButtonLocation130.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation130ActionPerformed(evt);
            }
        });
        Chessboard14.add(ButtonLocation130);

        Chessboard15.setBackground(new java.awt.Color(0, 0, 102));
        Chessboard15.setLayout(new java.awt.GridLayout(1, 0));

        ButtonLocation131.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation131ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation131);

        ButtonLocation132.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation132ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation132);

        ButtonLocation133.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation133ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation133);

        ButtonLocation134.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation134ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation134);

        ButtonLocation135.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation135ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation135);

        ButtonLocation136.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation136ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation136);

        ButtonLocation137.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation137ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation137);

        ButtonLocation138.setBackground(new java.awt.Color(0, 102, 51));
        ButtonLocation138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLocation138ActionPerformed(evt);
            }
        });
        Chessboard15.add(ButtonLocation138);

        javax.swing.GroupLayout sfondoLayout = new javax.swing.GroupLayout(sfondo);
        sfondo.setLayout(sfondoLayout);
        sfondoLayout.setHorizontalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sfondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Chessboard11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Chessboard15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chessboard12, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sfondoLayout.setVerticalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
            .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sfondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Chessboard13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Chessboard14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("Multiplayer");

        jMenuItem1.setText("Connect");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Disconnect");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MenuBar.add(jMenu1);

        jMenu2.setText("Server");

        StartServerMenu.setText("Start Server");
        StartServerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartServerMenuActionPerformed(evt);
            }
        });
        jMenu2.add(StartServerMenu);

        jMenuItem3.setText("Options");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addComponent(sfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /*VARIABLE*/
        private static OthelloServer o;
        public static boolean serverStart = false;
    /*FORM*/
    /**
     * it's a method for button : 0-0
     */
    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        int x = 0;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_b00ActionPerformed

    /**
     * it's a method for button : 0-1
     */
    private void ButtonLocation20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation20ActionPerformed
        int x = 0;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation20ActionPerformed

    /**
     * it's a method for button : 0-2
     */
    private void ButtonLocation117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation117ActionPerformed
        int x = 0;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation117ActionPerformed

    /**
     * it's a method for button : 0-3
     */
    private void ButtonLocation118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation118ActionPerformed
        int x = 0;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation118ActionPerformed

    /**
     * it's a method for button : 0-4
     */
    private void ButtonLocation119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation119ActionPerformed
        int x = 0;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation119ActionPerformed

    /**
     * it's a method for button : 0-5
     */
    private void ButtonLocation120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation120ActionPerformed
        int x = 0;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation120ActionPerformed

    /**
     * it's a method for button : 0-6
     */
    private void ButtonLocation121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation121ActionPerformed
        int x = 0;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation121ActionPerformed

    /**
     * it's a method for button : 0-7
     */
    private void ButtonLocation122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation122ActionPerformed
        int x = 0;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation122ActionPerformed

    /**
     * it's a method for button : 1-0
     */
    private void ButtonLocation29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation29ActionPerformed
        int x = 1;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation29ActionPerformed

    /**
     * it's a method for button : 1-1
     */
    private void ButtonLocation30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation30ActionPerformed
        int x = 1;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation30ActionPerformed

    /**
     * it's a method for button : 1-2
     */
    private void ButtonLocation39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation39ActionPerformed
        int x = 1;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation39ActionPerformed

    /**
     * it's a method for button : 1-3
     */
    private void ButtonLocation40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation40ActionPerformed
        int x = 1;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation40ActionPerformed

    /**
     * it's a method for button : 1-4
     */
    private void ButtonLocation105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation105ActionPerformed
        int x = 1;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation105ActionPerformed

    /**
     * it's a method for button : 1-5
     */
    private void ButtonLocation106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation106ActionPerformed
        int x = 1;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation106ActionPerformed

    /**
     * it's a method for button : 1-6
     */
    private void ButtonLocation107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation107ActionPerformed
        int x = 1;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation107ActionPerformed

    /**
     * it's a method for button : 1-7
     */
    private void ButtonLocation108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation108ActionPerformed
        int x = 1;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation108ActionPerformed

    /**
     * it's a method for button : 2-0
     */
    private void ButtonLocation131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation131ActionPerformed
        int x = 2;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation131ActionPerformed

    /**
     * it's a method for button : 2-1
     */
    private void ButtonLocation132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation132ActionPerformed
        int x = 2;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation132ActionPerformed

    /**
     * it's a method for button : 2-2
     */
    private void ButtonLocation133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation133ActionPerformed
        int x = 2;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation133ActionPerformed

    /**
     * it's a method for button : 2-3
     */
    private void ButtonLocation134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation134ActionPerformed
       int x = 2;
       int y = 3;
       System.out.println("x : " + x + " y : " + y); 
       if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation134ActionPerformed

    /**
     * it's a method for button : 2-4
     */
    private void ButtonLocation135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation135ActionPerformed
        int x = 2;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation135ActionPerformed

    /**
     * it's a method for button : 2-5
     */
    private void ButtonLocation136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation136ActionPerformed
        int x = 2;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation136ActionPerformed

    /**
     * it's a method for button : 2-6
     */
    private void ButtonLocation137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation137ActionPerformed
        int x = 2;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation137ActionPerformed

    /**
     * it's a method for button : 2-7
     */
    private void ButtonLocation138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation138ActionPerformed
        int x = 2;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation138ActionPerformed

    /**
     * it's a method for button : 3-0
     */
    private void ButtonLocation49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation49ActionPerformed
        int x = 3;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation49ActionPerformed

    /**
     * it's a method for button : 3-1
     */
    private void ButtonLocation50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation50ActionPerformed
        int x = 3;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation50ActionPerformed

    /**
     * it's a method for button : 3-2
     */
    private void ButtonLocation59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation59ActionPerformed
        int x = 3;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation59ActionPerformed

    /**
     * it's a method for button : 3-3
     */
    private void ButtonLocation60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation60ActionPerformed
        int x = 3;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation60ActionPerformed

    /**
     * it's a method for button : 3-4
     */
    private void ButtonLocation101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation101ActionPerformed
        int x = 3;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation101ActionPerformed

    /**
     * it's a method for button : 3-5
     */
    private void ButtonLocation102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation102ActionPerformed
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation102ActionPerformed

    /**
     * it's a method for button : 3-6
     */
    private void ButtonLocation103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation103ActionPerformed
        int x = 3;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation103ActionPerformed

    /**
     * it's a method for button : 3-7
     */
    private void ButtonLocation104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation104ActionPerformed
        int x = 3;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation104ActionPerformed

    /**
     * it's a method for button : 4-0
     */
    private void ButtonLocation109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation109ActionPerformed
        int x = 4;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation109ActionPerformed

    /**
     * it's a method for button : 4-1
     */
    private void ButtonLocation110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation110ActionPerformed
        int x = 4;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation110ActionPerformed

    /**
     * it's a method for button : 4-2
     */
    private void ButtonLocation111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation111ActionPerformed
        int x = 4;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation111ActionPerformed

    /**
     * it's a method for button : 4-3
     */
    private void ButtonLocation112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation112ActionPerformed
        int x = 4;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation112ActionPerformed

    /**
     * it's a method for button : 4-4
     */
    private void ButtonLocation113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation113ActionPerformed
        int x = 4;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation113ActionPerformed

    /**
     * it's a method for button : 4-5
     */
    private void ButtonLocation114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation114ActionPerformed
        int x = 4;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation114ActionPerformed

    /**
     * it's a method for button : 4-6
     */
    private void ButtonLocation115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation115ActionPerformed
        int x = 4;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation115ActionPerformed

    /**
     * it's a method for button : 4-7
     */
    private void ButtonLocation116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation116ActionPerformed
        int x = 4;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation116ActionPerformed

    /**
     * it's a method for button : 5-0
     */
    private void ButtonLocation69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation69ActionPerformed
        int x = 5;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation69ActionPerformed

    /**
     * it's a method for button : 5-1
     */
    private void ButtonLocation70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation70ActionPerformed
        int x = 5;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation70ActionPerformed

    /**
     * it's a method for button : 5-2
     */
    private void ButtonLocation95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation95ActionPerformed
        int x = 5;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation95ActionPerformed

    /**
     * it's a method for button : 5-3
     */
    private void ButtonLocation96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation96ActionPerformed
        int x = 5;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation96ActionPerformed

    /**
     * it's a method for button : 5-4
     */
    private void ButtonLocation97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation97ActionPerformed
        int x = 5;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation97ActionPerformed

    /**
     * it's a method for button : 5-5
     */
    private void ButtonLocation98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation98ActionPerformed
        int x = 5;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation98ActionPerformed

    /**
     * it's a method for button : 5-6
     */
    private void ButtonLocation99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation99ActionPerformed
        int x = 5;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation99ActionPerformed

    /**
     * it's a method for button : 5-7
     */
    private void ButtonLocation100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation100ActionPerformed
        int x = 5;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation100ActionPerformed

    /**
     * it's a method for button : 6-0
     */
    private void ButtonLocation79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation79ActionPerformed
        int x = 6;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation79ActionPerformed

    /**
     * it's a method for button : 6-1
     */
    private void ButtonLocation80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation80ActionPerformed
        int x = 6;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation80ActionPerformed

    /**
     * it's a method for button : 6-2
     */
    private void ButtonLocation89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation89ActionPerformed
        int x = 6;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation89ActionPerformed

    /**
     * it's a method for button : 6-3
     */
    private void ButtonLocation90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation90ActionPerformed
        int x = 6;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation90ActionPerformed

    /**
     * it's a method for button : 6-4
     */
    private void ButtonLocation91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation91ActionPerformed
        int x = 6;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation91ActionPerformed

    /**
     * it's a method for button : 6-5
     */
    private void ButtonLocation92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation92ActionPerformed
        int x = 6;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation92ActionPerformed

    /**
     * it's a method for button : 6-6
     */
    private void ButtonLocation93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation93ActionPerformed
        int x = 6;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation93ActionPerformed

    /**
     * it's a method for button : 6-7
     */
    private void ButtonLocation94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation94ActionPerformed
        int x = 6;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation94ActionPerformed

    /**
     * it's a method for button : 7-0
     */
    private void ButtonLocation123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation123ActionPerformed
        int x = 7;
        int y = 0;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation123ActionPerformed

    /**
     * it's a method for button : 7-1
     */
    private void ButtonLocation124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation124ActionPerformed
        int x = 7;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation124ActionPerformed

    /**
     * it's a method for button : 7-2
     */
    private void ButtonLocation125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation125ActionPerformed
        int x = 7;
        int y = 2;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation125ActionPerformed

    /**
     * it's a method for button : 7-3
     */
    private void ButtonLocation126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation126ActionPerformed
        int x = 7;
        int y = 3;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation126ActionPerformed

    /**
     * it's a method for button : 7-4
     */
    private void ButtonLocation127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation127ActionPerformed
        int x = 7;
        int y = 4;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation127ActionPerformed

    /**
     * it's a method for button : 7-5
     */
    private void ButtonLocation128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation128ActionPerformed
        int x = 7;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation128ActionPerformed

    /**
     * it's a method for button : 7-6
     */
    private void ButtonLocation129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation129ActionPerformed
        int x = 7;
        int y = 6;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation129ActionPerformed

    /**
     * it's a method for button : 7-7
     */
    private void ButtonLocation130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLocation130ActionPerformed
        int x = 7;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        if(Memory.getMyColor().equals(Memory.getTurnColor())){
            ControllerClass.sendPosition(x, y);
        }else{
            writeChronologyArea("non è il tuo turno");
        }
    }//GEN-LAST:event_ButtonLocation130ActionPerformed
  
    /**
     * it's a method for button : Multiplayer.
     * this button in in menu bar
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jMenu2.enable(false);
        java.awt.EventQueue.invokeLater(() -> {
            new ConnectionWindows().setVisible(true);
        });
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /** disconnect */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jMenu2.enable(true);
        ControllerClass.disconnectToServer();
        Memory.resetView();
        ChronologyActionsArea.setText("");
        numberDiscsTextField.setText("");
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    /* button to start the server */
    private void StartServerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartServerMenuActionPerformed
        this.setVisible(false);
        if(serverStart == false){
            try{
                o = new OthelloServer();
                o.start();
            }catch(Exception ex1){ System.out.println("eccezione nel server"); }
            jMenu1.enable(false);
            new Memory().disableButton();
            serverStart = true;
        }else{
            writeChronologyArea("non puoi avviare due server nell stesso tempo");
        }
    }//GEN-LAST:event_StartServerMenuActionPerformed
    /* options server*/
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(serverStart == true){
            writeChronologyArea("server is already start. ican't modify the options ");
        }else{
            java.awt.EventQueue.invokeLater(() -> {
                new OptionServerView().setVisible(true);
            });
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * method for write a new text at the text area.
     * this method read the text already present on text area; than it add the new text with the "\n" and push on the new text.
     * @param text String of text to add at text area
     */
    public static void writeChronologyArea(String text){
        String firstText = ChronologyActionsArea.getText();
        firstText = firstText + text + "\n";
        ChronologyActionsArea.setText(firstText);
    }
    /**
     * metodo per scrivere sulla textfield corrispondente all'ip del server
     * @param text Stringa del testo da aggiungere.
     */
    public static void writeIpServerArea(String text){
        IpServerArea.setText(text);
    }
    /**
     * metodo per scrivere sulla textfield corrispondente al colore del giocatore
     * @param text Stringa del testo da aggiungere.
     */
    public static void writeYourColorArea(String text){
        yourColorArea.setText(text);
    }
    /**
     * metodo per scrivere sulla textfield corrispondente al colore del turno
     * @param text Stringa del testo da aggiungere.
     */
    public static void writeTurnOfColor(String text){
        TurnColorArea.setText(text);
    }
    /**     
     * metodo per scrivere sulla textfield corrispondente al numero di turni giocati
     * @param text Stringa del testo da aggiungere.
     */
    public static void writeNumberTurn(String text){
        NumberTextField.setText(text);
    }
    /**
     * metodo per scrivere sulla textfield corrispondente al numero delle pedine in tempo reale
     * @param text Stringa del testo da aggiungere.
     */
    public static void writeNumberDiscs(String text){
        numberDiscsTextField.setText(text);
    }

    /*MAIN*/
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindows().setVisible(true);
        });
        //inizializzazione mappa
        new Memory().newGame();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ButtonLocation100;
    public static javax.swing.JButton ButtonLocation101;
    public static javax.swing.JButton ButtonLocation102;
    public static javax.swing.JButton ButtonLocation103;
    public static javax.swing.JButton ButtonLocation104;
    public static javax.swing.JButton ButtonLocation105;
    public static javax.swing.JButton ButtonLocation106;
    public static javax.swing.JButton ButtonLocation107;
    public static javax.swing.JButton ButtonLocation108;
    public static javax.swing.JButton ButtonLocation109;
    public static javax.swing.JButton ButtonLocation110;
    public static javax.swing.JButton ButtonLocation111;
    public static javax.swing.JButton ButtonLocation112;
    public static javax.swing.JButton ButtonLocation113;
    public static javax.swing.JButton ButtonLocation114;
    public static javax.swing.JButton ButtonLocation115;
    public static javax.swing.JButton ButtonLocation116;
    public static javax.swing.JButton ButtonLocation117;
    public static javax.swing.JButton ButtonLocation118;
    public static javax.swing.JButton ButtonLocation119;
    public static javax.swing.JButton ButtonLocation120;
    public static javax.swing.JButton ButtonLocation121;
    public static javax.swing.JButton ButtonLocation122;
    public static javax.swing.JButton ButtonLocation123;
    public static javax.swing.JButton ButtonLocation124;
    public static javax.swing.JButton ButtonLocation125;
    public static javax.swing.JButton ButtonLocation126;
    public static javax.swing.JButton ButtonLocation127;
    public static javax.swing.JButton ButtonLocation128;
    public static javax.swing.JButton ButtonLocation129;
    public static javax.swing.JButton ButtonLocation130;
    public static javax.swing.JButton ButtonLocation131;
    public static javax.swing.JButton ButtonLocation132;
    public static javax.swing.JButton ButtonLocation133;
    public static javax.swing.JButton ButtonLocation134;
    public static javax.swing.JButton ButtonLocation135;
    public static javax.swing.JButton ButtonLocation136;
    public static javax.swing.JButton ButtonLocation137;
    public static javax.swing.JButton ButtonLocation138;
    public static javax.swing.JButton ButtonLocation20;
    public static javax.swing.JButton ButtonLocation29;
    public static javax.swing.JButton ButtonLocation30;
    public static javax.swing.JButton ButtonLocation39;
    public static javax.swing.JButton ButtonLocation40;
    public static javax.swing.JButton ButtonLocation49;
    public static javax.swing.JButton ButtonLocation50;
    public static javax.swing.JButton ButtonLocation59;
    public static javax.swing.JButton ButtonLocation60;
    public static javax.swing.JButton ButtonLocation69;
    public static javax.swing.JButton ButtonLocation70;
    public static javax.swing.JButton ButtonLocation79;
    public static javax.swing.JButton ButtonLocation80;
    public static javax.swing.JButton ButtonLocation89;
    public static javax.swing.JButton ButtonLocation90;
    public static javax.swing.JButton ButtonLocation91;
    public static javax.swing.JButton ButtonLocation92;
    public static javax.swing.JButton ButtonLocation93;
    public static javax.swing.JButton ButtonLocation94;
    public static javax.swing.JButton ButtonLocation95;
    public static javax.swing.JButton ButtonLocation96;
    public static javax.swing.JButton ButtonLocation97;
    public static javax.swing.JButton ButtonLocation98;
    public static javax.swing.JButton ButtonLocation99;
    private javax.swing.JPanel Chessboard10;
    private javax.swing.JPanel Chessboard11;
    private javax.swing.JPanel Chessboard12;
    private javax.swing.JPanel Chessboard13;
    private javax.swing.JPanel Chessboard14;
    private javax.swing.JPanel Chessboard15;
    private javax.swing.JPanel Chessboard8;
    private javax.swing.JPanel Chessboard9;
    private static javax.swing.JTextArea ChronologyActionsArea;
    private javax.swing.JPanel Info;
    private static javax.swing.JTextField IpServerArea;
    private javax.swing.JMenuBar MenuBar;
    private static javax.swing.JTextField NumberTextField;
    private javax.swing.JLabel NumberTurnLabel;
    private javax.swing.JMenuItem StartServerMenu;
    private static javax.swing.JTextField TurnColorArea;
    public static javax.swing.JButton b00;
    private javax.swing.JLabel chronologyLabel;
    private javax.swing.JLabel infoBoxLabel;
    private javax.swing.JLabel ipServerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNumberDiscs;
    private static javax.swing.JTextField numberDiscsTextField;
    private javax.swing.JPanel sfondo;
    private javax.swing.JLabel turnOfLabel;
    private static javax.swing.JTextField yourColorArea;
    private javax.swing.JLabel yourColorLabel;
    // End of variables declaration//GEN-END:variables
}

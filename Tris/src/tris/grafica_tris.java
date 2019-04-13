package tris;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author Jay Lean
 */
public class grafica_tris extends JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    
    /**
     * Creates new form grafica_tris
     */
    public grafica_tris() {
        initComponents();
        setSize(1200, 600); 
        
        
    }
    
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
    }

    private void choose_a_player(){
        
        if(startGame.equalsIgnoreCase("X")) {startGame = "O";
        jPanel6.setBackground(Color.ORANGE);
        jPanel11.setBackground(Color.GREEN);
        }
        else {startGame = "X";
        jPanel11.setBackground(Color.ORANGE);
        jPanel6.setBackground(Color.GREEN);
        }
    }
    private void enableButtons(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
    }
     private void disableButtons(){
         
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
    }
    
    private void game_winning(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton6.getText();
        String b5 = jButton7.getText();
        String b6 = jButton8.getText();
        
        String b7 = jButton11.getText();
        String b8 = jButton12.getText();
        String b9 = jButton13.getText();
                
        
        if(b1 == "X" && b2 == "X" && b3 == "X"){
            enableButtons();                     
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);  
            disableButtons();
        }
        
        else if(b4 == "X" && b5 == "X" && b6 == "X"){
            enableButtons();
            jButton6.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);      
            disableButtons();
        }
        else if(b7 == "X" && b8 == "X" && b9 == "X"){
            enableButtons();
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);  
            disableButtons();
        }
        else if(b1 == "X" && b4 == "X" && b7 == "X"){
            enableButtons();
            jButton1.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);    
            disableButtons();
        }
        else if(b2 == "X" && b5 == "X" && b8 == "X"){
            enableButtons();
            jButton2.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);    
            disableButtons();
        }
        else if(b3 == "X" && b6 == "X" && b9 == "X"){
            enableButtons();
            jButton3.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);   
            disableButtons();
        }
        else if(b1 == "X" && b5 == "X" && b9 == "X"){
            enableButtons();
            jButton1.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);     
            disableButtons();
        }
        else if(b3 == "X" && b5 == "X" && b7 == "X"){
           enableButtons();
            jButton3.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            jblPlayerX.setForeground(Color.GREEN);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);  
            disableButtons();
        }
         
         
         
        else if(b1 == "O" && b2 == "O" && b3 == "O"){
            enableButtons();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);         
            disableButtons();
        }
        
       else if(b4 == "O" && b5 == "O" && b6 == "O"){
            enableButtons();
            jButton6.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);         
            disableButtons();
        }
       else if(b7 == "O" && b8 == "O" && b9 == "O"){
            enableButtons();
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);   
            disableButtons();
        }
       else if(b1 == "O" && b4 == "O" && b7 == "O"){
           enableButtons();
            jButton1.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);    
            disableButtons();
        }
       else if(b2 == "O" && b5 == "O" && b8 == "O"){
            enableButtons();
            jButton2.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);    
            disableButtons();
        }
       else if(b3 == "O" && b6 == "O" && b9 == "O"){
          enableButtons();
            jButton3.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);         
            disableButtons();
        }
       else if(b1 == "O" && b5 == "O" && b9 == "O"){
            enableButtons();
            jButton1.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);          
            disableButtons();
        }
       else if(b3 == "O" && b5 == "O" && b7 == "O"){
            enableButtons();
            jButton3.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            jblPlayerO.setForeground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O è il vincitore !!", "Tris", JOptionPane.INFORMATION_MESSAGE);       
            disableButtons();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tris");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Rosewood Std", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic tac toe  (TRIS)");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 21));
        jButton1.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(255, 204, 21));
        jButton2.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(255, 204, 21));
        jButton3.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 255, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 32)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X : ");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setBackground(new java.awt.Color(255, 204, 102));
        jblPlayerX.setFont(new java.awt.Font("Stencil Std", 1, 64)); // NOI18N
        jblPlayerX.setForeground(new java.awt.Color(204, 51, 0));
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("o");
        jPanel7.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 204, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(255, 204, 21));
        jButton6.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 102, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(255, 204, 21));
        jButton7.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 102, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(255, 204, 21));
        jButton8.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 102, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 204, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(255, 200, 0));
        jLabel4.setFont(new java.awt.Font("Stencil Std", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player O :");
        jPanel11.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 204, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setBackground(new java.awt.Color(255, 204, 102));
        jblPlayerO.setFont(new java.awt.Font("Stencil Std", 1, 64)); // NOI18N
        jblPlayerO.setForeground(new java.awt.Color(204, 51, 0));
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("o");
        jPanel12.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 204, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(255, 204, 21));
        jButton11.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 102, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 204, 102));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setBackground(new java.awt.Color(255, 204, 21));
        jButton12.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 102, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 204, 102));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setBackground(new java.awt.Color(255, 204, 21));
        jButton13.setFont(new java.awt.Font("Phosphate", 1, 96)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 102, 0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 204, 102));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setBackground(new java.awt.Color(153, 255, 153));
        jbtnReset.setFont(new java.awt.Font("Marker Felt", 0, 28)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(51, 204, 0));
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 204, 102));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setBackground(new java.awt.Color(255, 102, 102));
        jbtnExit.setFont(new java.awt.Font("Marker Felt", 0, 28)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(153, 0, 0));
        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        
        choose_a_player();
        enableButtons();
        
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        
        jblPlayerX.setForeground(Color.WHITE);
        jblPlayerO.setForeground(Color.WHITE);
        
            
    }//GEN-LAST:event_jbtnResetActionPerformed

private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame();       
        if(JOptionPane.showConfirmDialog(frame, "Confermi di voler uscire? ", "Tris", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) 
            System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton1.setForeground(Color.BLACK);
        else jButton1.setForeground(Color.WHITE);
        choose_a_player();
        jButton1.setEnabled(false); 
        game_winning();            
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton2.setForeground(Color.BLACK);
        else jButton2.setForeground(Color.WHITE);
        choose_a_player(); 
        jButton2.setEnabled(false);
        game_winning();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton3.setForeground(Color.BLACK);
        else jButton3.setForeground(Color.WHITE);
        choose_a_player();
        jButton3.setEnabled(false);
        game_winning();      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton6.setForeground(Color.BLACK);
        else jButton6.setForeground(Color.WHITE);
        choose_a_player();
        jButton6.setEnabled(false);
        game_winning();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton7.setForeground(Color.BLACK);
        else jButton7.setForeground(Color.WHITE);
        choose_a_player();
        jButton7.setEnabled(false);
        game_winning();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton8.setForeground(Color.BLACK);
        else jButton8.setForeground(Color.WHITE);
        choose_a_player();
        jButton8.setEnabled(false);
        game_winning();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton11.setForeground(Color.BLACK);
        else jButton11.setForeground(Color.WHITE);
        choose_a_player();
        jButton11.setEnabled(false);
        game_winning();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jButton12.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton12.setForeground(Color.BLACK);
        else jButton12.setForeground(Color.WHITE);
        choose_a_player();
        jButton12.setEnabled(false);
        game_winning();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) jButton13.setForeground(Color.BLACK);
        else jButton13.setForeground(Color.WHITE);
        choose_a_player();
        jButton13.setEnabled(false);
        game_winning();
        
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grafica_tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafica_tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafica_tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafica_tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafica_tris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration//GEN-END:variables
}

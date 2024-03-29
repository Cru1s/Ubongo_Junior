
package Game;

public class StartFrame extends javax.swing.JFrame {
    private GameFrame gameFrame;
    private int numberOfPlayers;
    
    public StartFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JButton();
        NumOfPlayers = new javax.swing.JComboBox<>();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 80, 50));

        NumOfPlayers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Player", "2 Players", "3 Players", "4 Players" }));
        NumOfPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumOfPlayersActionPerformed(evt);
            }
        });
        getContentPane().add(NumOfPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 80, 50));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/UbongoTheme (2).png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        gameFrame = new GameFrame(numberOfPlayers);
        gameFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_StartButtonActionPerformed

    private void NumOfPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumOfPlayersActionPerformed
        // TODO add your handling code here:
         String selectedValue = (String) NumOfPlayers.getSelectedItem();
        // Extract the number of players
         numberOfPlayers = Integer.parseInt(selectedValue.split(" ")[0]);
    }//GEN-LAST:event_NumOfPlayersActionPerformed


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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> NumOfPlayers;
    private javax.swing.JButton StartButton;
    // End of variables declaration//GEN-END:variables
}

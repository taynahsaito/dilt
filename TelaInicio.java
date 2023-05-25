
package com.mycompany.diltproject;


public class TelaInicio extends javax.swing.JFrame {

    public TelaInicio() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(217, 217, 217));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 44)); // NOI18N
        jButton1.setText("ENTRE");
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 450, 340, 80);

        jButton2.setBackground(new java.awt.Color(217, 217, 217));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 44)); // NOI18N
        jButton2.setText("CADASTRE-SE");
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 550, 380, 90);

        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/diltproject/telaa (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 1480, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

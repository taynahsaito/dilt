/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.diltproject;

/**
 *
 * @author dani
 */
public class TelaPerguntasA extends javax.swing.JFrame {

    /**
     * Creates new form TelaPerguntasA
     */
    public TelaPerguntasA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jCheckBox1.setText("A indentação, dada pelo “tab”, organiza as funções auxiliando na visualização do que está incluso ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(200, 410, 1000, 31);

        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jCheckBox2.setText("O ponto e vírgula, colocado ao fim de cada comando fundamental para o funcionamento do código ");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(200, 330, 996, 31);

        jCheckBox3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jCheckBox3.setText("Dois pontos, delimitam o fim de diferentes estruturas como If/else, do/while etc.");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(200, 480, 790, 31);

        jCheckBox4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jCheckBox4.setText("As chaves, usadas para limitar os blocos e diferentes funções/métodos dentro do código  ");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(200, 370, 887, 31);

        jButton1.setBackground(new java.awt.Color(255, 221, 141));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jButton1.setText("ENVIAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 600, 200, 60);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("ou não  em uma função ou bloco de código");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 440, 760, 27);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setText("Esse mecanismo é: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 250, 760, 27);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("compilador o fim de cada função/comando no código");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 190, 760, 27);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("Entre eles aprendemos um mecanismo que serve como terminador e indica ao ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 160, 760, 27);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setText("otimizar o código para facilitar sua manutenção e garantir seu funcionamento.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 110, 760, 27);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setText("Quando estudamos a orientação a objetos aprendemos diferentes modos de");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 80, 750, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/diltproject/telaperguntasy.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 1400, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerguntasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntasA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

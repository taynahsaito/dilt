/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.diltproject;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        super("Login");
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JTextField();
        loginTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        SenhaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 430, 220, 18);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel2.setText("Nome de usuário ou email:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 340, 220, 18);
        getContentPane().add(senhaPasswordField);
        senhaPasswordField.setBounds(560, 450, 290, 60);

        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField);
        loginTextField.setBounds(560, 360, 290, 60);

        LoginButton.setBackground(new java.awt.Color(217, 217, 217));
        LoginButton.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        LoginButton.setText("ENTRAR");
        getContentPane().add(LoginButton);
        LoginButton.setBounds(530, 590, 350, 90);

        SenhaButton.setBackground(new java.awt.Color(179, 197, 209));
        SenhaButton.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        SenhaButton.setText("Esqueci minha senha");
        SenhaButton.setBorder(null);
        getContentPane().add(SenhaButton);
        SenhaButton.setBounds(560, 520, 130, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/diltproject/telalogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 1410, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        try{
            //1. Pegar o login digitado pelo usuário
            String login = loginTextField.getText();
            //2. Pegar a senha digitada pelo usuário
            String senha = new String(senhaPasswordField.getText()); //mudar para passwordfield
            //1. Construir um objeto do tipo Usuario
            var u = new Usuario(login, senha);
            //2. Construir um objeto do tipo UsuarioDAO
            var dao = new UsuarioDAO();
            //3. Usando o método existe do UsuarioDAO, verificar se o usuário existe
            //se for o caso, dar boas vindas, caso contrário, informar usuário/senha inválido
            if (dao.existe(u)){
                JOptionPane.showMessageDialog(null, "Bem vindo!");
                var dashboardTela = new DashboardTela();
                dashboardTela.setVisible(true);
                //descartar a tela atual
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário/senha inválido");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SenhaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}

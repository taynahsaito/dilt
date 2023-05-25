/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.diltproject;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class TelaCadastroProf extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProf
     */
    public TelaCadastroProf() {
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

        cadastrarButton = new javax.swing.JButton();
        confirmaSenhaTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        usuarioTextField = new javax.swing.JTextField();
        nomeCompletoTextField = new javax.swing.JTextField();
        professorCheckBox = new javax.swing.JCheckBox();
        alunoCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cadastrarButton.setBackground(new java.awt.Color(217, 217, 217));
        cadastrarButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        cadastrarButton.setText("CADASTRAR");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton);
        cadastrarButton.setBounds(560, 570, 300, 70);
        getContentPane().add(confirmaSenhaTextField);
        confirmaSenhaTextField.setBounds(590, 500, 250, 40);
        getContentPane().add(senhaTextField);
        senhaTextField.setBounds(590, 430, 250, 40);
        getContentPane().add(emailTextField);
        emailTextField.setBounds(590, 360, 250, 40);

        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTextField);
        usuarioTextField.setBounds(590, 290, 250, 40);
        getContentPane().add(nomeCompletoTextField);
        nomeCompletoTextField.setBounds(590, 220, 250, 40);

        professorCheckBox.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        professorCheckBox.setText("Professor");
        professorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(professorCheckBox);
        professorCheckBox.setBounds(710, 170, 90, 22);

        alunoCheckBox.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        alunoCheckBox.setText("Aluno");
        alunoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(alunoCheckBox);
        alunoCheckBox.setBounds(610, 170, 70, 22);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 15, 4));
        jLabel7.setText("Confirmar senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 480, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel6.setText("Nome de usuário:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 270, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel5.setText("Nome completo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 200, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 15, 4));
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 410, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel3.setText("E-mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 340, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel2.setText("Estou me cadastrando como:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 140, 230, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/diltproject/telacadastroo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1420, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alunoCheckBoxActionPerformed

    private void professorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorCheckBoxActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
         try{
            //1. Pegar o login digitado pelo usuário
            String usuario = usuarioTextField.setText();
            //2. Pegar a senha digitada pelo usuário
            String senha = new String(senhaTextField.setPassword());
            //1. Construir um objeto do tipo Usuario
            var u = new Usuario(usuario, senha);
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
    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alunoCheckBox;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField confirmaSenhaTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomeCompletoTextField;
    private javax.swing.JCheckBox professorCheckBox;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
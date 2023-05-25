package com.mycompany.diltproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiltProject {

    public static void main(String[] args) {
        
    }

public class TelaInicial extends JFrame {
    public TelaInicial() {
        super("Sistema de Cadastro e Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(2, 1));

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton loginButton = new JButton("Login");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastro();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaLogin();
            }
        });

        add(cadastrarButton);
        add(loginButton);

        setVisible(true);
    }

    private void abrirTelaCadastro() {
        dispose(); // Fecha a tela atual
    }

    private void abrirTelaLogin() {
        // Implemente a lógica para abrir a tela de login
    }

    public static void main(String[] args) {
    }
}
}

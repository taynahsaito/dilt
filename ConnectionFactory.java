
package com.mycompany.diltproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
     private static String host = "ep-sparkling-surf-947418.us-east-2.aws.neon.tech";
    private static String porta = "5432";
    private static String db = "neondb";
    private static String usuario = "taynahsaito";
    private static String senha = "rJ3yv1eOlPMF";
    
    public static Connection obterConexao() throws Exception{
        String s = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, porta, db
        );
        //cláusula catch or declare
        return DriverManager.getConnection(
            s, usuario, senha
        );
    }
    public static void main(String[] args) throws Exception {
        obterConexao();
    }
    
}

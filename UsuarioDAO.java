
package com.mycompany.diltproject;

public class UsuarioDAO {
    public boolean existe(Usuario u) throws Exception{
        //1. Especificar o comando SQL (SELECT)
        String sql = "SELECT nome, senha FROM tb_usuario WHERE nome = ? AND senha = ?";
        //2. Abrir uma conexão com o Banco
        //try-with-resources
        //3. Preparar o comando
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            //4. Substituir os eventuais placeholders
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
            //5. Executar o comando
            //try-with-resources
            try(var rs = ps.executeQuery()){
            //6. Manipular os dados resultantes
                return rs.next();
            }
        
        }
        //7. Fechar os recursos (try-with-resources já fez pra gente)
    }
}
    

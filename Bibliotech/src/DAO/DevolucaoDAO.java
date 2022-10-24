/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.DevolucaoMODEL;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DevolucaoDAO {
    
    Connection conn;
    PreparedStatement preparaConexao;
    
    public void pesquisarLivro(DevolucaoMODEL objdevolucaoM){
        String sql = "Select * from cad_livros where cod_livro=?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            preparaConexao = conn.prepareStatement(sql);
            preparaConexao.setInt(1, objdevolucaoM.getCod_livro());
            
            preparaConexao.execute();
            preparaConexao.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.EmprestimoMODEL;
import MODEL.LivrosMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmprestimoDAO {
    
    Connection conn;
    PreparedStatement preparaConexao;
    public void cadastrarEmprestimo(EmprestimoMODEL objemprestimoM, LivrosMODEL objlivrosM) {
        
        String sql = "insert into emprestimos (nome_cliente, cpf, telefone, rua, nCasa, bairro, "
                + "nome_livro, valor, data_emprestimo, data_devolucao) values (?,?,?,?,?,?,?,?,?,?)";
        
        String sql02 = "update cad_livros set status_livro = ? where nome_livro = ?";
       
        conn = new ConexaoDAO().conectaBD();
        
        try {
            preparaConexao = conn.prepareStatement(sql);
            preparaConexao.setString(1, objemprestimoM.getNome_cliente());
            preparaConexao.setInt(2, objemprestimoM.getCpf());
            preparaConexao.setInt(3, objemprestimoM.getTelefone());
            preparaConexao.setString(4, objemprestimoM.getEnd_rua());
            preparaConexao.setInt(5, objemprestimoM.getEnd_Ncasa());
            preparaConexao.setString(6, objemprestimoM.getEnd_bairro());
            preparaConexao.setString(7, objemprestimoM.getNome_livro());
            preparaConexao.setInt(8, objemprestimoM.getValor_livro());
            preparaConexao.setString(9, objemprestimoM.getData_emprestimo());
            preparaConexao.setString(10, objemprestimoM.getData_devolucao());
            
            preparaConexao.execute();
            preparaConexao.close();
            
            preparaConexao = conn.prepareStatement(sql02);
            preparaConexao.setString(1, objlivrosM.getStatus_livro());
            preparaConexao.setString(2, objemprestimoM.getNome_livro());
           
            preparaConexao.execute();
            preparaConexao.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO" + erro);
        }
        }
    
}

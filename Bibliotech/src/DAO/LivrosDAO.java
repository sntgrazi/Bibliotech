package DAO;

import MODEL.LivrosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dener
 */
public class LivrosDAO {
    
    Connection conn;
    PreparedStatement preparaConexao;
    ResultSet result;
    ArrayList<LivrosMODEL> lista = new ArrayList<>();
    public void cadastrarLivro(LivrosMODEL objlivrosM){
        
       String sql = "insert into cad_livros (nome_livro, editora, autor, categoria, "
               + "valor_livro, ano_lancamento, cod_livro) values (?,?,?,?,?,?,?)";
       
       conn =  new ConexaoDAO().conectaBD();
       
        try {
            preparaConexao = conn.prepareStatement(sql);
            preparaConexao.setString(1, objlivrosM.getNome_livro());
            preparaConexao.setString(2, objlivrosM.getEditora());
            preparaConexao.setString(3, objlivrosM.getAutor());
            preparaConexao.setString(4, objlivrosM.getCategoria());
            preparaConexao.setInt(5, objlivrosM.getValor_livro());
            preparaConexao.setInt(6, objlivrosM.getAno_lancamento());
            preparaConexao.setInt(7, objlivrosM.getCod_livro());
            
            preparaConexao.execute();
            preparaConexao.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"LivosDAO Cadastrar: " + erro);
        }
    }
    
    
    public ArrayList<LivrosMODEL> listarLivros(){
        String sql = "select * from cad_livros";
        conn =  new ConexaoDAO().conectaBD();
        
        try {
            preparaConexao = conn.prepareStatement(sql);
            result = preparaConexao.executeQuery();
            
            while (result.next()){
                LivrosMODEL objlivrosM = new LivrosMODEL();
                objlivrosM.setId_livros(result.getInt("id"));
                objlivrosM.setNome_livro(result.getString("nome_livro"));
                objlivrosM.setEditora(result.getString("editora"));
                objlivrosM.setAutor(result.getString("autor"));
                objlivrosM.setCategoria(result.getString("categoria"));
                objlivrosM.setStatus_livro(result.getString("status_livro"));
                objlivrosM.setValor_livro(result.getInt("valor_livro"));
                objlivrosM.setAno_lancamento(result.getInt("ano_lancamento"));
                objlivrosM.setCod_livro(result.getInt("cod_livro"));  
                
                lista.add(objlivrosM);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivrosDAO Pesquisar: " + erro);
        }
        
        return lista;
    }

    public void EditarLivro(LivrosMODEL objlivrosM) {
        String sql = "update cad_livros set nome_livro = ?, editora = ?, autor = ?,"
                + " categoria = ?, valor_livro = ?, ano_lancamento = ?, cod_livro = ? where id = ?";
        
         conn =  new ConexaoDAO().conectaBD();
       
        try {
            preparaConexao = conn.prepareStatement(sql);
            preparaConexao.setString(1, objlivrosM.getNome_livro());
            preparaConexao.setString(2, objlivrosM.getEditora());
            preparaConexao.setString(3, objlivrosM.getAutor());
            preparaConexao.setString(4, objlivrosM.getCategoria());
            preparaConexao.setInt(5, objlivrosM.getValor_livro());
            preparaConexao.setInt(6, objlivrosM.getAno_lancamento());
            preparaConexao.setInt(7, objlivrosM.getCod_livro());
            preparaConexao.setInt(8, objlivrosM.getId_livros());
            
            preparaConexao.execute();
            preparaConexao.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"LivosDAO EditarLivro: " + erro);
        }
    }
    
    public void ExcluirLivro(LivrosMODEL objlivrosM){
        String sql = "delete from cad_livros where id = ?";
        
        conn =  new ConexaoDAO().conectaBD();
       
        try {
            preparaConexao = conn.prepareStatement(sql);
            preparaConexao.setInt(1, objlivrosM.getId_livros());
            
            preparaConexao.execute();
            preparaConexao.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"LivosDAO ExcluirLivro: " + erro);
        }
    }
}

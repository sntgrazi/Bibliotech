/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Dener
 */
public class LivrosMODEL {
    String nome_livro, editora, autor, categoria, status_livro;
    int  ano_lancamento, cod_livro,valor_livro, id_livros;

    public int getId_livros() {
        return id_livros;
    }

    public void setId_livros(int id_livros) {
        this.id_livros = id_livros;
    }
    
    public String getStatus_livro() {
        return status_livro;
    }

    public void setStatus_livro(String status_livro) {
        this.status_livro = status_livro;
    }
    

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getValor_livro() {
        return valor_livro;
    }

    public void setValor_livro(int valor_livro) {
        this.valor_livro = valor_livro;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia_semdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PTOLEDO
 */
public class Produto {

    private int id;
    private String descricao;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrar() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produto(descricao, preco) values(?,?)");
        comando.setString(1, descricao);
        comando.setDouble(2, preco);
        comando.execute();
        con.close();
    }

    public void deletar() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("delete from produtos where id=?");
        comando.setInt(1, id);
        comando.execute();
        con.close();
    }

    public void atualizar() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("update produtos set descricao = ?, preco = ? where id = ?");
        comando.setString(1, descricao);
        comando.setDouble(2, preco);
        comando.setInt(3, id);
        comando.execute();
        con.close();
    }

    public Produto consultarById() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos where id = ?");
        comando.setInt(1, id);
        ResultSet resultado = comando.executeQuery();
        Produto prod = new Produto();
        if (resultado.next()) {
            prod.setId(resultado.getInt("id"));
            prod.setDescricao(resultado.getString("descricao"));
            prod.setPreco(resultado.getDouble("preco"));
        }
        con.close();
        return prod;
    }

    public List<Produto> consultarTodos() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos");
        ResultSet resultado = comando.executeQuery();
        
        List<Produto> listaprodutos = new ArrayList<Produto>();
        
        while(resultado.next()){
            Produto prod = new Produto();
            prod.setId(resultado.getInt("id"));
            prod.setDescricao(resultado.getString("descricao"));
            prod.setPreco(resultado.getDouble("preco"));
            listaprodutos.add(prod);
        }        
        con.close();
        return listaprodutos;
    }

    public Connection getConexao() {
        try {
            // O método forName carrega e inicia o driver passado por parâmetro
            Class.forName("com.mysql.cj.jdbc.Driver"); //verificar em seu computador
            // Estabelecendo a conexão
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_ioo", "root", "");
        } catch (ClassNotFoundException | SQLException ex) { // Tratamento de Exceções
            System.out.println(ex);
            return null;
        }
    }

}

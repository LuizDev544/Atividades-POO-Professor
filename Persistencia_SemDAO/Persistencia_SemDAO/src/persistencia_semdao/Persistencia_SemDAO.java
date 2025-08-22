/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia_semdao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PTOLEDO
 */
public class Persistencia_SemDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p = new Produto();
        p.setDescricao("Monitor 43");
        p.setPreco(1700);
        try {
            p.cadastrar();
            System.out.println("Cadastrado com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        p.setId(4);
        
        try{
            p.deletar();
            System.out.println("Deletado com sucesso.");
        }
        catch(SQLException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        catch(ClassNotFoundException ex){
            System.out.println("Erro: " + ex.getMessage());
        }

        p.setId(6);
        p.setDescricao("Monitor 50");
        p.setPreco(3000);     
        try {
            p.atualizar();
            System.out.println("Atualizado com sucesso.");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        p.setId(3);

        try {
            p = p.consultarById();
            if (p.getDescricao() != null){
                System.out.println("ID.........: " + p.getId());
                System.out.println("Descrição..: " + p.getDescricao());
                System.out.println("Preço......: " + p.getPreco());
            }
            else{
                System.out.println("ID não enontrado.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        try {
            List<Produto> lprod = p.consultarTodos();
            for (Produto prod : lprod) {
                System.out.println("\nID.........: " + prod.getId());
                System.out.println("Descrição..: " + prod.getDescricao());
                System.out.println("Preço......: " + prod.getPreco());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

}

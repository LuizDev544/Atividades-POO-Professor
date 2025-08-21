package Setor; // Define o pacote ao qual essa classe pertence

/**
 * Classe Funcionario
 * Representa um funcionário e suas caracteristicas
 * Autor: Luiz
 */
public class Funcionario {
    
    // Atributo que guarda o nome , cpf e endereço de 1 funcionário.
    private String CPF;
    private String Nome;
    private String Endereco;


    // Método "getter" para obter o CPF
    public String getCPF() {
        return CPF;
    }

    // Método "setter" para alterar/definir o valor do CPF
    public void setNome(String cpf) {
        this.CPF = cpf;
    }

    // Método "getter" para obter o nome.
    public String getNumero() {
        return Nome;
    }

    // Método "setter" para alterar/definir o nome
    public void setNumero(String nome) {
        this.Nome = nome;
    }

    // Método "getter" para obter o Enreço
    public String getEndereco() {
        return Endereco;
    }

    // Método "setter" para alterar/definir o enreço
    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    
}

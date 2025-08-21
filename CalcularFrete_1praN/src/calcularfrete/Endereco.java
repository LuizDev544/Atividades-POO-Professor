/*
 * Esse cabeçalho é gerado automaticamente pela IDE (NetBeans).
 * Ele indica onde estão os templates de licença e classes padrão.
 */
package calcularfrete; // Define o pacote ao qual essa classe pertence

/**
 * Classe Endereco
 * Representa um endereço com logradouro (rua, avenida, etc.) e número.
 * Autor: PTOLEDO
 */
public class Endereco {
    
    // Atributo que guarda o nome da rua, avenida, etc.
    private String logradouro;
    
    // Atributo que guarda o número do endereço
    private String numero;

    // Método "getter" para obter o valor de logradouro
    public String getLogradouro() {
        return logradouro;
    }

    // Método "setter" para alterar/definir o valor de logradouro
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    // Método "getter" para obter o valor de numero
    public String getNumero() {
        return numero;
    }

    // Método "setter" para alterar/definir o valor de numero
    public void setNumero(String numero) {
        this.numero = numero;
    }
}

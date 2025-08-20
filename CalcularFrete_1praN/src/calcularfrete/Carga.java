/*
 * Esse cabeçalho é gerado automaticamente pela IDE (NetBeans).
 * Ele mostra os templates padrão usados para criar a classe.
 */
package calcularfrete;

/**
 * Classe Carga
 * Representa uma carga que será transportada em um frete,
 * contendo uma descrição e sua massa (peso).
 * Autor: PTOLEDO
 */
public class Carga {
    
    // Descrição da carga (ex: "Pizza Muzzarela", "Pacote Combo 1")
    private String descricao;
    
    // Massa da carga (peso em alguma unidade, ex: kg)
    private double massa;

    // Getter para obter a descrição da carga
    public String getDescricao() {
        return descricao;
    }

    // Setter para definir/alterar a descrição da carga
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para obter a massa da carga
    public double getMassa() {
        return massa;
    }

    // Setter para definir/alterar a massa da carga
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
}

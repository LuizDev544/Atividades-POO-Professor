package calcularfrete;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Frete
 * Representa um frete contendo endereço de retirada, de entrega,
 * lista de cargas, distância, valor e observações.
 */
public class Frete {
    
    // Endereço de retirada do frete
    private Endereco endretirada;

    // Endereço de entrega do frete
    private Endereco endentrega;

    // Lista de cargas que fazem parte do frete
    private List<Carga> listcarga = new ArrayList<>();

    // Valor total do frete (calculado depois)
    private double valor;

    // Observação adicional sobre o frete
    private String observacao;

    // Distância do frete (ex: em km)
    private double distancia;

    // Setter para sobrescrever a lista de cargas inteira
    public void setListCarga(List<Carga> listcarga){
        this.listcarga = listcarga;
    }
    
    // Getter para obter a lista de cargas
    public List<Carga> getListCarga(){
        return listcarga;
    }
    
    // Adiciona uma carga à lista
    public void addListCarga(Carga carga){
        listcarga.add(carga);
    }

    // Remove uma carga da lista
    public void removeListaCarga(Carga carga){
        listcarga.remove(carga);
    }
    
    // Exibe no console todas as cargas do frete
    public void exibirListCarga(){   
        for(Carga c : listcarga){
            System.out.println("\nDescricao...: " + c.getDescricao());
            System.out.println("Massa...: " + c.getMassa());
        }        
    }
    
    // Getter e Setter para endereço de retirada
    public Endereco getEndretirada() {
        return endretirada;
    }
    public void setEndretirada(Endereco endretirada) {
        this.endretirada = endretirada;
    }

    // Getter e Setter para endereço de entrega
    public Endereco getEndentrega() {
        return endentrega;
    }
    public void setEndentrega(Endereco endentrega) {
        this.endentrega = endentrega;
    }

    // Getter e Setter para observação
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    // Getter e Setter para distância
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Getter para o valor do frete
    public double getValor() {
        return valor;
    }
    
    /**
     * Método responsável por calcular o valor do frete
     * O cálculo é feito multiplicando a distância pela soma das massas das cargas
     * Fórmula: valor = distância * (massa total)
     */
    public void calcularValorFrete(){
        double s = 0;
        // Soma a massa de todas as cargas
        for(Carga c : listcarga){
            s += c.getMassa();
        }
        // Valor final = distância * soma das massas
        valor = distancia * s;
    }  
}

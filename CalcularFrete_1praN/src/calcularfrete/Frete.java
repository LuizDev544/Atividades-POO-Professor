/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularfrete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PTOLEDO
 */
public class Frete {
    
    private Endereco endretirada;
    private Endereco endentrega;
    private List<Carga> listcarga = new ArrayList<Carga>();
    private double valor;
    private String observacao;
    private double distancia;

    public void setListCarga(List<Carga> listcarga){
        this.listcarga = listcarga;
    }
    
    public List<Carga> getListCarga(){
        return listcarga;
    }
    
    public void addListCarga(Carga carga){
        listcarga.add(carga);
    }
    
    public void exibirListCarga(){   
        for(Carga c : listcarga){
            System.out.println("\nDescricao...: " + c.getDescricao());
            System.out.println("Massa...: " + c.getMassa());
        }        
    }
    
    public Endereco getEndretirada() {
        return endretirada;
    }

    public void setEndretirada(Endereco endretirada) {
        this.endretirada = endretirada;
    }

    public Endereco getEndentrega() {
        return endentrega;
    }

    public void setEndentrega(Endereco endentrega) {
        this.endentrega = endentrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValor() {
        return valor;
    }
    
    public void calcularValorFrete(){
        double s = 0;
        for(Carga c : listcarga){
            s += c.getMassa();
        }
        valor = distancia * s;
    }  
}

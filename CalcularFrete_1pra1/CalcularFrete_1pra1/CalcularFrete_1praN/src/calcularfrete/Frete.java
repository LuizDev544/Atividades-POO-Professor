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
    
    private Endereco endentrega;
    private List<Pacote> listaDePacote = new ArrayList<Pacote>();
    private double valor;
    private String observacao;
    private double distancia;

    public void setListPacote(List<Pacote>  listaDePacote){
        this. listaDePacote =  listaDePacote;
    }
    
    
    public List<Pacote> getListPacote(){
        return listaDePacote;
    }
    
    public void addListPacote(Pacote Pacote){
         listaDePacote.add(Pacote);
    }
    
    public void exibirListPacote(){   
        for(Pacote c :  listaDePacote){
            System.out.println("\nDescricao do id...: " + c.getId());
            System.out.println("rota de entrega...: " + c.getEndentrega());
        }        
    }
    
    public Endereco getEndereco() {
        return endentrega;
    }

    public void setEndereco(Endereco endentrega) {
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
        double sp = 0;
        double tf = 0;
        for(Pacote p : listaDePacote ){
            sp = 0;
            for(Carga c : p.getListaDeCarga()){
                sp += c.getMassa();
            }
            tf += sp;
        }
        valor = distancia * tf;
    }  
}

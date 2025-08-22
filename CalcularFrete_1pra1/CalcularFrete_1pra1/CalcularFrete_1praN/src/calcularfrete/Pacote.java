/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularfrete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunocmc
 */
public class Pacote {
    private int id;
    private List<Carga> listaDeCarga = new ArrayList<Carga>();
    private Endereco endentrega;

    public boolean removeListCarga(Carga Carga){
        listaDeCarga.remove(Carga);
        return true;
    }
    public void addListCarga(Carga Carga){
        listaDeCarga.add(Carga);
    }
    
    public void exibirListCarga(){   
        for(Carga c :  listaDeCarga){
            System.out.println("\nDescricao...: " + c.getDescricao());
            System.out.println("Massa...: " + c.getMassa());
        }        
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setListaDeCarga(List<Carga> listaDeCarga) {
        this.listaDeCarga = listaDeCarga;
    }

    public void setEndentrega(Endereco endentrega) {
        this.endentrega = endentrega;
    }

    public int getId() {
        return id;
    }
    public List<Carga> getListaDeCarga() {
        return listaDeCarga;
    }

    public Endereco getEndentrega() {
        return endentrega;
    }
    
    
}

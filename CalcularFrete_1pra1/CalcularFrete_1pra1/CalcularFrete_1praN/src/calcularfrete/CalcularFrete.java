/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularfrete;

/**
 *
 * @author Luiz
 */
public class CalcularFrete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Endereco er_entrega = new Endereco();
        er_entrega.setLogradouro("Roberta");
        er_entrega.setNumero("30");
        
        Carga c1 = new Carga();
        c1.setDescricao("Pacote Pizza Combo 1");
        c1.setMassa(5);
        
        Carga c2 = new Carga();
        c2.setDescricao("Pacote Esfirra Combo 1");
        c2.setMassa(10);
        
        Carga c3 = new Carga();
        c3.setDescricao("Pizza Muzzarela");
        c3.setMassa(1);
        
        Carga c4 = new Carga();
        c4.setDescricao("X-Salada");
        c4.setMassa(2);
        
        Endereco ee = new Endereco();
        ee.setLogradouro("Rua Sem Destino");
        ee.setNumero("100");
        
        Pacote p1 = new Pacote();
        p1.setEndentrega(ee);
        p1.setId(1);
        p1.addListCarga(c1);
        p1.addListCarga(c2);
        
        Pacote p2 = new Pacote();
        p2.setEndentrega(er_entrega);
        p2.setId(2);
        p2.addListCarga(c3);
        p2.addListCarga(c4);
       
        Frete f1 = new Frete();
        f1.addListPacote(p1);
        
        Frete f2 = new Frete();
        f2.addListPacote(p2);
        
        
        f1.exibirListPacote();
        p1.exibirListCarga();
        
        f2.exibirListPacote();
        p2.exibirListCarga();
        
    }
    
}

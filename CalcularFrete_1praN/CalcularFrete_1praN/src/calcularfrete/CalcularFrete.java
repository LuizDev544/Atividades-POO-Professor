/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularfrete;

/**
 *
 * @author PTOLEDO
 */
public class CalcularFrete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
        
        Carga c5 = new Carga();
        c5.setDescricao("Pastel Super Queijo");
        c5.setMassa(3);
        
        Endereco er = new Endereco();
        er.setLogradouro("Rua Sem Nome");
        er.setNumero("20");
        
        Endereco ee = new Endereco();
        ee.setLogradouro("Rua Sem Destino");
        ee.setNumero("100");
        
        
        Frete f = new Frete();
        f.setEndretirada(er);
        f.setEndentrega(ee);
        f.addListCarga(c1);
        f.addListCarga(c2);
        f.addListCarga(c3);
        f.addListCarga(c4);
        f.addListCarga(c5);
        f.setObservacao("Próximo da curva reta");
        f.setDistancia(10);
        
        f.calcularValorFrete();
        
        f.exibirListCarga();
        
        
        System.out.println("\n\nValor Frete: " + f.getValor()); 



    }
    
}

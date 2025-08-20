/*
 * Esse cabeçalho é gerado automaticamente pela IDE (NetBeans).
 * Ele mostra os templates padrão usados para criar a classe.
 */
package calcularfrete; // Define que esta classe está dentro do pacote "calcularfrete"

/**
 * Classe principal do programa CalcularFrete
 * Aqui fica o método main, responsável por executar a aplicação.
 * Autor: Luiz
 */
public class CalcularFrete {

    /**
     * Método main - ponto de entrada da aplicação
     * @param args argumentos de linha de comando (não usados aqui)
     */
    public static void main(String[] args) {
        // Criação de diferentes cargas (objetos do tipo Carga)
        
        Carga c1 = new Carga(); // Nova carga
        c1.setDescricao("Pacote Pizza Combo 1"); // Descrição da carga
        c1.setMassa(5); // Peso em alguma unidade (ex: kg)

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

        // Criação de endereços de retirada e entrega
        Endereco er = new Endereco();
        er.setLogradouro("Rua Sem Nome");
        er.setNumero("20");

        Endereco ee = new Endereco();
        ee.setLogradouro("Rua Sem Destino");
        ee.setNumero("100");

        // Criação do frete
        Frete f = new Frete();
        f.setEndretirada(er); // Define o endereço de retirada
        f.setEndentrega(ee); // Define o endereço de entrega

        // Adiciona cargas na lista do frete
        f.addListCarga(c1);
        f.addListCarga(c2);
        f.addListCarga(c3);
        f.addListCarga(c4);
        f.addListCarga(c5);

        // Remove uma carga da lista
        f.removeListaCarga(c5);

        // Define observações adicionais sobre o frete
        f.setObservacao("Próximo da curva reta");

        // Define a distância do frete (ex: em km)
        f.setDistancia(10);

        // Calcula o valor total do frete
        f.calcularValorFrete();

        // Exibe todas as cargas que estão no frete
        f.exibirListCarga();

        // Exibe no console o valor do frete calculado
        System.out.println("\n\nValor Frete: " + f.getValor()); 
    }
    
}

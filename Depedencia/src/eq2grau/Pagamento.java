/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eq2grau;

/**
 *
 * @author alunocmc
 */
public class Pagamento {

    public void efetuarPagamento(Pedido pedido) {
        pedido.calcularTotal();
}

    public static void main(String[] args) {
        Pedido pedido = new Pedido(50.0, 3);
        Pagamento pagamento = new Pagamento();

        pagamento.efetuarPagamento(pedido);
    }

}
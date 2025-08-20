/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eq2grau;

/**
 *
 * @author Luiz
 */

public class Pedido {
    private double precoUnitario;
    private int quantidade;

    public Pedido(double precoUnitario, int quantidade) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Método para calcular o total do pedido
    public void calcularTotal() {
        double total = precoUnitario * quantidade;
        System.out.println("Total do pedido: R$ " + total);
    }
}

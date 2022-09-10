package exercicios_easy;

import javax.swing.*;

// Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a.
// Ao final de 10 anos, exibir o valor
// investido, valor dos juros e o total com juros. Considerando que a
// remuneração será no regime de juros simples.
public class Exec10_1 {
    public static void main(String[] args) {
        double invest, i=1, taxa=0.05, valorJuros=0;
        invest = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        while (i<=10) {
            valorJuros = invest*taxa+valorJuros;
            i = i+1;
        }
        System.out.println("Valor investido: " +invest);
        System.out.println("Valor dos juros: "+valorJuros);
        System.out.println("Total com juros: "+(invest + valorJuros));
    }
}

package exercicios_easy;

import javax.swing.*;

// Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela
public class Exec7 {
    public double valorInss(double sal){
        double inss = sal * 0.075;
        if (sal <= 1045) {

        "O valor a ser pago é: %.2f"+inss;
        }

        }
    }
}
//        double sal, inss;
//        sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
//        inss = sal * 0.075;
//        if (sal <= 1045) {
//
//        System.out.printf("O valor a ser pago é: %.2f", inss);
//        }
//        inss = sal * 0.09;
//        if (sal >= 1045.01) {
//        if( sal <= 2089.60)
//        System.out.printf("O valor a ser pago é: %.2f" + inss);
//        }
//        inss = sal * 0.12;
//        if (sal >= 2089.61) {
//        if( sal <= 3134.40)
//        System.out.println("O valor a ser pago é %.2f: " + inss);
//        }
//        inss = sal * 0.14;
//        if (sal >= 3134.41) {
//        System.out.println("O valor a ser pago é %.2f: " + inss);
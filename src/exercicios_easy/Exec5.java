package exercicios_easy;

import javax.swing.*;

// Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//digitados.
public class Exec5 {
    public static void main(String[] args) {
        int x, y, z, soma, sub, mult, media;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        soma = x + y + z;
        System.out.println("a soma é: "+ soma);
        mult = x * y * z;
        System.out.println("a multiplicação é: "+ mult);
        media = (x + y + z)/3;
        System.out.println("a média é: "+ media);
    }
}

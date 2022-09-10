package exercicios_easy;

import javax.swing.*;

//Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
//variável, calcular o dobro, e exibir.
public class Exec4 {
    public static void main(String[] args) {
        int num1;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        System.out.println("O dobro do valor é: " + num1*2);
    }
}

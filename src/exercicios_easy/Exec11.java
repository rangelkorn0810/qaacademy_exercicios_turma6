package exercicios_easy;

import javax.swing.*;

// Faça um algoritmo para ler um número inteiro, somar 2 ao número
//digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
//completar 100 iterações
public class Exec11 {
    public static void main(String[] args) {
        int num=0, i=1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        while (i<=100){
            num = num + 2;
            System.out.println("A soma é: "+ num);
            i = i + 1;
        }
    }
}

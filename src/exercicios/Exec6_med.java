package exercicios;

import javax.swing.*;

// Faça um algoritmo para ler um número inteiro, calcular e exibir o
//Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) =
//3.628.800
public class Exec6_med {
    public static void main(String[] args) {
        int fatorial, i=10;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("digite o valor: "));
        while (i>1){
            fatorial = fatorial*(i-1);
            i--;
            System.out.println("O fatorial é: "+fatorial);
        }
    }
}

package exercicios;

import javax.swing.*;

// Faça um algoritmo para ler um número inteiro, calcular e exibir o
//Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) =
//3.628.800
public class Exec6_med {
    public void exibirFatorial(int fatorial) {
        int i=10;
         while (i>1){
            fatorial = fatorial*(i-1);
            i--;
            System.out.println("O fatorial é: "+fatorial);
        }
    }
}

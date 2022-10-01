package exercicios;

import javax.swing.*;

// Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
//números digitados, é o menor.
public class Exec5_med {
    public void exibirOmenor(int num1, int num2, int num3, int num4, int num5) {
        int menor = 0;

        if (num1 > menor) {
            menor = num1;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }
        if (num5 < menor) {
            menor = num5;
        }
        System.out.println("o menó é: " + menor);


    }

}

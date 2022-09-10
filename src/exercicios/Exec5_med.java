package exercicios;

import javax.swing.*;

// Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
//números digitados, é o menor.
public class Exec5_med {
    public static void main(String[] args) {
        int num1=0, menor=0;
        for (int i=0; i<5; i++){
            num1= Integer.parseInt(JOptionPane.showInputDialog("digite o valor"));
            System.out.println(num1);
            if (num1<menor || i==0){
                menor = num1;
            }
        }
        System.out.println("o menó é: "+menor);
    }
}
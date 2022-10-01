package exercicios_easy;

import javax.swing.*;

//Faça um algoritmo para ler um número inteiro entre: 1 e 10, calcular e exibir a
// tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
public class Exec9 {
    public static void main(String[] args) {
        int entrada, i=0;
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        while (i<=10) {
            //usar return no lugar de sout
            System.out.println("A taboada é: "+entrada+"x"+i + "= "+entrada * i);
            i=i+1;
        }
    }
}

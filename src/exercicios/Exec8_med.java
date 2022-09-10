package exercicios;

import javax.swing.*;

// Faça um algoritmo para exibir todos os meses digitados
//anteriormente.
public class Exec8_med {
    public static void main(String[] args) {
        String mes [] = new String[12];
        for (int i=0; i<=11; i++) {
        mes[i] = JOptionPane.showInputDialog("mes");
            System.out.println("o mês é: "+mes[i]);
        }
    }
}

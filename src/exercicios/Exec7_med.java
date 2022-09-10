package exercicios;
// Faça um algoritmo para ler todos os meses do ano, armazene em um
//vetor
import javax.swing.*;

public class Exec7_med {
    public static void main(String[] args) {
        String mes [] = new String[12];
        for (int i=0; i<=11; i++) {
            mes[i] = JOptionPane.showInputDialog("mes: ");
        }
    }
}

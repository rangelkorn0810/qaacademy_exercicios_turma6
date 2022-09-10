package exercicios;

import javax.swing.*;

public class Exec8_1_med {
    public static void main(String[] args) {
        String meses [] = new String [12];
        int i;
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
        i= Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        System.out.println("o mês é: "+meses[i-1]);
    }
}

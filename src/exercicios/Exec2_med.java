package exercicios;
// Faça um algoritmo para ler um valor de investimento, com uma taxa
//de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//o total. Considerando que a remuneração será no regime de juros compostos.
import javax.swing.*;

public class Exec2_med {
    public static void main(String[] args) {
        double valorInv=0, taxajuros=0.05, valorJuros=0, valorTotal=0;
        int i=1;
        valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de investimento"));
        while (i<=10){
           valorJuros = ((valorJuros + valorInv)*taxajuros)+valorJuros;
           i++;
        }
        valorTotal = valorInv+valorJuros;
        System.out.println("valor investido "+valorInv);
        System.out.println("valor juros "+valorJuros);
        System.out.println("valor total "+valorTotal);
    }
}

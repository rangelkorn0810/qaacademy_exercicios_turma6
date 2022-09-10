package exercicios_easy;

import javax.swing.*;

// Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.
public class Exec6 {
    public static void main(String[] args) {
        int n1, n2, media;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
        media = (n1+n2)/2;
        if (media<5) {
            System.out.println("Reprovado");
        }
        if (media>5) {
            System.out.println("Aprovado");
        }
        if (media == 5) {
            System.out.println("Exame");
        }
    }
}

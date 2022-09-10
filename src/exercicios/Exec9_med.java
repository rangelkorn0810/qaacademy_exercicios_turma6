package exercicios;

import javax.swing.*;
import java.util.ArrayList;

// Faça um algoritmo para:
//Criar dois vetores.
//Em um vetor: ler e armazenar o nomes de alunos.
//No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a
//ordem inserida no vetor de nomes.
//E exiba, o Nome e o número correspondente de cada um.
public class Exec9_med {
    public static void main(String[] args) {
        String nome [] = new String[2];
        String numero [] = new String[2];
        for (int i=0; i<=1; i++) {
            nome[i] = JOptionPane.showInputDialog("nome");
            numero[i] = JOptionPane.showInputDialog("numero");
 //           System.out.println("O nome do aluno é: " + nome[i]);
 //           System.out.println("O número do aluno é: " + numero[i]);
        }
        for (int i=0; i<=1; i++) {
            System.out.println("O nome do aluno é: " + nome[i]);
            System.out.println("O número do aluno é: " + numero[i]);
        }
//        for (String nm : nome){
//            System.out.println(nm);
//        }
//        for (String num : numero){
//            System.out.println(num);

    }
}

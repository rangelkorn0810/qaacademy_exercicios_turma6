package exercicios_easy;

import javax.swing.*;
import java.sql.SQLOutput;

//Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
//exibir os valores das variáveis, trocados.
public class Exec3 {
    public static void main(String[] args) {
        String nome, sobreNome, auxiliar;
        nome = JOptionPane.showInputDialog("Digite o nome");
        sobreNome = JOptionPane.showInputDialog("digite o sobrenome");
        auxiliar = nome;
        nome = sobreNome;
        sobreNome = auxiliar;
        System.out.println("O nome é: " +nome+" "+sobreNome);
    }
}

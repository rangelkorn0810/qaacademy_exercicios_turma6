package exercicios_easy;

import javax.swing.*;
import java.sql.SQLOutput;

//Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
//exibir os valores das variáveis, trocados.
public class Exec3 {
    public String nomesTrocados(String nome, String sobreNome){
        String auxiliar = nome;
        nome = sobreNome;
        sobreNome = auxiliar;
        return "O nome é: " +nome+" "+sobreNome;
    }
}

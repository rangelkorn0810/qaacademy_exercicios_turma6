package exercicios_easy;

import javax.swing.*;

// Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//digitados.
public class Exec5 {
    public int calcularSoma(int x, int y, int z) {
        int soma = x + y + z;
        return soma;
    }
    public int calcularSub(int x, int y, int z){
        int sub = x - y - z;
        return sub;
    }
    public int calcularMult(int x, int y, int z){
        int mult = x * y * z;
        return mult;
    }
    public int calcularMedia(int x, int y, int z){
        int media = (x + y + z)/3;
        return media;
    }
}
//        soma = x + y + z;
//        System.out.println("a soma é: "+ soma);
//        mult = x * y * z;
//        System.out.println("a multiplicação é: "+ mult);
//        media = (x + y + z)/3;
//        System.out.println("a média é: "+ media);
package exercicios_easy;

import javax.swing.*;
import java.sql.SQLOutput;

// Faça um algoritmo para ler um valor de salário,
// calcular e exibir o valor do salário bruto, valor
// do salário líquido e o valor do imposto de renda. Respeitando a tabela
public class Exec8 {
    public double salarioComIr(int sal){
        double ir = (sal );
        if (sal <= 1903.98) {
        }
        return ir;
    }
    public double salarioComIr2(int sal) {
        double ir = (sal * 0.075) - 142.8;
        if (sal >= 1903.99 & sal <= 2826.65) {
//            if (sal <= 2826.65) {
            }
        return ir;
        }

    public double salarioComIr3(int sal) {
        double ir = (sal * 0.15) - 354.8;
        if (sal >= 2826.66) {
            if (sal <= 3751.05) {
            }
        }
        return ir;
    }

}

//        int sal;
//        double ir;
//        sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
//        ir = (sal * 0)-0;
//        if (sal <= 1903.98) {
//        System.out.println("O valor bruto é: "+sal);
//        System.out.println("O IR é: Isento");
//        System.out.println("O salário liquido é: "+sal);
//        }
//        ir = (sal * 0.075)-142.8;
//        if (sal >=1903.99){
//        if (sal <= 2826.65) {
//        System.out.println("O valor bruto é: " + sal);
//        System.out.println("O IR é: " + ir);
//        System.out.println("O salário liquido é: " + (sal - ir));
//        }
//        }
//        ir = (sal * 0.15)-354.8;
//        if (sal >=2826.66) {
//        if (sal <= 3751.05) {
//        System.out.println("O valor bruto é: " + sal);
//        System.out.println("O IR é: " + ir);
//        System.out.println("O salário liquido é: " + (sal - ir));
//        }
//        }
//        ir = (sal * 0.225)-636.13;
//        if (sal >=3751.06) {
//        if (sal <= 4664.68) {
//        System.out.println("O valor bruto é: " + sal);
//        System.out.println("O IR é: " + ir);
//        System.out.println("O salário liquido é: " + (sal - ir));
//        }
//        }
//        ir = (sal * 0.275)-869.36;
//        if (sal > 4664.68) {
//        System.out.println("O valor bruto é: " + sal);
//        System.out.println("O IR é: " + ir);
//        System.out.println("O salário liquido é: " + (sal - ir));
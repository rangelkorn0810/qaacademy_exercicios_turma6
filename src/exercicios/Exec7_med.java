package exercicios;
// Faça um algoritmo para ler todos os meses do ano, armazene em um
//vetor
import javax.swing.*;

public class Exec7_med {
    public void exibirMes() {
        String vet [] = new String[12];
        vet[0] = "Janeiro";
        vet[1] = "Fevereiro";
        vet[2] = "Marco";
        vet[3] = "Abrir";
        vet[4] = "Maio";
        vet[5] = "Junho";
        vet[6] = "Julho";
        vet[7] = "Agosto";
        vet[8] = "Setembro";
        vet[9] = "Outubro";
        vet[10] = "Novembro";
        vet[11] = "Dezembro";
        for (int i=0; i<=11; i++) {

            System.out.println(vet[i]);

        }
    }
}

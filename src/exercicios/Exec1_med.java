package exercicios;
// Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
//números Pares e ímpares.
public class Exec1_med {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            if(i%2==0){
                System.out.println("São pares: "+i);
            }else{
                System.out.println("São impares: "+i);
            }
        }

    }
}

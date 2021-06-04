// Algoritmo que informa a média aritmética de 4 notas informada pelo aluno.

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        
        double n1, n2, n3, n4, media;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor da primeira nota: ");
        n1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        n3 = entrada.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        n4 = entrada.nextDouble();
        
        media = (n1+n2+n3+n4) / 4;
        
        System.out.println("As notas foram: " +n1+ " , " +n2+ " , " +n3+ " , " +n4+ 
        " respectivamente e a média entre elas foi: " +media);
    }
}

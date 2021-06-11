//Programa que informa a média de idade entre duas pessoas.

import java.util.Scanner;

public class App

{
    public static void main(String[] args) {
        
        int idade1, idade2, media;
        String nome1, nome2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = entrada.nextLine();
        
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = entrada.nextLine();
        
        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = entrada.nextInt();
        
        System.out.print("Digite a idade da segunda pessoa:");
        idade2 = entrada.nextInt();
        
        media = (idade1 + idade2) / 2;
        
        System.out.println("O primeiro nome é " +nome1+ " e sua idade é " +idade1+ " anos. O segundo nome é " +nome2+ 
        " e sua idade é " +idade2+ " anos. A média entre " +nome1+
        " e " +nome2+ " é " +media);
    }
}

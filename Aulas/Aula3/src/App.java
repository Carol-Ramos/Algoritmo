//Interagindo com o usuário, importando bibliotecas.

import java.util.Scanner;

/// Calculando a área do retângulo

public class App
{
    public static void main(String[] args) {
        
        int base, altura, area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do retângulo: ");
        base=entrada.nextInt();
        
        System.out.println("");
        
        System.out.println("Digite o valor da altura do retângulo: ");
        altura=entrada.nextInt();
        
        area = base * altura;
        
        System.out.println("O valor da área do retângulo é: " +area);
    }
}

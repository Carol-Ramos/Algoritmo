// Escreva um programa em que o usuárioi informe dois números quaisquer e o programa informará qual é o maior
// e o menor número e qual o quadrado de cada um deles.

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Digite o primeiro valor: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        n2 = entrada.nextInt();
        
        if (n1 > n2) {
            System.out.print(n1+ " É maior que " +n2+ " e seu quadrado é " +n1*n1+ ". Enquanto que o quadrado de "
            +n2+ " é " +n2*n2+ ".");
                    }
            else {
                System.out.print(n2+ " É maior que " +n1+ " e seu quadrado é " +n2*n2+ ". Enquanto que o quadrado de "
                +n1+ " é " +n1*n1+ ".");
            }

    
    }
}
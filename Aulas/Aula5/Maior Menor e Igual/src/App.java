// O usuário digita dois números e o programa diz qual é o maior e qual é o menor
// Se o usuário digitar dois números iguais, o programa informa

import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        if (n1 == n2) {
            System.out.println("Ambos os número são iguais.");
        }
        else {
            System.out.print("O primeiro número é " +n1+ " e o segundo número é " +n2+ " sendo, portanto, ");
                
                if (n1 > n2) {
                    System.out.print(n1+ " maior que " +n2);
                }
                    else {
                        System.out.print(n1+ " menor que " +n2);
                    }
                }
        }
    }


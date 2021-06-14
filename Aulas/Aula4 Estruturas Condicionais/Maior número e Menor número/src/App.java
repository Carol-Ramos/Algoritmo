// Faça um algoritmo que onde o usuário informe dois números e diga qual é o maior e qual é o menor.
// Caso o usuário digite valores iguais, informá-lo.
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2;
         
         System.out.println("Qual o valor do primeiro número? ");
         n1 = entrada.nextInt();
         
         System.out.println("Qual o valor do segundo número? ");
         n2 = entrada.nextInt();
         
         if (n1>n2) {
             System.out.println(n1+ " é maior que " +n2);
         }
         else { 
                System.out.println(n1+ " é menor que " +n2);
    
    }
}
}

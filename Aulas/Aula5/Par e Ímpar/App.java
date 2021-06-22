// Digite um número e o programa dirá se é par ou ímpar

import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int num1, res;
        
        System.out.print("Digite um valor numérico: ");
        num1 = entrada.nextInt();
        
        res = num1 % 2;
        
        if (res == 0) {
            System.out.println("O número " +num1+ " é par.");
        } 
        else {
            System.out.println("O número " +num1+ " é ímpar.");
        }
            }
}

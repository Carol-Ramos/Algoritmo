// O usuário entra com o valor da temperatura em graus Celsius e o progrma compila para Farhenheit


import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);
        
        double graus_c, graus_f;
        
        //variável do tipo double armazena números com casas decimais.

        System.out.print("Digite o valor da temperatura em graus Celsius: ");
        graus_c = entrada.nextInt();
        
        graus_f = 1.8 * (graus_c) + 32; //fórmula para conversão.
        
        System.out.println("O valor para " +graus_c+ " graus Celsius é " +graus_f+ " Fahrenheit.");
    }
}


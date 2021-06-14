// Estruturas condicionais
// Neste algoritmo o usuário deve informar seu nome, seu ano de nascimento e o ano atual. Assim, o programa irá calcular a sua idade e dizer se ele já pode dirigir ou não.

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        
        int ano_nasc, ano_atual, idade;
        String nome;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o seu nome? ");
        nome = entrada.nextLine();
        
        System.out.print("Qual o seu ano de nascimento? ");
        ano_nasc = entrada.nextInt();
        
        System.out.print("Digite o ano atual: ");
        ano_atual = entrada.nextInt();
        
        idade = ano_atual - ano_nasc;
        
            if (idade >= 18) {
        
        System.out.println(nome+ ", sua idade é de " +idade+ " anos e você PODE DIRIGIR!");
    }
            else {
                System.out.println(nome+ ", sua idade é de " +idade+ " anos e você NÃO PODE DIRIGIR :(");
            }
        
    }
}

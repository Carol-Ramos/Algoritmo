// Faça um algoritmo que informe a idade do usuário baseada na informação dada sobre o ano de nascimento e o ano atual e diga se ele PODE se aposentar ou NÃO.
// Tendo como primissa que a idade para a aposentadoria é a partir dos 65 anos.
// Caso ele não possa se aposentar, o programa tem que dizer quanto tempo falta.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner entrada = new Scanner(System.in);

        int ano_nasc, ano_atual, idade, restam;
        String nome;

        System.out.println("Qual o seu nome? ");
        nome = entrada.nextLine();

        System.out.println("Em que ano você nasceu? ");
        ano_nasc = entrada.nextInt();

        System.out.println("Em qual ano estamos? ");
        ano_atual = entrada.nextInt();

        idade = ano_atual - ano_nasc;
        restam = 65 - idade;

            if (idade >= 65) {
                System.out.println(nome+ " sua idade é " +idade+ " anos e você JÁ PODE se aposentar !!!");
            }
            else {
                System.out.println(nome+ " sua idade é " +idade+ " anos e você NÃO PODE se aposentar. Ainda restam " +restam+ " anos para sua aposentadoria.");
            }
    
    
    
    
    
    
    
    
    }
}

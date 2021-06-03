// Algoritmo que calcula o valor da comissão e o salário total baseado no salário bruto digitado pelo usuário.

import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);
        
        double sal_bruto, comissao, sal_total;
        
        System.out.print("Qual o seu salário bruto? ");
        sal_bruto = entrada.nextDouble();
        
        System.out.print("Qual o valor a porcentagem da taxa de comissão? ");
        comissao = entrada.nextDouble();
        
        comissao = (sal_bruto * comissao) / 100; 
        sal_total = sal_bruto + comissao;
        
        System.out.println("Seu salário bruto é no valor de " +sal_bruto+ 
        " Reais e sua comissão neste mês foi de " +comissao+ " totalizando " +sal_total+ 
        " Reais. "); 
    }
}

//cLASSIFICAÇÃO SALARIAL
// 0 - 2000 - Classe D
// 2001 - 4000 - Classe C
// 4001 - 6000 - Classe B
// >6000 - classe A

import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner (System.in);

        double salario;
        String nome, classe;
    
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite seu salário: ");
        salario = entrada.nextDouble();
        
        if (salario <= 2000) {
            classe = "D";
            System.out.println(nome+ ", sua classe salarial é " +classe);
        }
            if ((salario >= 2001) && (salario <= 4000)) {
                classe = "C";
                System.out.println(nome+ ", sua classe salarial é " +classe);
            }
                if ((salario >= 4001) && (salario <= 6000)) {
                    classe = "B";
                    System.out.println(nome+ ", sua classe salarial é " +classe);
                }
                    if (salario > 6000) {
                        classe = "A";
                        System.out.println(nome+ ", sua classe salarial é " +classe);
                    }
        
    }
}

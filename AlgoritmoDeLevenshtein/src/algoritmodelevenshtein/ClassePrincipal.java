package algoritmodelevenshtein;

import java.util.Scanner;

/**
 *
 * Criado 06/04/2017 ás 16:20:59 por ThLewis
 */

public class ClassePrincipal {
    
    public static void main(String[] args) {
        
        String s1,s2;
        AlgoritmoDeLevenshtein alg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a Primeira String: ");
        s1 = sc.nextLine();
        
        System.out.print("Informe a Segunda String: ");
        s2 = sc.nextLine();
        alg = new AlgoritmoDeLevenshtein(s1,s2);
        System.out.println("A distancia entre " + s1 + " e " + s2 + " é " + alg.calcularDistancia());
        alg.printarTabela();
    }
}

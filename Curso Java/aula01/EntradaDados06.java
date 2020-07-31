
import java.util.Scanner;

public class EntradaDados06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        String nome;
        int idade;
        float peso;

        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();

        System.out.println("Qual o seu peso?");
        peso = entrada.nextFloat();

        System.out.println("Bem vindo " + nome + ", " + "você tem " + idade + " anos e pesa " + peso + " kg.");
        
        entrada.close();

    }
}
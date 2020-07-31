import java.util.Scanner;

/**
 * Exercicio02Notas
 */
public class Exercicio02Notas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String entradaDigitada;
        float nota1;
        float nota2;
        float media;
        String nome;

        System.out.println("Olá! Qual o nome do(a) estudante?");
        nome = entrada.nextLine();

        System.out.println("Qual a primeira nota do(a) estudante " + nome + "?");
        entradaDigitada = entrada.nextLine();
        nota1 = Float.parseFloat(entradaDigitada);

        System.out.println("Qual a segunda nota do(a) estudante " + nome + "?");
        entradaDigitada = entrada.nextLine();
        nota2 = Float.parseFloat(entradaDigitada);

        media = (nota1 + nota2)/2;

        System.out.println("A média do(a) " + nome + " é: " + media + ".");

        entrada.close();



    }
}
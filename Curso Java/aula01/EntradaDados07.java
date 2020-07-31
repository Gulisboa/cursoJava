import java.util.Scanner;

public class EntradaDados07 {

    public static void main(String[] args) {

        //por um defeito de Scanner, ele buga quando recebe um numero e depois String, então é necessário criar
        //variável transitória para fazer o parse (conversão) do tipo. Então recebe como String e depois converte 
        //numérico
        

        Scanner entrada = new Scanner (System.in);

        String entradaDigitada;
        String nome;
        int idade;
        float peso;

        System.out.println("Qual a sua idade?");
        entradaDigitada = entrada.nextLine();
        idade = Integer.parseInt(entradaDigitada);

        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();


        System.out.println("Qual o seu peso?");
        entradaDigitada = entrada.nextLine();
        peso = Float.parseFloat(entradaDigitada);


        System.out.println("Bem vindo " + nome + ", " + "você tem " + idade + " anos e pesa " + peso + " kg.");
        
        entrada.close();

    }
    
}
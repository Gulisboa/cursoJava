import java.util.Scanner;



public class Exercicio03Salario {
    public static void main(String[] args) {
        
        //iniciar Scanner        
        Scanner entrada = new Scanner(System.in);

        //declarar variáveis
        String entradaDigitada;
        String funcionario;
        float salario;
        float salarioAtualizado;
        
        //entrada de dados
        System.out.println("Qual o nome do(a) funcionário(a)?");
        funcionario = entrada.nextLine();

        System.out.println("Qual o salário do(a) funcionario(a) " + funcionario + "?");
        entradaDigitada = entrada.nextLine();
        salario = Float.parseFloat(entradaDigitada);

        //calculo do novo salário
        salarioAtualizado = salario * 1.25f;

        //saída de dados
        System.out.println("O salário do(a) funcionário(a) " + funcionario + " após o aumento de 25% é R$" + salarioAtualizado);

        //finalizar Scanner
        entrada.close();

    }
    
}
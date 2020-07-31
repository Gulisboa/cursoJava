import java.util.Scanner;

public class EntradaDados05 {

    public static void main(String[] args) {
        
        //entrada de dados com Scanner

        //Scanner será utilizado para pegar o input do usuário (está em outras bibliotecas do JAVA (usar IMPORT))

        //estou criando um novo Scanner que irá ler entrada do teclado (padrão do teclado: System.in), mas pode ler de arquivo, de placa de rede, etc
        Scanner entrada = new Scanner(System.in);

        //variavel para receber o que vou ler do teclado
        String textoDigitado;

        System.out.println("Digite o seu nome:");        
        
        //next line pega o que foi digitado através do SCANNER (entrada)
        textoDigitado = entrada.nextLine();
        

        System.out.println("Bem vindo " + textoDigitado);

        //encerrar Scanner
        entrada.close();








    }
    
}
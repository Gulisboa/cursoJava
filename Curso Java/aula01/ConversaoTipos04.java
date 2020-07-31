/**
 * ConversaoTipos04
 */
public class ConversaoTipos04 {

    public static void main(String[] args) {
        
        //conversão de tipos

        int numeroInteiro;
        float numeroFloat;

        numeroInteiro = 230;
        
        //PQ F? Para falar que é float, pq mesmo falando float o JAVA usa double (tem mais precisão)
        numeroFloat = 7.9999f;

        
        //armazenar um tipo menor em um tipo maior, sem problema
        numeroFloat = numeroInteiro;

        //armazenar um tipo maior em um tipo menor, não funciona
        
        //casting: força uma conversão de tipo

        numeroInteiro = (int)numeroFloat;

        System.out.println(numeroInteiro);
        System.out.println(numeroFloat);


    }
    
}
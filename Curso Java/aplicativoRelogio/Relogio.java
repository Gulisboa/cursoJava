public class Relogio {
 
    int hora;
    int minuto;
    int segundo;
    String horario;

    public Relogio(int hora, int minuto, int segundo){

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public String getHora(){
        return horario = hora + ":" + minuto + ":" + segundo;
    }


}

package estudar;


public class Estudar {

    
    public static void main(String[] args) {
        Aula aula1 = new Aula();
        aula1.status(); // ao ser criada uma instâcia de Aula, o construtro já define os valores nele contidos
        aula1.setHorario(7); // o início da aula será as 7
        aula1.mudarHorario(8); // o horário foi mudado para as 8 horas
        aula1.aumentarAduracaoDaAula(6);
        aula1.mudarConteudo("História");
        aula1.status(); // mostrando os dadaos do objeto aula!
        aula1.setTurno("Manhã");
        aula1.setDia("Segunda");
       aula1.status();
       //=======================================================================
       Aula aula2 = new Aula();
       aula2.setHorario(9);
       aula2.setDuracao(12);
       aula2.setConteudo("Portugês");
       aula2.setDia("terça");
       aula2.setTurno("Noturno");
       aula2.status();
       aula2.mudarConteudo("aula de java OO ");
       aula2.status();
       
    }
    
}

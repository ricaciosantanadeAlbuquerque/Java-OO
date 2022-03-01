
package escopo.de.classe.escopo.de.instancia;

public class EscopoDeClasseEscopoDeInstancia {
    
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
          celular1.numero = "999998";
          celular2.numero = "777777";
          celular3.numero = "5555555";
          Celular.empresa = "Bradesco";
          
          System.out.println("O numero "+celular1.numero+" dá empresa "+ celular1.empresa);
          System.out.println("O numero "+celular2.numero+" dá empresa "+ celular2.empresa);
          System.out.println("O numero "+celular3.numero+" dá empresa "+ celular3.empresa);
    }
    
}

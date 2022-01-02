
package exe05;

public class Exe05 {

    
    public static void main(String[] args) {
        Armadechoque arm1 = new  Armadechoque(); // arm1 é uma nova arma de choque 
        arm1.status(); // os valores do construtor já foram passados 
        System.out.println("===================================================");
        arm1.carregar(); // mandei carregar 
        arm1.ligar(); // mandei ligar 
       arm1.disparar();// mandei desparar
        arm1.status();  // mandei 
         System.out.println("===================================================");
         Armadechoque c2 = new Armadechoque();
         c2.status();
          System.out.println("===================================================");
          c2.setModelo("RPM");
          c2.setTamanho(25);
          c2.carregar();
          c2.ligar();
          c2.setBateria(false);
         c2.disparar();
         c2.status();
          System.out.println("===================================================");
    }
    
}

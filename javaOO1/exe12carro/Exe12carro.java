
package exe12carro;


public class Exe12carro {

 
    public static void main(String[] args) {
     Carro carro1;// declarei o objeto
     carro1 = new Carro(); //istaânciei o objeto e inicialize através do contrutor
     carro1.setCor("Azul");
     carro1.setPotencia(1.8f);
     carro1.setModelo("gol");
     carro1.setQuantiPortas(4);
     carro1.status();
     System.out.println("========================================================");
     carro1.ligarCarro();
     carro1.status();
        System.out.println("======================================================");
        carro1.Acelerar();
        carro1.mostrarVelocidade();
        carro1.status();
        
    }
    
}


package exe07_encapsulamento;


public class Exe07_encapsulamento {

    
    public static void main(String[] args) {
      ControleRemoto controle1 = new ControleRemoto(50,false,false);
     controle1.ligar();
     controle1.abrirMenu();
     controle1.maisVolume();
     controle1.abrirMenu();
     controle1.menosVolume();
     controle1.abrirMenu();
     controle1.ligarMudo();
     controle1.abrirMenu();
     controle1.desligarMudo();
     controle1.abrirMenu();
     
      
    }
    
}

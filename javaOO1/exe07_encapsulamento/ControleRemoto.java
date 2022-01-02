
package exe07_encapsulamento;

public class ControleRemoto implements Controlador{
//========================Atributos=============================================    
 private int volume;
 private boolean ligado;
 private boolean tocando;
 //====Método Contrutor=========================================================
 public ControleRemoto(int v,boolean liga,boolean toca ){
     this.setVolume(v);
     this.setLigado(liga);
     this.setTocando(toca);
 }
 private int getVolume(){
     return this.volume;
 }
 private void setVolume(int volume1){
     this.volume = volume1;
 }
 private boolean getLigado(){
     return this.ligado;
 }
 private void setLigado(boolean liga){
     this.ligado = liga;
     
 }
 private boolean getTocando(){
    return this.tocando;
 }
 private void setTocando(boolean toca){
     this.tocando = toca;
 }
 //=====Métodos implementados===================================================
 @Override // significa que os métodos foram sobre escritos
  public void ligar(){
      this.setLigado(true);
      this.setTocando(true);
  }
   @Override
  public void desligar(){
      if(this.getLigado() == true){// só podemos deligar a tv se ela estiver ligada
          this.setLigado(false);
      }
      
  }
   @Override
  public void abrirMenu(){
      if(this.getLigado() == true){
          System.out.println("A teve está ligada ["+this.getLigado()+"]");
          System.out.println("A teve está tocando ["+this.getTocando()+"]");
          System.out.print("O valoume é "+this.getVolume());
          for(int i = 1; i<=this.getVolume();i+=10){
              System.out.print(" | ");
          }
      }
  }
   @Override
  public void fecharMenu(){
     System.out.println("Menu fechado !");
  }
   @Override
  public void maisVolume(){
      if(this.getLigado() == true){
          this.setVolume(this.getVolume()+10);
      }
  }
   @Override
  public void menosVolume(){
     if(this.getLigado() == true){
        this.setVolume(this.getVolume() - 5);
     }
  }
   @Override
  public void ligarMudo(){ 
      if((this.getLigado() == true) && (this.getVolume() > 0)){
          this.setVolume(0);
      }
  }
   @Override
    public void desligarMudo() {
        if((this.getLigado() == true)&&(this.getVolume()== 0)){
            this.setVolume(50);
        }
    }
    
   @Override
  public void play(){
      if(this.getLigado() == true && this.getTocando()== false){
          this.setTocando(true);
      }
  }
   @Override
  public void pause(){
      if(this.getLigado() == true && this.getTocando()==true){
          this.setTocando(false);
      }
  }

   
}

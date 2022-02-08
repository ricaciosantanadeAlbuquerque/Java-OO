package polimorfismo.sobreposicao;

public class Peixes extends Animal {
    private String corEscama;
    
    public void soltarBolhas(){
        System.out.println("Soltando bolhas! ");
    }
     public String getCorEscama(){
         return this. corEscama;
     } 
     public void setCorEscama( String cor1){
         this.corEscama = cor1;
     }
     @Override
     public  void locomover(){
         System.out.println("Nadando !");
     }
     @Override
     public void alimentar(){
         System.out.println("comando algas ");
     }
     @Override
     public void emitirSom(){
         System.out.println("não emite som algum. ");
     }
}

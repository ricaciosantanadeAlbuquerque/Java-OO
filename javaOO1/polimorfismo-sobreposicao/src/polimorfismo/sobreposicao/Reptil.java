package polimorfismo.sobreposicao;
/*A classe reptil herda todos os atribultos e métodos da classe Animal*/
public class Reptil extends Animal { 
 private String corEscama;    
 
 @Override
 public void locomover(){  // polimorfismo  de sobreposição
     System.out.println("rastejando! ");
 }
 @Override
 public void alimentar(){
     System.out.println("vegetais e insetos");
 }
 @Override
 public void emitirSom(){
     System.out.println("Som de réptil ");
 }
 public String getCor(){
     return this.corEscama;
 }
 public void setCor(String cor1){
    this.corEscama = cor1;
 }
 
 
}

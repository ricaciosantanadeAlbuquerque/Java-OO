
package polimorfismo.sobrecarga;

public class Mamifero extends Animal {
   protected String corPelo;
   @Override // Sobrepor
   public void emitirSom(){
       System.out.println("Som de mamifero ! ");
   }
}

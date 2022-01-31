
package cap07_livro;

public class Celular {
 public String numero;
 public static String empresa; // escopo de classe utilização da palavra static
 // teremos um valor genérico para todos os objetos gerados aparti dessa classe
 
 public void status(){
     System.out.println("Numero:"+this.numero+"\n");
     System.out.println("Empresa: "+this.empresa+"\n");
 }        
}

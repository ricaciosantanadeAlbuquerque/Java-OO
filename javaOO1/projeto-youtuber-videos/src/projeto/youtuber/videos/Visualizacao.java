/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.youtuber.videos;

public class Visualizacao {
 private Usuario espectador;
 private Video filme;
 
 public Visualizacao(Usuario espectador1,Video filme1){
     this.espectador = espectador1;
     this.filme = filme1;
     this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
     this.filme.setViews(this.filme.getViews()+1);
     /*Quando há uma visualização deve ser contado para o usuário que ele viu um vídeo
     * e o programa deve mostra que o video x  tem uma visualização, uma view
     *  para isso usamos os objetos que estão ligados as classes que desejamos alterar os
     * atribultos, eles fazem uso dos métodos sets que por sua vez altera o valor dos atribultos
     * desta classe.*/
 }

 public Usuario getEspectador(){
     return this.espectador;
 }
 public void setEspectador(Usuario espectador1){
     this.espectador = espectador1;
 }
 public Video getFilme(){
     return this.filme;
 }
 public void setFilme(Video filme1){
     this.filme= filme1;
 }
  // polimorfismo de sobre carga
  public void avalir(){
      this.filme.setAvaliacao(5);
  }
  public void avaliar(int nota){
      this.filme.setAvaliacao(nota);
  }
  public void avaliar(float porcento){
      int num1  = 0; // variavel local
      if(porcento <=20){
          num1 = 3;
      }else if (porcento <= 50){
          num1 = 5;
      }else if(porcento <=90){
          num1 = 8;
      }else{
          num1 = 10;
      }
      this.filme.setAvaliacao(num1);
      
  }

    @Override
    public String toString() {
        return "Visualizacao{"  + espectador + ", filme=" + filme + '}';
    }
 
}

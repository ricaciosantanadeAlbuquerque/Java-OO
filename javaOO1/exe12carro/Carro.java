package exe12carro;

public class Carro {
// atributos====================================================================
 private String modelo;
 private String cor;
 private int quantiPortas;
 private float potencia;
 private boolean ligado;
 private int velocidade;
 private boolean trava;
 
//============================================================================== 
 public void mostrarVelocidade(){
     System.out.println("\nVelocidade Atual do carro "+ this.getVelocidade());
 }
 public void status(){
     if(this.getLigado()== true){
         System.out.println("O carro está ligado!");
     }else{
         System.out.println("O carro está Desligado !");
     }
     if(this.getVelocidade()>0){
         System.out.println("O carro está em Movimento");
     }else{
         System.out.println("O carro está parado ");
     }
     System.out.println("A cor do carro é "+this.getCor());
     System.out.println("O modelo é "+this.getModelo());
     System.out.println("A quantidade de portas: "+this.getQuantiPortas());
       System.out.println("potência do motor "+this.getPotencia());
      if(this.getTrava() == true){
           System.out.println("O carro está travado");
      }else{
           System.out.println("O carro está Destravado");
      }
 }
 public void ligarCarro(){
     this.setLigado(true);
 }
 public void DesligarCarro(){
     this.setLigado(false);
 }
 public void Acelerar(){
     if(this.getLigado()== true){ // se estiver ligado então
         if(this.getVelocidade() >= 0){ // se ele estiver andando ele pode acelerar  e se estiver parado pode acelerar
         this.setVelocidade(this.getVelocidade()+1);
         this.setTrava(false); // está em movimento
     }
     }else{ // no caso pela lógica não deveria mostrar nada porque está desligado mas para fins de estudo 
         System.out.println("ERRO! O carro não está ligado ! ");
     }
 }
 public void frear(){
    if(this.getLigado() == true){// se estiver ligado
        if(this.getVelocidade() > 0){// se a velocidade for maior que zero
            this.setVelocidade(this.getVelocidade()-1); // diminuir velocidade
        }else{
            System.out.println("Erro! não é possível frear, pois o carro já está "
                    + "parado");
        }
    }else{
          System.out.println("ERRO! O carro não está ligado ! ");
    }
 }
 public void travarCarro(){
    if(this.getLigado()== false){ // se estiver desligado 
        if(this.getVelocidade()== 0){// e parado
            this.setTrava(true); // pode travar o carro
        }
    }else if(this.getLigado() == true){// está ligo
        if(this.getVelocidade()>0){ // e em movimento
            this.setTrava(false); // não pode travar o carro
        }
    }
 }
 public void abrirPortas(){
     System.out.println("As portas foram abertas ");
 }
 public void fecharPortas(){
     System.out.println("As portas foram fechadas ");
 }
// construtor===================================================================
    public Carro() {
        this.setLigado(false);
        this.setVelocidade(0);
        this.setTrava(true);
    }
// get e set ===================================================================
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantiPortas() {
        return quantiPortas;
    }

    public void setQuantiPortas(int quantiPortas) {
        this.quantiPortas = quantiPortas;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getTrava() {
        return trava;
    }

    public void setTrava(boolean trava) {
        this.trava = trava;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    
    public void getLigado(boolean l){
        this.ligado = l;
    }
 
}


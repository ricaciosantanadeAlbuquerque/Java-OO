
package exe05;

public class Armadechoque {
    private String modelo;
    private int tamanho;
    private int voltagem;
    private boolean ligado;
    private boolean bateriaCarregada;
    public Armadechoque(){
        this.setModelo("Super choque");
        this.setBateria(false);
        this.ligado = false; // acesso direto
        this.setVoltagem(1200); // voltagem suportada padrão
        this.tamanho = 15;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String muda){
        this.modelo = muda;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int t){
        this.tamanho = t;
    }
    public int getVoltagem(){
        return this.voltagem;
    }
    public void setVoltagem(int v){
        this.voltagem = v; 
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean liga){
        this.ligado = liga;
    }
    public boolean getBateria(){
        return this.bateriaCarregada;
    }
    public void setBateria(boolean bate){
        this.bateriaCarregada = bate;
    }
    public void disparar(){
        if(this.getLigado() == true ){ // se está ligada 
            if(this.getBateria() == true ){ // se possui cargA
                System.out.println("Arma disparada !"); // ENTÃO dispara 
            }else{
                System.out.println("  a Carga da bateria está muito baixa para disparar ! ");
                // possui carga para ligar, porém não para disparar. 
            }
        }else{ // se não estiver ligando a bateria está descarregada
            System.out.println("Bateria descarregada !");
        }
    }
    public void carregar(){
        if(this.getLigado() == false){ // se esviter  desligado
           if(this.getBateria()== false){// se a bateria está zerada 
               this.setBateria(true); // então carrega
           }
        }
    }
    public void ligar(){
        if(this.getLigado() == false){ // se estiver desligado e
            if(this.getBateria() == true){ // se estiver carregado
                this.setLigado(true); // então pode ligar
            }
        }
    }
    public  void desligar(){
        if(this.getLigado() == true ){ // se estiver ligado 
            this.setLigado(false); // basta desligar 
        }
    }
    public void status(){
        System.out.println("Modelo "+ this.getModelo());
         System.out.println("Tamanho "+this.getTamanho()+"CM");
          if(this.getLigado() == true ){
              System.out.println("Está ligada ! ");
          }else{
              System.out.println("Desligada ! ");
          }
          if(this.getBateria()== true){
              System.out.println("Está carregada !");
          }else{
              System.out.println("Está descarregada !");
          }
          
    }
}


package exe010luta_ufc;

public class Lutador implements Lutador1 {
    private String  nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria,derrotas,empates;
    
 //========métodos da interface=================================================
     @Override
    public void apresentar(){
        
        System.out.println("Chegou a hora apresentamos o Lutador: "+this.getNome());
         System.out.println("Origem: "+this.getNacionalidade());
         System.out.println(this.getIdade()+" anos ");
         System.out.println(this.getAltura()+" m de Altura");
         System.out.println(" Pesando "+ this.getPeso()+" em KG");
         System.out.println("Ganhou: "+ this.getVitoria());
         System.out.println("Perdeu: "+ this.getDerrota());
         System.out.println("Empatou: "+this.getEmpate());
          System.out.println("==================================================");
    }
    @Override
    public void status(){
        System.out.println(this.getNome());
        System.out.println(" é um peso "+ this.getCategoria());
        System.out.println(this.getVitoria()+" Vitórias");
        System.out.println(this.getDerrota()+" Derrotas");
        System.err.println(this.getEmpate()+" empates");
    }
    @Override
    public void ganharLuta(){
       this.setVitoria(this.getVitoria() + 1);
    }
    @Override
    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
    }
    @Override
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
//===============Costrutro====================================================== 
    public Lutador(String no,String na,int id,float al,float pe, int vi, int de,int em){
       this.setNome(no);
       this.setNacionalidade(na);
       this.setIdade(id);
       this.setAltura(al);
       this.setPeso(pe);
       this.setVitoria(vi);
       this.setDerrota(de);
       this.setEmpate(em);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nomeP){
        this.nome = nomeP; 
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacio){
        this.nacionalidade = nacio;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int ida){
        this.idade = ida;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float alto){
        this.altura = alto;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso1){
       this.peso = peso1;
       this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
   private void setCategoria(){ // será um metodo interno
       if(this.getPeso() < 52.2){
           this.categoria = "Inválido";
       }else if(this.getPeso() <= 70.3){
           this.categoria = "Leve";
       }else if(this.getPeso() <= 83.9){
           this.categoria = "Médio";
       }else if(this.getPeso() <= 120.2){
           this.categoria = "Pesado";
       }else{
           this.categoria = "Inválido";
       }
   }
   public int getVitoria(){
       return this.vitoria;
   }
   public void setVitoria(int vito){
       this.vitoria = vito;
   }
   public int getDerrota(){
       return this.derrotas;
   }
   public void setDerrota(int derrota1){
       this.derrotas = derrota1;
   }
   public int getEmpate(){
       return this.empates;
   }
   public void setEmpate(int empate){
       this.empates = empate;
               
   }
   
}

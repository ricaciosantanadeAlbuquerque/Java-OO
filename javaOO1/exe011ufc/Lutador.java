
package exe011ufc;

public class Lutador implements Interface {
// Atributos da classe    
     private String nome;
     private String nacionalidade;
     private int idade;
     private double altura;
     private double peso;
     private String categoria;
     private int vitorias,derrotas,empates;
// Construtor==================================================================     
     public Lutador(String no,String na,int ida, double alt, double pe, 
     int vi, int de,int em){
         this.setNome(no);
         this.setNacionalidade(na);
         this.setIdade(ida);
         this.setAltura(alt);
         this.setPeso(pe);
         this.setEmpate(em);
         this.setVítoria(vi);
         this.setDerrota(de);
     }
     // métodos get e set=======================================================
     public String getNome(){ // todo método get possui retorno !
         return this.nome;
     }
     public void setNome(String nome1){
         this.nome = nome1;
     }
     public String  getNacionalidade(){
         return this.nacionalidade;
     }
     public void setNacionalidade(String nacio){ // o parâmentro deve ser do mesmo tipo do atributo
         //this faz referância a quem chama o método 
         this.nacionalidade = nacio;
     }
     public int getIdade(){
         return this.idade;
     }
     public void setIdade(int idade){
         this.idade = idade;
         // O MEU ATRIBUTO idade RECEBE O meu parâmentro IDADE.
     }
     public double getAltura(){
         return this.altura;
     }
     public void setAltura(double alt){
         this.altura = alt;
     }
     public double getPeso(){
         return this.peso;
     }
     public void setPeso(double peso1){
         this.peso = peso1;
         this.setCategoria();
     }
     public String getCategoria(){
         return this.categoria;
     }
     public void setCategoria(){
         if(this.getPeso() <52.2){
            this.categoria = " Inválido";
         }else if(this.getPeso()<=70.3){
             this.categoria = "Leve";
         }else if(this.getPeso() <=83.9){
             this.categoria = "Médio";
         }else if(this.getPeso() <=120.2){
             this.categoria = "Pesado";
         }else{
             this.categoria ="Inválido";
         }
}
     public int getVitoria(){
         return this.vitorias;
     }
     public void setVítoria(int vitoria){
         this.vitorias = vitoria;
     }
     public int getDerrota(){
         return this.derrotas;
     }
     public void setDerrota(int derrota){
         this.derrotas = derrota;
     }
     public int getEmpate(){
        return this.empates;
     }
     public void setEmpate(int empate){
         this.empates = empate;
     }
 // Métodos da interface =======================================================  
    @Override // Sobre escrita
    public void apresentar(){
      
        System.out.println("O Lutador "+ this.getNome());
        System.out.println(" de Origem "+ this.getNacionalidade());
        System.out.println(" Idade "+this.getIdade()+" anos");
        System.out.println(this.getAltura()+" em metros ");
        System.out.println(" Ganhou "+this.getVitoria());
        System.out.println("Empatou "+ this.getEmpate());
        System.out.println("Perdeu "+this.getDerrota());
    }
    @Override
    public void status(){
    
        System.out.println(this.getNome());
        System.out.println("é um peso "+this.getCategoria());
        System.out.println(this.getDerrota()+" derrotas");
        System.out.println(this.getVitoria()+" Vitórias");
        System.out.println(this.getEmpate()+" Empates");
    }
    @Override
    public void ganharLuta(){
       this.setVítoria(this.getVitoria()+1);
    }
    @Override
    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
    }
    @Override
    public void empatarLuta(){
       this.setEmpate(this.getEmpate()+1);
    }
}

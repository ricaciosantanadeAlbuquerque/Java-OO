
package metodo_lista_objetos;


public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String sexo;
    private  String trabalha;
    // polimorfismo de sobrecarga nos costrutores
    public Pessoa(){
        
    }
    public Pessoa(String nome, int idade,double peso,double altura,String sexo,  String trabalha){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.trabalha = trabalha;
    }
    // ========== get set====================================================================
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome1){
        this.nome = nome1;
    }
    public int getIdade(){
       return this.idade;
    }
    public void setIdade(int idade1){
       this.idade = idade1;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso1){
        this.peso = peso1;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura1){
        this.altura = altura1;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo1){
        this.sexo = sexo1;
    }
    
    public  String getTrabalha(){
        return this.trabalha;
    }
    public void setTrabalha( String trabalha1){
        this.trabalha = trabalha1;
    }
// polimorfismo de sobreposição
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", trabalha=" + trabalha + '}';
    }
    
    
}

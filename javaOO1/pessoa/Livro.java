
package pessoa;

public class Livro implements Publicacao{
// Atributos====================================================================    
   private String titulo;
   private String autor;
   private int totPagina;
   private int pagAtual;
   private boolean aberto;
   private Pessoa1 leitor; // agregação
// contrutor====================================================================   
   public Livro(String titulo1,String autor1,int totPagina1,Pessoa1 leitor1){
       this.titulo = titulo1;
       this.autor = autor1;
       this.totPagina = totPagina1;
       this.leitor = leitor1; 
       this.aberto = false;
       this.pagAtual = 0;
   }
// get e set ===================================================================
 public String getTitulo(){
     return this.titulo;
 }   
 public void setTitulo(String titulo1){
     this.titulo = titulo1;
 }
 public String getAutor(){
     return this.autor;
 }
 public void setAutor(String autor1){
     this.autor = autor1;
 }
 public int getTotPagina(){
     return this.totPagina;
 }
 public void setTotPagina(int tot1){
     this.totPagina = tot1;
 }
 public int getPegAtual(){
     return this.pagAtual;
 }
 public void setPegAtual(int pagAtual1){
     this.pagAtual = pagAtual1;
 }
 public boolean getAberto(){
     return this.aberto;
}
 public void isAberto(boolean aberto1){
     this.aberto = aberto1;
 }
 public Pessoa1 getLeitor(){ // tipo abstrato de dado
     return this.leitor;
 }
 public void setLeitor(Pessoa1 leitor1){
     this. leitor = leitor1;
 }
 // implementação da interface==================================================
 @Override
 public void abrir(){
      this.isAberto(true);
 }
 @Override
 public void fechar(){
     this.isAberto(false);
 }
 @Override
 public void folhear(int pagina){
     if(pagina > this.totPagina){
         this.pagAtual = 0;
     }else{
         this.pagAtual = pagina;
     }
 }
 @Override
 public void avancarPag(){
     this.pagAtual++;
 }
 @Override
 public void voltarPag(){
     this.pagAtual--;
 }

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ",\n autor = " + autor + 
                ",\n totPagina = " + totPagina + ", pagAtual = " + pagAtual + ",\n aberto = " 
                + aberto + "\n, leitor = " + leitor.getNome() + 
                ",Idade = " + leitor.getIdade()+
                ",Sexo = " + leitor.getSexo()+'}';
    }

}
 

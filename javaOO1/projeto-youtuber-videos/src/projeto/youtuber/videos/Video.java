
package projeto.youtuber.videos;

public class Video implements AcoesVideo{
private String titulo;
private int avaliacao;
private  int views;
private int curtidas;
private boolean reproduzindo;

public Video(String titulo1){ // construtor
    this.titulo = titulo1;
    this.avaliacao = 1;
    this.curtidas = 0;
    this.views = 0;
    this.reproduzindo = false;
    /*Ao criar um vídeo e necessário ter um nome,
    * porém
    * quando ele é criado sua visualização é zero
    * suas curtidas são zero
    * ele não está sendo reproduzido
    */
}
// métodos acessores e modificadores
public String getTitulo(){
    return this.titulo;
}
public void setTitulo(String titulo1){
    this.titulo = titulo1;
}
public int getAvaliacao(){
    return this.avaliacao;
}
public void setAvaliacao(int avaliacao1 ){
    int nota =0;
    
    nota =(int)((this.avaliacao + avaliacao1)/this.views);
// A soma das avaliações divido pela quantidade de visualizações            
    this.avaliacao = nota;
}
public int getViews(){
    return this.views;
}
public void setViews(int views1){
    this.views = views1;
}

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas1) {
        this.curtidas = curtidas1;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo1) {
        this.reproduzindo = reproduzindo1;
    }
 // implementeção da interface AcoesVideo   
@Override
public void play(){
    this.setReproduzindo(true);
}
@Override
public void pause(){
    this.setReproduzindo(false);
}
@Override
public void like(){
    this.setCurtidas(this.getCurtidas()+1);// this.curtidas++;
}

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
                ", views=" + views + ", curtidas=" + curtidas + 
                ", reproduzindo=" + reproduzindo + '}';
    }

}

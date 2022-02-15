
package projeto.youtuber.videos;

public class ProjetoYoutuberVideos {
    
    public static void main(String[] args) {
        Video[] video1= new Video [3];
        video1[0] = new Video("Aula 1 Java POO");
        video1[1] = new Video("Aula 12 de HTML5");
        video1[2] = new Video("SQL aula 07");
        
        //System.out.println(video1[0].toString());
        
       Usuario[] usuario1 = new Usuario[2];
       usuario1[0] = new Usuario("Lucas",27,"M","123");
       usuario1[1] = new Usuario("Ana",37,"F","123456");
        System.out.println("\n");
       // System.out.println(usuario1[0].toString());
        
        Visualizacao[] visi = new Visualizacao[2];
        visi[0] = new Visualizacao(usuario1[0],video1[0]);
       /* meu vetor de visualização visi recebe na posição 1 uma nova visualização
        *passando como argumento o vetor usuario1 na posiação zero e o vetor video na posição
        *zero.
        */
        visi[1] = new Visualizacao(usuario1[1],video1[1]);
        visi[1].avalir();
        visi[0].avaliar(9);
        // visi[1] visi na posição 1 é uma instância de video
        //portanto pode utilizar seus métodos
        System.out.println(visi[0].toString());
        System.out.println("");
        System.out.println(visi[1].toString());
    }
    
}

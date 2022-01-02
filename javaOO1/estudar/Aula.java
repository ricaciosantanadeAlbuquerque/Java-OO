package estudar;


public class Aula {
//======ATRIBUTOS===============================================================    
 private double horario;
 private  double duracao;
 private  String conteudo;
 private String turno;
 private String dia ;
 private int faltas;
//=======CONSTRUTOR=============================================================
 public Aula(){
     this.conteudo = "Indefinido. ";
     this.turno = "Indefinido. ";
     this.duracao = 0.0;
     this.dia = "Indefinido. ";
     this.faltas = 0;
     this.horario =0.0;
 }
 public double getHorario(){
     return this.horario;
 }
 public void setHorario(double h){
     this.horario = h;
 }
 public double getDuracao(){
     return this.duracao;
 }
 public void setDuracao(double d){
     this.duracao =d;
 }
 public String getConteudo(){
     return this.conteudo;
 }
 public void setConteudo(String conte){
     this.conteudo = conte;
 }
 public String getTurno(){
     return this.turno;
 }
 public void setTurno(String t){
     this.turno = t;
 }
 public String getDia(){
     return this.dia;
 }
 public void setDia(String dia){
     this.dia = dia;
 }
 public int getFaltas(){
     return this.faltas;
 }
 public void setFaltas(int p){
     this.faltas = p;
 }
 public void status(){
    System.out.println("=======================================================");
     System.out.println("Horário de Inicío "+this.getHorario());
       System.out.println("Turno "+this.getTurno());
         System.out.println("Duração "+this.getDuracao());
           System.out.println("Conteúdo é "+ this.getConteudo());
           System.out.println("Dias das aulas "+ this.getDia());
           System.out.println("numero de faltas "+this.getFaltas());
    System.out.println("=======================================================");
 }
 public void mudarHorario(double hora){
    this.setHorario(hora);
 }
 public void aumentarAduracaoDaAula(double duracao){
     this.setDuracao(duracao);
 }
 public  void diminuirDuracao(double diminui){
     this.setDuracao(diminui);
 }
 public void mudarConteudo(String conte){
     this.setConteudo(conte);
 }
 public void assitirAula(int pre){
     this.setFaltas(pre);
 }
 public void naoAssistirAula(int npre){
     this.setFaltas(npre);
 }
}

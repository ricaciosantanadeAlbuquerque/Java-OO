
package datateste;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
   public int getDia(){
       return this.dia;
   }
   public void setDia(int dia){
       this.dia = dia;
   }
   public int getMes(){
       return this.mes;
   }
   public void setMes(int mes){
       this.mes =  mes;
   }
   public int getAno(){
       return this.ano;
   }
   public void setAno(int ano){
       this.ano = ano;
   }
   public Data(){
       Date data =new Date();
    SimpleDateFormat ano = new  SimpleDateFormat("y");
    SimpleDateFormat mes =new SimpleDateFormat("M");
    SimpleDateFormat dia =new SimpleDateFormat("D");
    String ano1 = ano.format(data);
    String mes1 = mes.format(data);
    String dia1 = dia.format(data);
      this.setAno(Integer.parseInt(ano1));
      this.setMes(Integer.parseInt(mes1));
      this.setDia(Integer.parseInt(dia1));
   }
   public void displayData(){
       
     
       System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAno());
   }
}

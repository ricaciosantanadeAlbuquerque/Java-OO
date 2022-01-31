/*
 * 
 */
package empregadoteste;


public class Empregadoteste {

   
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.setNome("luiz");
        empregado1.setSobrenome("bragança");
        empregado1.setSalarioMensal(1500);
        System.out.println("Nome: "+empregado1.getNome());
        System.out.println("Sobre nome: "+empregado1.getSobrenome());
        System.out.println("Salario Mensal "+empregado1.getSalarioMensal());
        System.out.println("Salário Anual "+empregado1.salarioAnual());
        empregado1.setPorcento(10);
        System.out.println("Com o aumento de "+empregado1.getPorcento()+"%");
        System.out.println("Salário Anual "+empregado1.salarioAnual());
        System.out.println("==================================================");
        Empregado empregado2 = new Empregado();
        empregado2.setNome("Andre");
        empregado2.setSobrenome("Andrade");
        empregado2.setSalarioMensal(1000);
         System.out.println("Nome: "+empregado2.getNome());
        System.out.println("Sobre nome: "+empregado2.getSobrenome());
        System.out.println("Salario Mensal "+empregado2.getSalarioMensal());
        System.out.println("Salário anual "+empregado2.salarioAnual());
        empregado2.setPorcento(30);
         System.out.println("Com o aumento de "+empregado2.getPorcento()+"%");
          System.out.println("Salário anual "+empregado2.salarioAnual());
           System.out.println("==================================================");
    }
    
}


package projeto.escola;

public class ProjetoEscola {

    public static void main(String[] args) {
     //  Pessoa pessoa1 = new Pessoa();  classes abstratas não podem ser instânciadas
     Visitante visitante1 = new Visitante();
     visitante1.setNome("Marcos");
     visitante1.setIdade(18);
     visitante1.setSexo("M");
    
    System.out.println( visitante1.toString());
     System.out.println("======================================================");
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Gabriel");
    aluno1.setCurso("Analise e desenvolvimento de sistemas");
    aluno1.setIdade(22);
    aluno1.fazerAniversario();
    aluno1.setSexo("M");
   
       System.out.println(aluno1.toString());
         aluno1.pagarMensalidade();
         aluno1.setMatricula(7777);
         System.out.println("Matricula: "+ aluno1.getMatricula());
         System.out.println("Curso: "+aluno1.getCurso());
             System.out.println("======================================================");
  //=============================================================================
  Bolsista bolsista1 = new Bolsista();
   bolsista1.setNome("Lucas");
   bolsista1.setIdade(17);
   bolsista1.setBolsa(50);
   bolsista1.setSexo("M");
   bolsista1.setCurso("Redes de computador");
   bolsista1.pagarMensalidade();
   bolsista1.renovarBolsa();
   bolsista1.setMatricula(11779);
   bolsista1.fazerAniversario();
  // System.out.println(bolsista1.getBolsa()+"%");
        System.out.println( bolsista1.toString());
        System.out.println("Curso: "+bolsista1.getCurso());
        System.out.println("===================================================");
 //=============================================================================  
  Professor professor1 = new Professor();
  professor1.setNome("Ana");
  professor1.setSexo("F");
  professor1.setIdade(37);
  professor1.setEspecialidade("Programação java");
  professor1.setSalario(7500.55);
  professor1.fazerAniversario();
        System.out.println(professor1.toString());
        System.out.println("Salário atual de "+professor1.getSalario());
        System.out.println("Especialidade: "+professor1.getEspecialidade());
        System.out.println("====================================================");
        
//==============================================================================        
         Técnico tecnico1 = new Técnico();
         tecnico1.setCurso("Engenharia");
         tecnico1.setNome("Laura");
         tecnico1.setSexo("F");
         tecnico1.setIdade(23);
         tecnico1.pagarMensalidade();
         tecnico1.setMatricula(3334);
         tecnico1.setRegistroProfissional(88887);
         System.out.println(tecnico1.toString());
          System.out.println("Registro profissional: "+tecnico1.getRegistroProfissional());
         System.out.println("Curso:"+ tecnico1.getCurso());
    }
    
   
    
    
}

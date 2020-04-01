package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario  p4 = new Funcionario();
        
        p1.setNome("João");
        p2.setNome("Lucas");
        p3.setNome("Cláudia");
        p4.setNome("Ricardo");
        
        p1.setSexo("Masculino");
        p4.setSexo("Masculino");
        
        p2.setIdade(18);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p3.receberAum(550.20f);
    }
}

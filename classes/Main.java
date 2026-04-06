public class Main {
    public static void main(String[] args) {
       
        Aluno a1 = new Aluno("João", 17, "10/05/2008", "85999999999", "Carlos");
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(16);
        a1.setDtNascimento("10/05/2008");
        a1.setTelefone("85999999999");
        a1.setNomeResponsavel("Carlos");
        
        
        System.out.println(a1.apresentacao());
        a1.saudacao();
    }
}

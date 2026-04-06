import java.time.LocalTime;

public class Aluno{
    private String nome;
    private int idade;
    private String dtNascimento;
    private String telefone;
    private String nomeResponsavel;
    
        public Aluno(String nome, int idade, String dtNascimento, String telefone, String nomeResponsavel){
    
            this.nome = nome;
            this.idade = idade;
            this.dtNascimento = dtNascimento;
            this.telefone = telefone;
            this.nomeResponsavel = nomeResponsavel;
}
    public String apresentacao(){

        return "nome:" + this.nome + "idade:" + this.idade + "dtNascimento:" + this.dtNascimento + "telefone:" + this.telefone + "nomeResponsavel:" + this.nomeResponsavel;
    }

    public String saudacao(){

        int hora = java.time.LocalTime.now().getHour();

        if (hora < 12){
          return "Bom dia!";
        } else if (hora < 18){
           return "Boa tarde!";
        } else {
            return "Boa noite!";
        }
    }
}

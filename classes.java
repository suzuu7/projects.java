class Aluno {

    String nome;
    int idade;

    void apresentacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    void saudacao() {
        System.out.println("Olá aluno!");
    }
}

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.nome = "Maria";
        a1.idade = 16;

        a1.apresentacao();
        a1.saudacao();
    }
}

class Aluno {

    String nome;
    int idade;
    String dtNascimento;
    String telefone;
    String nomeResponsavel;

    void apresentacao() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de nascimento: " + dtNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Responsável: " + nomeResponsavel);
    }

    void saudacao() {

        int hora = java.time.LocalTime.now().getHour();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.nome = "João";
        a1.idade = 17;
        a1.dtNascimento = "10/05/2008";
        a1.telefone = "85999999999";
        a1.nomeResponsavel = "Carlos";

        a1.apresentacao();
        a1.saudacao();
    }
}

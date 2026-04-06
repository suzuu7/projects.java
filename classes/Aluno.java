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


class Pessoa {
    String nome;
    String fone;
    String cpf;

    Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, String fone, String cpf, String matricula) {
        super(nome, fone, cpf);
        this.matricula = matricula;
    }

    void aprende() {
        System.out.println(nome + " está aprendendo.");
    }
}

class Professor extends Aluno {
    String titulo;

    Professor(String nome, String fone, String cpf, String matricula, String titulo) {
        super(nome, fone, cpf, matricula);
        this.titulo = titulo;
    }

    void ensina() {
        System.out.println(nome + " está ensinando.");
    }
}

class Funcionario extends Pessoa {
    int cod;
    String funcao;

    Funcionario(String nome, String fone, String cpf, int cod, String funcao) {
        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    void desempenhaFuncao() {
        System.out.println(nome + " exerce a função de " + funcao);
    }
}

class Responsavel extends Pessoa {
    Aluno[] alunos;

    Responsavel(String nome, String fone, String cpf, Aluno[] alunos) {
        super(nome, fone, cpf);
        this.alunos = alunos;
    }
}

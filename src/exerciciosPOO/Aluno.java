package exerciciosPOO;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno criarCopia() {
        return new Aluno(this.nome, this.nota);
    }
}
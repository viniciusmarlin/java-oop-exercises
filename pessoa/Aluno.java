package pessoa;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, int matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.isBlank()) {
            this.curso = curso;
        }
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() +
                " anos e estudo " + curso + " (Matrícula: " + matricula + ").");
    }

    public void estudar() {
        if (isAcordado()) {
            System.out.println(getNome() + " está estudando " + curso + ".");
        } else {
            System.out.println(getNome() + " está dormindo e não pode estudar agora.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " -> Aluno[matricula: " + matricula + "; curso: " + curso + "]";
    }
}

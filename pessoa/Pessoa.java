package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private boolean acordado = true;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAcordado() {
        return acordado;
    }

    public void fazerAniversario() {
        if (acordado == true) {
            this.idade++;
            System.out.println("Feliz aniversario");
        } else {
            System.out.println("A pessoa tá dormindo");
        }
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void acordar() {
        if (this.acordado == false) {
            this.acordado = true;
            System.out.println("Acordei");
        } else
            System.out.println("já estou acordado.");

    }

    public void dormir() {
        if (this.acordado) {
            this.acordado = false;
            System.out.println("Dormi zZz...");
        } else
            System.out.println("A pessoa já está dormindo");

    }

    @Override
    public String toString() {
        String s = "Pessoa[";
        s += " nome: " + nome;
        s += "; idade: " + idade;
        s += "; cpf: " + cpf;
        s += "]";
        return s;
    }
}
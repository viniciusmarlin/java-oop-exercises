package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Carlos", 35, "111.222.333-44");
        Aluno a1 = new Aluno("Mariana", 22, "999.888.777-66", 202601, "Engenharia de Software");

        System.out.println("=== 1. TESTE DE APRESENTAÇÃO E TOSTRING ===");
        p1.apresentar();
        a1.apresentar();
        System.out.println(p1);
        System.out.println(a1);

        System.out.println("\n=== 2. TESTE DOS GETTERS E SETTERS ===");

        p1.setNome("Carlos Eduardo");
        p1.setIdade(36);
        p1.setCPF("000.111.222-33");

        a1.setMatricula(202602);
        a1.setCurso("Ciência da Computação");
        a1.setCurso("");

        System.out.println("Novo nome p1: " + p1.getNome() + " | Idade: " + p1.getIdade() + " | CPF: " + p1.getCPF());
        System.out.println("Nova matrícula a1: " + a1.getMatricula() + " | Curso mantido: " + a1.getCurso());

        System.out.println("\n=== 3. TESTE DE MÉTODOS EXCLUSIVOS DO ALUNO ===");
        a1.estudar();

        System.out.println("\n=== 4. TESTE DE ESTADOS (DORMIR, ACORDAR, ANIVERSÁRIO) ===");

        System.out.println("isAcordado antes: " + p1.isAcordado());
        p1.acordar();

        a1.dormir();
        a1.dormir();

        a1.fazerAniversario();
        a1.estudar();

        a1.acordar();
        a1.fazerAniversario();

        System.out.println("\n=== 5. PREENCHIMENTO OPCIONAL VIA SCANNER ===");
        preencherDados(scanner, p1, a1);

        System.out.println("\nEstado final dos objetos pós-scanner:");
        System.out.println(p1);
        System.out.println(a1);

        scanner.close();
    }

    private static void preencherDados(Scanner scanner, Pessoa pessoa, Aluno aluno) {
        System.out.println(">>> Atualizando dados da PESSOA:");
        System.out.print("Informe o Nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Informe a Idade: ");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe o CPF: ");
        pessoa.setCPF(scanner.nextLine());

        System.out.println("\n>>> Atualizando dados do ALUNO:");
        System.out.print("Informe o Curso: ");
        aluno.setCurso(scanner.nextLine());

        System.out.print("Informe a Matrícula: ");
        aluno.setMatricula(scanner.nextInt());
        scanner.nextLine();
    }
}
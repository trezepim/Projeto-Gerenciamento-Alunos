package main;

import classes.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];

        menu(sc, alunos);

        System.out.println("Encerrando sistema...");

        sc.close();
    }

    public static void menu(Scanner sc, Aluno[] alunos) {
        int opcao;
        int quant = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Imprimir um aluno");
            System.out.println("3 - Imprimir todos os alunos");
            System.out.println("4 - Alterar nota 1");
            System.out.println("5 - Alterar nota 2");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    quant = cadastrar(sc, alunos, quant);
                    break;
                case 2:
                    System.out.println(imprimirUm(sc, alunos));
                    break;
                case 3:
                    imprimirTodos(alunos, quant);
                    break;
                case 4:
                    System.out.println(alterarN1(sc, alunos, quant));
                    break;
                case 5:
                    System.out.println(alterarN2(sc, alunos, quant));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("- ERRO: Informe uma opção válida.");
                    break;
            }
        } while (opcao != 6);
    }

    public static int cadastrar(Scanner sc, Aluno[] alunos, int quant) {
        if (quant == alunos.length) {
            System.out.println("- ERRO: O vetor está cheio.");
            return quant;
        } else {
            System.out.println("\n   Cadastro de aluno");

            System.out.println("Informe o nome do aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Informe a matrícula do aluno: ");
            int matricula = sc.nextInt();

            System.out.println("Informe a primeira nota do aluno: ");
            double n1 = sc.nextDouble();

            System.out.println("Informe a segunda nota do aluno: ");
            double n2 = sc.nextDouble();

            Aluno novoAluno = new Aluno(nome, matricula, n1, n2);
            alunos[quant] = novoAluno;
            quant++;

            System.out.println("- SUCESSO: Aluno cadastrado.");

            return quant;
        }
    }

    public static String imprimirUm(Scanner sc, Aluno[] alunos) {
        System.out.println("\n   Imprimir um aluno");

        System.out.println("Informe o nome do aluno: ");
        sc.nextLine();
        String nome = sc.nextLine();

        for (Aluno aluno : alunos) {
            if (aluno != null && nome.equalsIgnoreCase(aluno.getNome())) {
                return "\nNome: " + aluno.getNome() +
                        "\nMédia: " + aluno.getMedia();
            }
        }
        return "- ERRO: Aluno não cadastrado.";
    }

    public static void imprimirTodos(Aluno[] alunos, int quant) {
        if (quant > 0) {
            System.out.println("\n   Todos os alunos");

            for (int i = 0; i < quant; i++) {
                System.out.println(alunos[i]);
            }
        } else {
            System.out.println("- ERRO: Nenhum aluno cadastrado.");
        }
    }


    public static String alterarN1(Scanner sc, Aluno[] alunos, int quant) {
        if (quant > 0) {
            System.out.println("\n   Alterar nota 1");

            System.out.println("Informe o nome do aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();

            for (int i = 0; i < quant; i++) {
                if (nome.equalsIgnoreCase(alunos[i].getNome())) {
                    System.out.println("\nNome: " + alunos[i].getNome());
                    System.out.println("Nota 1 atual: " + alunos[i].getN1());

                    System.out.println("\nInforme o novo valor da nota 1: ");
                    double n1 = sc.nextDouble();

                    alunos[i].setN1(n1);

                    return "- SUCESSO: Nota 1 alterada." +
                            "\n\nNome: " + alunos[i].getNome() +
                            "\nNova nota 1: " + alunos[i].getN1();
                }
            }
            return "- ERRO: Aluno não encontrado.";
        }
        return "- ERRO: Nenhum aluno cadastrado.";
    }

    public static String alterarN2(Scanner sc, Aluno[] alunos, int quant) {
        if (quant > 0) {
            System.out.println("\n   Alterar nota 2");

            System.out.println("Informe o nome do aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();

            for (int i = 0; i < quant; i++) {
                if (nome.equalsIgnoreCase(alunos[i].getNome())) {
                    System.out.println("\nNome: " + alunos[i].getNome());
                    System.out.println("Nota 2 atual: " + alunos[i].getN2());

                    System.out.println("\nInforme o novo valor da nota 2: ");
                    double n2 = sc.nextDouble();

                    alunos[i].setN2(n2);

                    return "- SUCESSO: Nota 2 alterada." +
                            "\n\nNome: " + alunos[i].getNome() +
                            "\nNova nota 2: " + alunos[i].getN2();
                }
            }
            return "- ERRO: Aluno não encontrado.";
        }
        return "- ERRO: Nenhum aluno cadastrado.";
    }
}
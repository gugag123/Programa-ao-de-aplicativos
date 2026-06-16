package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.applcation;

import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.*;
import Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static void menu() {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo();
        int opcao = -1;

        do {
            System.out.println("Menu Biblioteca");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            // TryCatch 1 — leitura do menu principal
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros!");
                sc.nextLine(); // limpa o buffer
                opcao = -1;   // evita sair do loop
                continue;     // volta pro início do loop
            }

            switch (opcao) {

                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();

                    // TryCatch 2 — leitura da matrícula
                    try {
                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        sc.nextLine();

                        Aluno aluno = new AlunoComum(nome, matricula, false, 0);
                        alunos.add(aluno);
                        System.out.println("Aluno cadastrado com sucesso!");

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Matrícula deve ser um número inteiro!");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();

                    // TryCatch 3 — leitura do código do livro
                    try {
                        System.out.print("Código do livro: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();

                        Livro livro = new Livro(titulo, codigo, true);
                        livros.add(livro);
                        System.out.println("Livro cadastrado com sucesso!");

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Código deve ser um número inteiro!");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    // TryCatch 4 — leitura da matrícula e código no empréstimo
                    try {
                        System.out.print("Matrícula do aluno: ");
                        int mat = sc.nextInt();

                        System.out.print("Código do livro: ");
                        int cod = sc.nextInt();
                        sc.nextLine();

                        Aluno alunoEncontrado = null;
                        Livro livroEncontrado = null;

                        for (Aluno a : alunos) {
                            if (a.getMatricula() == mat) {
                                alunoEncontrado = a;
                                break;
                            }
                        }

                        for (Livro l : livros) {
                            if (l.getCodigoLivro() == cod) {
                                livroEncontrado = l;
                                break;
                            }
                        }

                        ResultadoEmprestimo resultado =
                                emprestimo.realizarEmprestimo(alunoEncontrado, livroEncontrado);

                        System.out.println("Resultado: " + resultado);

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Matrícula e código devem ser números inteiros!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    System.out.println("Alunos cadastrados:");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : alunos) {
                            a.exibirDados();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Livros cadastrados:");
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Livro l : livros) {
                            System.out.println("Título: " + l.getTituloLivro());
                            System.out.println("Código: " + l.getCodigoLivro());
                            System.out.println("Disponível: " + l.isLivroDisponivel());
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("⚠Opção inválida!");
            }

        } while (opcao != 0);
        sc.close();
    }
}
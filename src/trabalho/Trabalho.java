package trabalho;

import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        double notas[][] = new double [5][3];
        double media[] = new double[5];
        String alunos[] = new String [5];
        String nome;
        int opcao = 0, controle=0;
        double soma;
        int alterar = 0;
        int excluir = 0;
        int calcular = 0;
        
        Scanner leia = new Scanner(System.in);
        
        do {
        System.out.println(" __________________________________");
        System.out.println("|             M E N U              |");
        System.out.println("|                                  |");
        System.out.println("|           1. Adicionar           |");
        System.out.println("|           2. Listar              |");
        System.out.println("|           3. Calcular média      |");
        System.out.println("|           4. Alterar             |");
        System.out.println("|           5. Excluir             |");
        System.out.println("|           6. Ordenar             |");
        System.out.println("|           7. Sair                |");
        System.out.println("|__________________________________|");
        
        System.out.println("Escolha uma das opção:");
        opcao = leia.nextInt();
        
            if (opcao == 1) {
                if (controle >= 5) {
                    System.out.println("Registro cheio!");
                } else {
                    System.out.println("Informe o nome do(a) aluno(a):");
                    nome = leia.next();
                    alunos[controle] = nome;
                    soma = 0;
                    for (int i = 0; i <= 2 ; i++) {
                        System.out.println("Infome a nota"+(i+1)+" do(a) aluno(a) "+(alunos[controle]+":"));
                        notas[controle][i] = leia.nextDouble();
                        soma = soma + notas[controle][i];
                    }
                media[controle] = soma/3;
                controle++;
                }
            }
            
            if (opcao == 2) {
                if (controle == 0) {
                    System.out.println("Registro vazio");                    
                } else {
                    for (int i = 0; i < controle; i++) {
                        System.out.println("_______________________________");
                        System.out.print("| "+alunos[i]+" |");
                        for (int j = 0; j < 3; j++) {
                            System.out.print("| "+notas[i][j]+" |");
                        }
                        System.out.print(media[i]+" |");
                        System.out.println("_______________________________");
                    }
                }
            }
            
            if (opcao == 3) {
                do {
                    System.out.println("Informe o indice que deseja calcular a média do aluno:");
                    calcular = leia.nextInt();
                } while ((calcular < 0) && (calcular > controle));
                soma = 0;
                for (int i = calcular; i < controle; i++) {
                    for (int j = 0; j <= 2; j++) {
                         soma = soma + notas[calcular][j];
                    }
                }
                System.out.println("média do indice "+calcular+" é: "+soma/3);
            }
            
            if (opcao == 4) {
                do {
                    System.out.println("Qual indice alterar?");
                    alterar = leia.nextInt();
                } while ((alterar < 0) && (alterar > controle));
                System.out.println("Qual novo aluno:");
                nome = leia.next();
                alunos[alterar] = nome;
                for (int i = 0; i <= 2; i++) {
                    System.out.println("nota "+(i+1)+":");
                    notas[alterar][i] = leia.nextDouble();
                }
            }
            
            if (opcao == 5) {
                do {
                    System.out.println("Qual indice excluir?");
                    excluir = leia.nextInt();
                } while ((excluir < 0) && (excluir > controle));
                for (int i = excluir; i < controle - 1; i++) {
                    alunos[i] = alunos[i + 1];
                    for (int j = 0; j <= 2; j++) {
                        notas[i][j] = notas[i +1][j];
                    }
                }
                controle--; 
            }
            
            if (opcao == 6) {
                System.out.println("Está opção ainda está em fase de desenvolvimento.");
            }
        } while (opcao != 7);
        
    }
    
}

package com.company;


import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Descrição: Uma empresa quer verificar se seus empregados estão qualificados para a aposentadoria ou não. Para um empregado estar em condições de se aposentar, um dos seguintes requisitos deve ser satisfeito:Ter no mínimo 65 anos de idade.OU Ter trabalhado no mínimo 30 anos.OU Ter no mínimo 60 anos E ter trabalhado no mínimo 25 anos.
        int n;
        int anoAtual = 2021;

        System.out.print("Quantos funcionarios deseja cadastrar? ");
        n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        int[] anoIngresso = new int[n];
        int[] anoNascimento = new int[n];
        int[] tempoTrabalho = new int[n];




        for (int i = 0; i < n; i++){
            System.out.print("Funcionario(a): ");
            nome[i] = scan.next();
            System.out.print( "Ano de Nascimento: ");
            anoNascimento[i] = scan.nextInt();
            System.out.print( "Ano de Ingresso: ");
            anoIngresso[i] = scan.nextInt();

        }
        for (int i = 0;i < n; i++){
            idade[i] = anoAtual - anoNascimento[i];
        }
        for (int i = 0; i < n; i++){
            tempoTrabalho[i] = anoAtual - anoIngresso[i];
        }//condição para análise.
        for (int i = 0;i < n; i++){
            if ((idade[i] >= 65)||(tempoTrabalho[i] >=30)){
                System.out.println();
                System.out.println("Nome: " + nome[i] + ", idade " + idade[i] + " anos, tempo de trabalho "+ tempoTrabalho[i] + " anos, situação: Requer aposentadoria.");
            } else if ((idade[i] >= 60) && (tempoTrabalho[i] >= 30)){
                System.out.println();
                System.out.println("Nome: " + nome[i] + ", idade: " + idade[i] + " anos, tempo de trabalho: "+ tempoTrabalho[i] + " anos, situação: Requer aposentadoria.");

            }else{
                System.out.println();
                System.out.println("Nome: " + nome[i] + ", idade: " + idade[i] + " anos, tempo de trabalho: "+ tempoTrabalho[i] + " anos, situação: Não requer aposentadoria.");
            }

        }
    }
}

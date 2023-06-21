package geral;

import entities.notes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        notes student = new notes();

        System.out.println("Qual seu nome: ");
        sc.next();
        System.out.println("Digite a nota dos três trimestres do ano: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("REPETIU!!");
            System.out.printf("Faltam %.2f pontos%n", student.faltamPontos());
        }else{
            System.out.println("PASSOU!!");
        }
        
        sc.close();

    }
}

package list.exercicios;
/*Utilizando listas, fazer um programa que faça 5 perguntas para
 uma pessoa sobre um crime. As perguntas são:
 1 - Telefonou para a vítima?
 2 - Esteve no local do crime?
 3 - Mora perto da vítima?
 4 - Devia para a vítima?
 5 - Ja trabalhou com a vitima?
 Se a pessoa responder positivamente a 2 questões ela deve ser
 classificada  como "Suspeita", entre 3 e 4 como "Cumplice" e 5
 como "Assassina". Caso contrário, ela será classificada como "Inocente".
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        System.out.println("Telefonou para a vitima? S/N");
        String resp1 = entrada.nextLine();
        respostas.add(resp1);
        System.out.println("Esteve no local do crime? S/N");
        String resp2 = entrada.nextLine();
        respostas.add(resp2);
        System.out.println("Mora perto da vitima? S/N");
        String resp3 = entrada.nextLine();
        respostas.add(resp3);
        System.out.println("Devia dinheiro para a vitima? S/N");
        String resp4 = entrada.nextLine();
        respostas.add(resp4);
        System.out.println("Ja trabalhou com a vitima? S/N");
        String resp5 = entrada.nextLine();
        respostas.add(resp5);

        Iterator<String> iterador = respostas.iterator();
        Integer sim=0;
        while(iterador.hasNext()) {
            String next = iterador.next();
            if (next.equalsIgnoreCase("s")) sim++;
        }

        if (sim == 5){
            System.out.println("Você é Assassino!");
        } else if( sim < 5 && sim >= 3){
            System.out.println("Você é Cumplice");
        } else if (sim == 2){
            System.out.println("Você é Suspeito");
        } else{
            System.out.println("Você é Inocente");
        }
    }
}

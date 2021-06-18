package set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        // Dada um lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Criando um conjunto do tipo LinkedHashSet e adicionando as notas...");
        Set<Double> notas = new LinkedHashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        // vai imprimir seguindo a ordem de inserção
        System.out.println(notas);

        System.out.println("Conferindo se a notas 5.0 esta no conjunto");
        System.out.println(notas.contains(5.0));

        System.out.println("Mostrando a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Mostrando a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Somando todas as notas do conjunto");
        notas.iterator();
        Iterator<Double> iterador = notas.iterator();
        Double soma = 0d;
        while(iterador.hasNext()){
            Double next = iterador.next();
            soma+= next;
        }
        System.out.println("Soma = "+soma);

        System.out.println("Mostrando a média das notas do conjunto");
        System.out.println("Média = "+ soma/ notas.size());

        System.out.println("Removendo a nota 0.0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7.0 do conjuento");
        notas.iterator();
        Iterator<Double> novo_iterador = notas.iterator();
        while(novo_iterador.hasNext()){
            Double next = novo_iterador.next();
            if (next < 7) novo_iterador.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando todos os elementos do conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verificando se o conjunto esta vazio");
        System.out.println(notas.isEmpty());
    }
}

package set.exercicios;
/*Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e
IDE. Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene
esse conjunto por:
- Ordem de Inserção
- Ordem Natural (nome)
- IDE
- Ano de criação e nome
- Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.

 */

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
            add(new LinguagemFavorita("Ruby", 1993, "Ruby On Rails"));
            add(new LinguagemFavorita("Java", 1991,"IntelliJ" ));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita(".NET",1999, "Visual Studio Code"));
        }};
        System.out.println(linguagem);
        for (LinguagemFavorita ling : linguagem) System.out.println(ling.getNome());
        System.out.println();

        System.out.println("Ordem de inserção:");
        Set<LinguagemFavorita> linguagem2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Ruby", 1993, "Ruby On Rails"));
            add(new LinguagemFavorita("Java", 1991,"IntelliJ" ));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita(".NET",1999, "Visual Studio Code"));
        }};

        for(LinguagemFavorita lin : linguagem2) System.out.println(lin.getNome());

        System.out.println();
        System.out.println("Ordem Natural");

        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(linguagem);
        for(LinguagemFavorita ling: linguagem3) System.out.println(ling.getNome());

        System.out.println();
        System.out.println("Ordem por IDE");

        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparadorIDE());
        linguagem4.addAll(linguagem);
        for(LinguagemFavorita ling : linguagem4) System.out.println(ling);
        System.out.println();

        System.out.println("Ordem por Ano/Nome");
        Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparadorAnoNome());
        linguagem5.addAll(linguagem);
        for (LinguagemFavorita ling: linguagem5) System.out.println(ling);

        System.out.println();
        System.out.println("Ordem por Nome/Ano/IDE");
        Set<LinguagemFavorita> linguagem6 = new TreeSet<>(new ComparadorNomeAnoIDE());
        linguagem6.addAll(linguagem);
        for(LinguagemFavorita ling: linguagem6) System.out.println(ling);
    }
}

class ComparadorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class ComparadorAnoNome implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = o1.getAnoCriacao().compareTo(o2.getAnoCriacao());
        if(ano != 0) return ano;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
class ComparadorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int ano = o1.getAnoCriacao().compareTo(o2.getAnoCriacao());
        if (ano != 0) return ano;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}



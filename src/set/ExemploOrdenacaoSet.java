package set;

import java.util.*;

/* Dadas as seguintes informações sobre minhas séries favoritas. Crie
    um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de duração);

    Serie 1 = nome: Game of Thrones, genero: Fantasia, tempoDuracao: 60
    Serie 2 = nome: Dark, genero: Sci-Fi, tempoDuracao: 60
    Serie 3 = nome: That '70s Show, genero: comedia, tempoDuracao: 20
    Serie 4 = nome: The Wire, genero: policial, tempoDuracao: 60
    Serie 5 = nome: The Sopranos, genero: drama, tempoDuracao: 60
    Serie 6 = nome: Fleabag, genero: comedia, tempoDuracao: 25
     */
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Em Ordem Aleatória");
        Set<Serie>  minhasSeries = new HashSet<>(){{
            add(new Serie("Game of Thrones","fantasia", 60));
            add(new Serie("Dark","sci-fi", 60));
            add(new Serie("That '70s Show","comédia", 20));
            add(new Serie("The Wire","policial", 60));
            add(new Serie("The Sopranos","drama", 60));
            add(new Serie("Fleabag","comédia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");

        System.out.println();
        System.out.println("Em Ordem de Inserção");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Game of Thrones","fantasia", 60));
            add(new Serie("Dark","sci-fi", 60));
            add(new Serie("That '70s Show","comédia", 20));
            add(new Serie("The Wire","policial", 60));
            add(new Serie("The Sopranos","drama", 60));
            add(new Serie("Fleabag","comédia", 25));
        }};
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");

        System.out.println();
        System.out.println("Em Ordem Natural");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);

        for (Serie serie: minhasSeries3) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");

        System.out.println();
        System.out.println("Ordem por Nome/Genero/TempoDuração");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparadorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");
        System.out.println();
        System.out.println("Ordem por Gênero");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparadorGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");


        System.out.println();
        System.out.println("Ordem por Tempo de Duração");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparadorTempoDuracao());
        minhasSeries6.addAll(minhasSeries);
        for (Serie serie: minhasSeries6) System.out.println(serie.getNome()+" - "
                + serie.getGenero()+ " - "+serie.getTempoDuracao()+" min");



    }
}


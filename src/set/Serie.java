package set;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoDuracao;

    public Serie(String nome, String genero, Integer tempo){
        this.nome = nome;
        this.genero = genero;
        this.tempoDuracao = tempo;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public Integer getTempoDuracao(){
        return tempoDuracao;
    }
    @Override
    public String toString(){
        return "{"+
                "nome = "+ nome +
                ", gênero = "+ genero +
                ", tempo de duração = "+ tempoDuracao +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoDuracao, serie.tempoDuracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDuracao);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoDuracao(), serie.getTempoDuracao());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

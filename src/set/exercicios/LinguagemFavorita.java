package set.exercicios;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita lf) {
        return this.nome.compareTo(lf.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemFavorita)) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoCriacao, that.anoCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }


}

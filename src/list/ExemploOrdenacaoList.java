package list;
/* Dadas as seguintes informações sobre meus gatos, criar
    uma lista e ordena-la exibindo:
    (nome - cor - idade)

    Gato 1 = nome: Jon, idade: 18, cor: preto
    Gato 2 = nome: Simba, idade: 6, cor: tigrado
    Gato 3 = nome: Jon, idade 12, cor: amarelo
    Gato 4 = nome: snow, idade 8, cor: branco
     */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato ("Jon", 12, "amarelo"));
            add(new Gato("Snow", 8, "branco"));
        }};
        System.out.println("Ordem de Inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de Idade:");
        //Collections.sort(meusGatos, new ComparadorIdade() );
        meusGatos.sort(new ComparadorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem de Cor:");
        Collections.sort(meusGatos, new ComparadorCor());
        //meusGatos.sort(new ComparadorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Co/Idade:");
        meusGatos.sort(new ComparadorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }

    public String getCor(){
        return this.cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparadorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparadorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparadorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome !=0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;


        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
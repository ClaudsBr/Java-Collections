package map;
/* Dadas as seguintes informações sobre meus livros favoritos
e seus autores. Crie um dicionário e ordene este dicionario:
Exibindo (Nome Autor - Nome Livro);
- Autor = Hawking, Stephen - Livro = nome: Uma Breve História do tempo, paginas: 256
- Autor = Duhrig, Charles - Livro = nome: O Poder do Hábito, paginas: 408
- Autor = Turing, Alan - Livro = nome: Mathematical Logic, paginas: 416
- Autor = Harari, Yuval Noah - Livro = nome: 21 Lições Para o Século 21, paginas: 432
- Autor = Nietzsche, Friedrich - Livro = nome: Crepusculo do Idolos, paginas: 208

 */

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória:");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro( "Uma Breve História do tempo", 256));
            put("Duhrig, Charles", new Livro("O Poder do Hábito", 408));
            put("Turing, Alan", new Livro("Mathematical Logic", 416));
            put ("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21",432));
            put("Nietzsche, Friedrich", new Livro("Crepusculo do Idolos, paginas", 208));
        }};
        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()) System.out.println(livro.getKey()
                +" - "+ livro.getValue().getNome());

        System.out.println();
        System.out.println("Ordem de Inserção");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro( "Uma Breve História do tempo", 256));
            put("Duhrig, Charles", new Livro("O Poder do Hábito", 408));
            put("Turing, Alan", new Livro("Mathematical Logic", 416));
            put ("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21",432));
            put("Nietzsche, Friedrich", new Livro("Crepusculo do Idolos, paginas", 208));
        }};;

        for(Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());

        System.out.println();

        System.out.println("Ordem Natural:");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());

        System.out.println();

        System.out.println("Ordem por livro");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparadorNomeLivro());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        System.out.println();

        System.out.println("Ordem por numero de paginas");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparadorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros4)
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome()
                    + " - "+livro.getValue().getPaginas()+" páginas");
        System.out.println();





    }
}
class ComparadorNomeLivro implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}
class ComparadorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {

        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}
package map;
/* Dados as seguintes informações de id e contato, crie um dicionario e o ordene
exibindo (Nome id - Nome contato):

- id = 1 - Contato = nome: Claudio, email: claudios@email.com, celular: 9999-7777;
- id = 5 - Contato = nome: Julia, email: juju@email.com, celular: 9888-6666;
- id = 8 - Contato = nome: Alan, email: alanzim@email.com, celular: 8877-5555;
- id = 3 - Contato = nome: Andreia, email: deia@email.com, celular: 7777-4444;
 */

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Claudio","claudios@email.com", 99997777));
            put(5, new Contato("Julia","juju@email.com", 98886666));
            put(8, new Contato("Alan", "alanzim@email.com", 88775555));
            put(3, new Contato("Andreia", "deia@email.com", 77774444));
            put(7, new Contato("Suelen", "su_2021@email.com", 66663333));

        }};

        for(Map.Entry<Integer,Contato> entry: agenda.entrySet()) System.out.println("id: "+
                entry.getKey()+ "\nnome: "+ entry.getValue().getNome()+"\ne-mail:"+
                        entry.getValue().getEmail()+ "\ncelular: "+entry.getValue().getCelular()+"\n");
        System.out.println();

        System.out.println("Ordem de Inserção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Claudio","claudios@email.com", 99997777));
            put(5, new Contato("Julia","juju@email.com", 98886666));
            put(8, new Contato("Alan", "alanzim@email.com", 88775555));
            put(3, new Contato("Andreia", "deia@email.com", 77774444));
            put(7, new Contato("Suelen", "su_2021@email.com", 66663333));
        }};

        for(Map.Entry<Integer,Contato> entry: agenda1.entrySet()) System.out.println("id: "+
                entry.getKey()+ "\nnome: "+ entry.getValue().getNome()+"\ne-mail:"+
                entry.getValue().getEmail()+ "\ncelular: "+entry.getValue().getCelular()+"\n");

        System.out.println();

        System.out.println("Ordem Natural");

        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda1);
        for(Map.Entry<Integer,Contato> entry: agenda2.entrySet()) System.out.println("id: "+
                entry.getKey()+ "\nnome: "+ entry.getValue().getNome()+"\ne-mail:"+
                entry.getValue().getEmail()+ "\ncelular: "+entry.getValue().getCelular()+"\n");

        System.out.println("Ordem por numero de telefone");
        // utilizando classe anonima
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getCelular(),c2.getValue().getCelular());
            }
        });
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set) {
            System.out.println("id: "+ entry.getKey()+"\nnome: "+ entry.getValue().getNome()+
                    "\ne-mail: "+entry.getValue().getEmail()+"\ncelular: "
                    + entry.getValue().getCelular()+ "\n");
        }

        System.out.println();
        System.out.println("Ordem por nome");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return o1.getValue().getNome().compareTo(o2.getValue().getNome());
            }
        });
        set1.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry:set1){
            System.out.println("id: "+ entry.getKey()+"\nnome: "+ entry.getValue().getNome()+
                    "\ne-mail: "+entry.getValue().getEmail()+"\ncelular: "
                    + entry.getValue().getCelular()+ "\n");
        }

        System.out.println();
        System.out.println("Ordem por telefone usando uma interface funcional");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> contato) {
                        return contato.getValue().getCelular();
                    }
                }
        ));
        set2.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set2){
            System.out.println("id: "+ entry.getKey()+"\nnome: "+ entry.getValue().getNome()+
                    "\ne-mail: "+entry.getValue().getEmail()+"\ncelular: "
                    + entry.getValue().getCelular()+ "\n");
        }

        System.out.println("Ordenando por email usando lambda");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getEmail())); // Lambda Function

        set3.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set3){
            System.out.println("id: "+ entry.getKey()+"\nnome: "+ entry.getValue().getNome()+
                    "\ne-mail: "+entry.getValue().getEmail()+"\ncelular: "
                    + entry.getValue().getCelular()+ "\n");
        }

    }
}

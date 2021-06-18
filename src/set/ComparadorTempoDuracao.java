package set;

import java.util.Comparator;

public class ComparadorTempoDuracao implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        int tempo = o1.getGenero().compareTo(o2.getGenero());
        if(tempo != 0) return tempo;

        return Integer.compare(o1.getTempoDuracao(), o2.getTempoDuracao());
    }
}

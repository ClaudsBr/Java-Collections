package set;

import java.util.Comparator;

public class ComparadorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(serie1.getTempoDuracao(), serie2.getTempoDuracao());
    }
}

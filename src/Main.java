import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Tamasha");
//        list.add("Teatr");
//        list.add("Sinema");
//        list.add("Film");
//       List<String> sozler= list.stream().map(word->new StringBuilder(word).reverse().toString()).toList();
//        System.out.println(sozler);
//        1.
        Film film = new Film("BoyukDayaq", "dram",1979);
        Film film2 = new Film("OgeyAna", "dram",1979);
        Film film3 = new Film("CebishMuellim", "dram",1979);
        Film film4 = new Film("Ehmed", "comedi",1965);

        FilmCollection filmCollection=new FilmCollection();
        filmCollection.addFilm(film);
        filmCollection.addFilm(film2);
        filmCollection.addFilm(film3);
        filmCollection.addFilm(film4);
        System.out.println(filmCollection.janraGoreFilm("dram"));
        filmCollection.delete(film2);;
        System.out.println(filmCollection.janraGoreFilm("dram"));
        System.out.println(filmCollection.getAll());
        }
    }

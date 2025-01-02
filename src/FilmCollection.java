import java.util.*;

public class FilmCollection {

    List<Film> list = new ArrayList<>();
    Set<String> set =new HashSet<>();
    Map <String, List<Film>> filmMap= new HashMap<>();

    public void addFilm(Film film){     // bu metod geri true false qaytarir
        if (set.add(film.getFilmAdi())){
            list.add(film);
            if (!filmMap.containsKey(film.getJanrIl())){
                filmMap.put(film.getJanrIl(),new ArrayList<>()); //eger janr yoxdursa bow yer aciriq
            }
            filmMap.get(film.getJanrIl()).add(film);
        }

    }
    public List<Film> janraGoreFilm(String janr){
        return filmMap.get(janr);

    }
    public void delete(Film film){
        list.remove(film);
        set.remove(film);
        filmMap.get(film.getJanrIl()).remove(film);

    }
    public List<Film> getAll (){
        return list;

    }
}

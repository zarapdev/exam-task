public class Film {
    private String filmAdi;
    private String janrIl;
    private int il;

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getJanrIl() {
        return janrIl;
    }

    public void setJanrIl(String janrIl) {
        this.janrIl = janrIl;
    }

    public int getIl() {
        return il;
    }

    public void setIl(int il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmAdi='" + filmAdi + '\'' +
                ", janrIl='" + janrIl + '\'' +
                ", il=" + il +
                '}';
    }

    public Film(String filmAdi, String janrIl, int il) {
        this.filmAdi = filmAdi;
        this.janrIl = janrIl;
        this.il = il;

    }

    }


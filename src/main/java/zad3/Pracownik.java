package zad3;

public class Pracownik {
    private String imie;
    private Plec plec;
    private Departament departament;
    private Integer pensja;

    public Pracownik(String imie, Plec plec, Departament departament, Integer pensja) {
        this.imie = imie;
        this.plec = plec;
        this.departament = departament;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Integer getPensja() {
        return pensja;
    }

    public void setPensja(Integer pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "'" + imie + '\'' +
                ", " + plec +
                ", " + departament +
                ", " + pensja +
                '}';
    }
}

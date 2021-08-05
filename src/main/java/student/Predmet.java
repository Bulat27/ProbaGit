package student;

public class Predmet {

    private int brojStudenata;
    private String imeProfesora;

    public Predmet(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }
}

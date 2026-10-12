package com.example.quizrekordy;
import com.google.gson.annotations.SerializedName;

public class Rekord {
    @SerializedName("dziedzina")
    private String dziedzina;
    @SerializedName("rekordzista")
    private String rekordzista;
    @SerializedName("rok")
    private String rok;
    @SerializedName("rekordowy_wynik")
    private String rekordowy_wynik;

    public Rekord(String dziedzina, String rekordzista, String rok, String rekordowy_wynik) {
        this.dziedzina = dziedzina;
        this.rekordzista = rekordzista;
        this.rok = rok;
        this.rekordowy_wynik = rekordowy_wynik;
    }

    public String getDziedzina() {
        return dziedzina;
    }

    public void setDziedzina(String dziedzina) {
        this.dziedzina = dziedzina;
    }

    public String getRekordzista() {
        return rekordzista;
    }

    public void setRekordzista(String rekordzista) {
        this.rekordzista = rekordzista;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getRekordowy_wynik() {
        return rekordowy_wynik;
    }

    public void setRekordowy_wynik(String rekordowy_wynik) {
        this.rekordowy_wynik = rekordowy_wynik;
    }
}

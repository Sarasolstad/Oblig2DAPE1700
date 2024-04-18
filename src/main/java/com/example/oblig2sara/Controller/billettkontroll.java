package com.example.oblig2sara.Controller;

public class billettkontroll {

    private String valgtFilm;
    private int velgAntall;
    private String valgtNavn;
    private String valgtEtternavn;
    private String valgtEpost;
    private String valgtTelefon;

    public billettkontroll(String valgtFilm, int velgAntall, String valgtNavn, String valgtEtternavn, String valgtEpost, String valgtTelefon) {
        this.valgtFilm = valgtFilm;
        this.velgAntall = velgAntall;
        this.valgtNavn = valgtNavn;
        this.valgtEtternavn = valgtEtternavn;
        this.valgtEpost = valgtEpost;
        this.valgtTelefon = valgtTelefon;
    }

    public String getValgtFilm() {
        return valgtFilm;
    }

    public void setValgtFilm(String valgtFilm) {
        this.valgtFilm = valgtFilm;
    }

    public int getVelgAntall() {
        return velgAntall;
    }

    public void setVelgAntall(int velgAntall) {
        this.velgAntall = velgAntall;
    }

    public String getValgtNavn() {
        return valgtNavn;
    }

    public void setValgtNavn(String valgtNavn) {
        this.valgtNavn = valgtNavn;
    }

    public String getValgtEtternavn() {
        return valgtEtternavn;
    }

    public void setValgtEtternavn(String valgtEtternavn) {
        this.valgtEtternavn = valgtEtternavn;
    }

    public String getValgtEpost() {
        return valgtEpost;
    }

    public void setValgtEpost(String valgtEpost) {
        this.valgtEpost = valgtEpost;
    }

    public String getValgtTelefon() {
        return valgtTelefon;
    }

    public void setValgtTelefon(String valgtTelefon) {
        this.valgtTelefon = valgtTelefon;
    }
}

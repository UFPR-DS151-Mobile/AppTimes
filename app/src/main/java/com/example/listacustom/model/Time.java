package com.example.listacustom.model;

public class Time {
    private int logoTime;
    private String nomeTime;
    private String nomeCid;
    private String nomeEst;
    private String[] titulos;

    public Time(){

    }

    public Time(int logoTime, String nomeTime, String nomeCid, String nomeEst, String[] titulos) {
        this.logoTime = logoTime;
        this.nomeTime = nomeTime;
        this.nomeCid = nomeCid;
        this.nomeEst = nomeEst;
        this.titulos= titulos;
    }

    public int getLogoTime() {
        return logoTime;
    }

    public void setLogoTime(int logoTime) {
        this.logoTime = logoTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNomeCid() {
        return nomeCid;
    }

    public void setNomeCid(String nomeCid) {
        this.nomeCid = nomeCid;
    }

    public String getNomeEst() {
        return nomeEst;
    }

    public void setNomeEst(String nomeEst) {
        this.nomeEst = nomeEst;
    }

    public String[] getTitulos() {
        return titulos;
    }

    public void setTitulos(String[] titulos) { this.titulos = titulos; }
}

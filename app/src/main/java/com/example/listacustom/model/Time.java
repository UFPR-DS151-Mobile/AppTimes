package com.example.listacustom.model;

public class Time {
    private int logoTime;
    private String nomeTime;
    private String nomeCid;
    private String nomeEst;

    public Time(){

    }

    public Time(int logoTime, String nomeTime, String nomeCid, String nomeEst) {
        this.logoTime = logoTime;
        this.nomeTime = nomeTime;
        this.nomeCid = nomeCid;
        this.nomeEst = nomeEst;
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
}

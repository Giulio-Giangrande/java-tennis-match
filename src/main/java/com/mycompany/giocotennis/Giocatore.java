package com.mycompany.giocotennis;

public class Giocatore {
    private String nome;
    private int punti;

    public Giocatore(String nome) {
        this.nome = nome;
        this.punti = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPunti() {
        return punti;
    }

    public void aggiungiPunto() {
        punti++;
    }
}
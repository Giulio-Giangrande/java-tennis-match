package com.mycompany.giocotennis;

public class GiocoTennis {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Punteggio punteggio;

    public GiocoTennis(String nomeGiocatore1, String nomeGiocatore2) {
        this.giocatore1 = new Giocatore(nomeGiocatore1);
        this.giocatore2 = new Giocatore(nomeGiocatore2);
        this.punteggio = new Punteggio();
    }

    public void puntoPer(String nomeGiocatore) {
        if (giocatore1.getNome().equals(nomeGiocatore)) {
            giocatore1.aggiungiPunto();
        } else if (giocatore2.getNome().equals(nomeGiocatore)) {
            giocatore2.aggiungiPunto();
        }
    }

    private String NomeInVantaggio() {
        if (giocatore1.getPunti() > giocatore2.getPunti()) {
            return giocatore1.getNome();
        }
        return giocatore2.getNome();
    }

    private String vantaggioPer() {
        if (Math.abs(giocatore1.getPunti() - giocatore2.getPunti()) == 1) {
            return "vantaggio per " + this.NomeInVantaggio();
        }
        return "vittoria per " + this.NomeInVantaggio();
    }

    public String getPunteggio() {
        String punteggioGiocatore1 = punteggio.descriviPunteggio(giocatore1.getPunti());
        String punteggioGiocatore2 = punteggio.descriviPunteggio(giocatore2.getPunti());


        if (giocatore1.getPunti() == giocatore2.getPunti()) {
            if (giocatore1.getPunti() < 3){
                return punteggioGiocatore1 +" pari";
            } else {
                return "parità";
            }
        }
        else if (giocatore1.getPunti() + giocatore2.getPunti() >= 6) {
                return vantaggioPer();
        }
        return punteggioGiocatore1 + ", " + punteggioGiocatore2;
    }

    public static void main(String[] args) {
        GiocoTennis gioco = new GiocoTennis("Pippo", "Pluto");

        gioco.puntoPer("Pippo");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pippo");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");
        gioco.puntoPer("Pluto");

        System.out.println("Punteggio attuale: " + gioco.getPunteggio());
    }
}

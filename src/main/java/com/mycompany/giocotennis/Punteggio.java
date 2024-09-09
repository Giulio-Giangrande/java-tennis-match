package com.mycompany.giocotennis;

public class Punteggio {
    public String descriviPunteggio(int punti) {
        switch (punti) {
            case 0:
                return "zero";
            case 1:
                return "quindici";
            case 2:
                return "trenta";
            case 3:
                return "quaranta";
            default:
                return "vantaggio";
        }
    }
}

package Labo2.geheimschriften;

import Labo2.Codingstate;

public class Spiegeling implements Codingstate {


    public Spiegeling() {
    }

    public String coderen(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    public String decoderen(String text) {
        return  new StringBuilder(text).reverse().toString();
    }

    @Override
    public String toString() {
        return "Spiegeling";
    }
}


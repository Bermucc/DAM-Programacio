package com.exercici1301;

public class Mamifer extends Animal {
    protected  String tipusPelatge;
    public Mamifer (String nom, int edat, String tipusPelatge) {
        super(nom, edat);
        this.tipusPelatge = tipusPelatge;
    }

    @Override
    public String toString(){
        return "Nom: " + nom  + ", Edat: " + this.edat +" ,Color Plomatge: "+this.tipusPelatge;
    }
}


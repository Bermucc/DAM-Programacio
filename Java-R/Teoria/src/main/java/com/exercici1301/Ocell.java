package com.exercici1301;

public class Ocell extends Animal {
    protected  String colorPlomatge;

    public Ocell (String nom, int edat, String colorPlomatge){
        super(nom, edat);
        this.colorPlomatge = colorPlomatge;
    }

    @Override
    public String toString(){
        return "Nom: " + nom  + ", Edat: " + this.edat +" ,Color Plomatge: "+this.colorPlomatge;
    }
}

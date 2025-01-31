package com.exercici1301;

public abstract class Animal {
    protected String nom;
    protected  int edat;

    public Animal(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }

    public String toString(){
        return "Nom: " + this.nom + ", Edat: " + this.edat;
         
    }
}

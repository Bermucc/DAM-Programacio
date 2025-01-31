package com.exercici1301;

class Dofi extends Mamifer implements Nedador {
    public Dofi(String nom, int edat, String tipusPelatge){
        super(nom, edat, tipusPelatge);
        this.nom = nom;
    }

    @Override
    public void nedar(){
        System.out.println( nom +" esta nadando");
    }
}

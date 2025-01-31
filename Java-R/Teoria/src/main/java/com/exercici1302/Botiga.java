package com.exercici1302;

public class Botiga {
    private String nom;
    private String tipusProducte;

    public Botiga(String nom, String tipusProducte){
        this.nom = nom;
        this.tipusProducte = tipusProducte;
    }

    //Getter nom
    public String getNom(){
        return this.nom;
    }
    //Setter nom
    public void setNom(String nom){
        this.nom = nom;
    }
    //Getter tipusProducte
    public String getTipusProducte(){
        return this.tipusProducte;
    }
    //Setter tipusProducte
    public void setTipusProducte(String tipusProducte){
        this.tipusProducte = tipusProducte;
    }

    @Override
    public String toString(){
        return "Botiga[nom="+nom+",tipusProducte="+tipusProducte+"]";
    }
}

package com.exercici1302;

public class Restaurant {
    private String nom;
    private String tipusCuina;
    private int capacitat;
    
    public Restaurant (String nom, String tipusCuina, int capacitat){
        this.nom = nom;
        this.tipusCuina = tipusCuina;
        this.capacitat = capacitat;
    }

    //Getter nom
    public String getNom(){
        return this.nom;
    }
    //Setter nom
    public void setNom(String nom){
        this.nom = nom;
    }
    //Getter tipusCuina
    public String setTipusCuina(){
        return this.tipusCuina;
    }
    //Setter tipusCuina
    public void setTipusCuina(String tipusCuina){
        this.tipusCuina = tipusCuina;
    }
    //Getter capacitat
    public int getCapacitat(){
        return this.capacitat;
    }
    //Setter capacitat
    public void setCapacitat(int capacitat){
        this.capacitat = capacitat;
    }

    @Override
    public String toString(){
        return "Restaurant[nom="+nom+",tipusCuina="+tipusCuina+",capacitat="+capacitat+"]";
    }
}

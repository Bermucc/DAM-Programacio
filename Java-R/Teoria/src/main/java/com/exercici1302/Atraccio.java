package com.exercici1302;

public class Atraccio {
    private String nom;
    private String tipus;
    private int alturaMinima;

    public Atraccio(String nom, String tipus, int alturaMinima){
        this.nom = nom;
        this.tipus = tipus;
        this.alturaMinima = alturaMinima;
    }

    // Getter nom
    public String getNom(){
        return this.nom;
    }
    // Setter nom
    public void setNom(String nom){
        this.nom = nom;
    }
    // Getter tipus
    public String getTipus(){
        return this.tipus;
    }
    // Setter tipus
    public void setTipus(){
        this.tipus = tipus;
    }
    // Getter alturaMinima
    public int getAlturaMinima(){
        return this.alturaMinima;
    }
    // Setter alturaMinima
    public void setAlturaMinima(){
        this.alturaMinima = alturaMinima;
    }

    @Override
    public String toString(){
        return "Atraccio[nom="+nom+",tipus="+tipus+",alturaMinima="+alturaMinima+"]";
    }
}

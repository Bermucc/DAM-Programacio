package com.exercici1300;

public class Empleat {
    // Atributos
    private String nom;
    private String cognom;
    private double salariAnual;

    //Constructor de los valores de "Empleat"
    public Empleat(String nom, String cognom, Double salariAnual) {
        this.nom = nom;
        this.cognom = cognom;
        this.salariAnual = salariAnual;
    }

    // Funcion, no debe de ser estatica
    public String getNomComplet(){
        return this.nom + " " + this.cognom;
    }

    public void incrementarSalari(double percentatge){
        this.salariAnual += this.salariAnual * (percentatge / 100);
    }

    public double getSalariAnual() {
        return this.salariAnual;
    }
    
}

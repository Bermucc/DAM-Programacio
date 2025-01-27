package com.exercici1202;

public class Estudiant {
    // Atributos del estudiante
    private String nom;
    private int edat;
    private double notaMitjana;

    // Constructor del estudiante (Nombre y edat)
    public Estudiant(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    // Getter y Setters del alumno

    // Getter nom
    public String getNom() {
        return this.nom;
    }
    // Setter nom
    public void setNom(String nom) {
        this.nom = nom;
    }
    // Getter edat
    public int getEdat() {
        return this.edat;
    }
    // Setter edat
    public void setEdat(int edat) {
        this.edat = edat;
    }
    // Getter notaMitjana
    public double getNotaMitjana() {
        return this.notaMitjana;
    }
    // Setter notaMitjana
    public void setNotaMitjana(double notaMitjana) {
        this.notaMitjana = notaMitjana;
    }

    public Double actualizaNotaMitjana(double novaNota) {
        this.notaMitjana = calculaNotaMitjana(novaNota);
    }
    private void calculaNotaMitjana(double novaNota) {

    }
}

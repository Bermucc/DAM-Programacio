package com.exercici1200;

public class Cotxe {
    // Atributos del coche
    private String color;
    private String brand;
    private String model;
    private int cilindrada;
    private int year;

    // Getters i setters
    //GetColor
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Get Brand
    public String getBrand() {
        return this.color;
    }
    // Set Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Get Model
    public String getModel() {
        return this.model;
    }
    // Set Model
    public void setModel(String model) {
        this.model = model;
    }
    // Get Model
    public int getCilindrada() {
        return this.cilindrada;
    }
    // Set Model
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    // Get Year
    public int getYeat(){
        return this.year;
    }
    // Set Year
    public void setYear(int year){
        this.year = year;
    }
   
    @Override
    public String toString(){
        return "Model: " + this.model +";Color: " + this.color + ";Cilindrada: " + this.cilindrada + "; Any:" + this.year;
    }
}

package com.exercici1301;

class OcellVolador extends Ocell implements Volador {
    public OcellVolador (String nom, int edat, String colorPlomatge){
        super(nom, edat, colorPlomatge);
    }


    @Override
    public void volar(){
        System.out.println( this.nom+" , esta volando");
    }
}

package org.UQAM.Exercice_2;

public class TaxeSimple {
    private final double TAXE = 1.05;
    private String nomProduit;
    private double prixProduit;

    public TaxeSimple(String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public double prix(){
        return prixProduit * TAXE;
    }
}

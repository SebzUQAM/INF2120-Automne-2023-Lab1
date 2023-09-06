package org.UQAM.Exercice_2;

public class TaxeDouble {
    private final double TAXE = 1.09975;
    private String nomProduit;
    private double prixProduit;

    public TaxeDouble(String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public double prix(){
        return prixProduit * TAXE;
    }
}

package org.UQAM.Exercice_2;

public class NonTaxable {
    private String nomProduit;
    private double prixProduit;

    public NonTaxable(String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public double prix(){
        return prixProduit;
    }
}

package org.UQAM.Exercice_2;

import org.UQAM.Exercice_1.Couleur;

public class Principal {
    public static void main(String[] args){
        Facture facture = new Facture();

        facture.ajouterProduitNonTaxable(new NonTaxable("Article1", 100.00));
        facture.ajouterProduitNonTaxable(new NonTaxable("Article2", 12.55));
        facture.ajouterProduitNonTaxable(new NonTaxable("Article3", 55.03));
        facture.ajouterProduitNonTaxable(new NonTaxable("Article4", 75.00));
        facture.ajouterProduitNonTaxable(new NonTaxable("Article5", 10.99));

        facture.ajouterProduitTaxeSimple(new TaxeSimple("Article6", 45.00));
        facture.ajouterProduitTaxeSimple(new TaxeSimple("Article7", 85.89));

        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article8", 45.33));
        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article9", 6.99));
        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article10", 15.50));
        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article11", 9.40));
        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article12", 60.99));
        facture.ajouterProduitTaxeDouble(new TaxeDouble("Article13", 70.00));

        System.out.println(facture.prixTotal());
    }
}

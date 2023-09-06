package org.UQAM.Exercice_2;

public class Facture {
    private final String AVERTISSEMENT_TABLEAU_PLEIN = "!! L'élément n'a pas été ajouté car le tableau est plein !!";
    private final int LONGEUR_TABLEAU = 10;
    private NonTaxable[] nonTaxables = new NonTaxable[LONGEUR_TABLEAU];
    private int indexNonTaxables = 0;
    private TaxeSimple[] taxeSimples = new TaxeSimple[LONGEUR_TABLEAU];
    private int indexTaxeSimples = 0;
    private TaxeDouble[] taxeDoubles = new TaxeDouble[LONGEUR_TABLEAU];
    private int indexTaxeDoubles = 0;

    public void ajouterProduitNonTaxable( NonTaxable produit ){
        if(indexNonTaxables == nonTaxables.length){
            System.err.println(AVERTISSEMENT_TABLEAU_PLEIN);
        }
        nonTaxables[indexNonTaxables++] = produit;
    }

    public void ajouterProduitTaxeSimple( TaxeSimple produit ){
        if(indexTaxeSimples == taxeSimples.length){
            System.err.println(AVERTISSEMENT_TABLEAU_PLEIN);
        }
        taxeSimples[indexTaxeSimples++] = produit;
    }

    public void ajouterProduitTaxeDouble( TaxeDouble produit ){
        if(indexTaxeDoubles == taxeDoubles.length){
            System.err.println(AVERTISSEMENT_TABLEAU_PLEIN);
        }
        taxeDoubles[indexTaxeDoubles++] = produit;
    }

    public double prixTotal(){
        double prixTotal = 0;

        int index = 0;

        NonTaxable nonTaxable = nonTaxables[index];
        TaxeSimple taxeSimple = taxeSimples[index];
        TaxeDouble taxeDouble = taxeDoubles[index];

        boolean tousNull = nonTaxable == null;
        tousNull &= taxeSimple == null;
        tousNull &= taxeDouble == null;

        while(index < LONGEUR_TABLEAU && ! tousNull){
            tousNull = true;
            if(nonTaxable != null){
                prixTotal += nonTaxable.prix();
                tousNull = false;
            }
            if(taxeSimple != null){
                prixTotal += taxeSimple.prix();
                tousNull = false;
            }
            if(taxeDouble != null){
                prixTotal += taxeDouble.prix();
                tousNull = false;
            }
            nonTaxable = nonTaxables[++index];
            taxeSimple = taxeSimples[index];
            taxeDouble = taxeDoubles[index];
        }
        return Math.round(prixTotal * 100) / 100.00;
    }
}

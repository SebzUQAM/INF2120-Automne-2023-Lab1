package org.UQAM.Exercice_1;

public class Couleur {
    final int MAX_UNITE_COULEUR = 255;
    final int MIN_UNITE_COULEUR = 0;
    private int rouge;
    private int vert;
    private int bleu;

    public Couleur(int rouge, int vert, int bleu) {
        setRouge(rouge);
        setVert(vert);
        setBleu(bleu);
    }

    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        validerUniteCouleur(rouge);
        this.rouge = rouge;
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        validerUniteCouleur(vert);
        this.vert = vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setBleu(int bleu) {
        validerUniteCouleur(bleu);
        this.bleu = bleu;
    }

    private void validerUniteCouleur(int uniteCouleur){
        String messageErreur;
        if(uniteCouleur > MAX_UNITE_COULEUR || uniteCouleur < MIN_UNITE_COULEUR){
            messageErreur = String.format(
                    "Votre couleur doit être entre %s et %s"
                    , MIN_UNITE_COULEUR
                    , MAX_UNITE_COULEUR);
            throw new RuntimeException(messageErreur);
        }
    }

    public void blanchir(){
        rouge = ( rouge + 255 ) / 2;
        vert = ( vert + 255 ) / 2;
        bleu = ( bleu + 255 ) / 2;
    }

    @Override
    public String toString() {
        return String.format("Ma magnifique couleur RVB : %s, %s, %s", rouge, vert, bleu);
    }
}

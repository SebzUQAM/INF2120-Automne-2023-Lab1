package org.UQAM.Exercice_1;
// win+p

public class Principal {
    public static void main(String[] args){
        Couleur c1 = new Couleur(1, 200, 6);
        Couleur c2 = c1;
        System.out.println(c2);
        c2.setRouge(100);
        System.out.println(c1);

        c1.blanchir();
        System.out.println( c1 );
        System.out.println( c2 );
    }
}

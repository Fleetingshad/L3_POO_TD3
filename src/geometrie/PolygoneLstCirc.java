/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author Lucie et Nicolas
 */
public class PolygoneLstCirc extends PolygoneAbstract{

    private Noeud debut;

    /**
     * Inner class, permet d'enregistrer un couple point-suivant
     */
    private class Noeud { 

        /**
         * Sommet du polygone
         */
        private final Point p;
        
        /**
         * Pointeur pour accéder au sommet suivant
         */
        private Noeud suiv;

        /**
         * Constructeur de l'inner class Noeud 
         * 
         * @param p un Point
         * @param suiv un Noeud
         */
        public Noeud(Point p, Noeud suiv) {
            this.p = p;
            this.suiv = suiv;
        }
    }

    /**
     * Constructeur de polygone en liste chainée 
     * 
     * @param sommets tableau de Points
     * @throws IllegalArgumentException Exception
     */
    public PolygoneLstCirc(Point... sommets) throws IllegalArgumentException {
       super(sommets.length);
        int i = sommets.length - 1;
        Noeud dernier = this.debut = new Noeud(sommets[i], null);

        while (--i >= 0) {
            debut = new Noeud(sommets[i], debut);
        }
        dernier.suiv = debut;
    }

    /**
     * Retourne le point correspondant au numero du sommet passé en paramètre
     * 
     * @param indicePoint le numéro d'un sommet d'un polygone
     * @return un Point
     */
    @Override
    public Point getUnSommet(int indicePoint) {
        Noeud n = this.debut;
        for (int i = 0; i < indicePoint; i++) {
            n = n.suiv;
        }
        return n.p;
    }
}

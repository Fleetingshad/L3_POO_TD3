/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;


/**
 *
 * @author Nicolas et Lucie
 */
public class PolygoneTab extends PolygoneAbstract {

    /**
     * Tableau de points
     */
    private final Point[] sommets;

    /**
     * Constructeur pour un tableau de points
     *
     * @param sommets tableau de Points
     */
    public PolygoneTab(Point... sommets) throws IllegalArgumentException {
        super(sommets.length);
        this.sommets = sommets;
    }

    /**
     * Accesseur pour le tableau de points
     *
     * @return le tableau de points du polygone
     */
    public Point[] getSommets() {
        return this.sommets;
    }

    /**
     * Retourne le point correspondant au numero du sommet passé en paramètre
     * 
     * @param indicePoint le numéro d'un sommet d'un polygone
     * @return un Point
     */
    @Override
    public Point getUnSommet(int indicePoint) {
        indicePoint %= this.getNbeSommets();
        return this.sommets[indicePoint];
    }
   
}

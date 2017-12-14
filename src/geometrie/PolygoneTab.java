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

    @Override
    public Point getUnSommet(int indicePoint) {
        indicePoint %= this.getNbeSommets();
        return this.sommets[indicePoint];
    }
   
    
    /**
     * Vérifie si deux polygones sont égaux, prend en compte la rotation
     *
     * @param obj Objet
     * @return true si les deux polygones sont égaux
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj.getClass().equals(this.getClass()))) {
            return false;
        }
        PolygoneTab polygone = (PolygoneTab) obj;

        int eq = 0;
        int eq2 = 0;
        if (this.sommets.length == polygone.sommets.length) { //si les deux polygones ont le même nombre de sommets
            for (int i = 0; i < polygone.sommets.length; i++) {
                if (this.sommets[0].equals(polygone.sommets[i])) { //si le second polygone contient le sommet 0 du prremier polygone.
                    int x = 1; //Pour parcourir la seconde partie du second polygone 
                    //On parcourt le second polygone en partant du point suivant le point commun aux deux polygones.
                    while ((x + i) < polygone.sommets.length && this.sommets[x].equals(polygone.sommets[x + i])) {
                        eq++; //Incrémentation représentant le nombre de points communs aux deux polygones
                        x++; //on passe au sommet suivant
                    }
                    int y = 0; //Pour parcourir la première partie du second polygone  
                    //On parcourt le second polygone en partant du point 0 jusqu'au point avant le point commun aux deux polygones
                    while ((eq + (y + 1)) < this.sommets.length && y <= i && polygone.sommets[y].equals(this.sommets[eq + (y + 1)])) {
                        eq2++; //Incrémentation représentant le nombre de points communs aux deux polygones
                        y++; //on passe au sommet suivant
                    }
                }
                if (eq + eq2 + 1 == this.sommets.length) { //si le nombre de sommets communs correspond a la 'longueur' du polygone
                    return true;
                }
            }
        }
        return false;
    }

    
}

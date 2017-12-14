/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author LUCIE
 */
public class PolygoneLstCirc extends PolygoneAbstract{

    private Noeud debut;

    private class Noeud { //permet d'enregistrer un couple point-suivant

        Point p;
        Noeud suiv;

        public Noeud(Point p, Noeud suiv) {
            this.p = p;
            this.suiv = suiv;
        }
    }

    public PolygoneLstCirc(Point... sommets) throws IllegalArgumentException {
       super(sommets.length);
        int i = sommets.length - 1;
        Noeud dernier = this.debut = new Noeud(sommets[i], null);

        while (--i >= 0) {
            debut = new Noeud(sommets[i], debut);
        }
        dernier.suiv = debut;
    }

    @Override
    public Point getUnSommet(int indicePoint) {
        Noeud n = this.debut;
        for (int i = 0; i < indicePoint; i++) {
            n = n.suiv;
        }
        return n.p;
    }

    public void afficher() {
        Noeud n = this.debut;
        for (int i = 0; i < this.getNbeSommets(); i++) {
            System.out.println(n.p);
            n = n.suiv;
        }
    }
    

}

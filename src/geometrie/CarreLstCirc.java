/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author Nicol
 */
public class CarreLstCirc extends PolygoneLstCirc {

    /**
     * Longueur du carré
     */
    private final double longueur;

    /**
     * Constructeur avec un point et la longueur des côtés
     *
     * @param sg Sommet supérieur gauche
     * @param longueur Longueur des côtés du carré
     */
    public CarreLstCirc(Point sg, double longueur) {
        super(sg, new Point((sg.getX() + longueur), sg.getY()), new Point((sg.getX() + longueur), (sg.getY() - longueur)), new Point(sg.getX(), (sg.getY() - longueur)));
        this.longueur = longueur;
    }

    /**
     * Calcule la surface d'un carré
     *
     * @return la surface du carré
     */
    @Override
    public double surface() {
        return Math.pow(this.longueur, 2);
    }

    /**
     * Affichage des informations d'un carré
     *
     * @return les informations du carré
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carré à plat :");
        sb.append(this.texteSommets());
        return sb.toString();
    }
}

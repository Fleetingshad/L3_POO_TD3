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
public class TriangleLstCirc extends PolygoneLstCirc {

    /**
     * Distance entre les points p1 et p2
     */
    private double d1 = 0.0;

    /**
     * Distance entre les points p2 et p3
     */
    private double d2 = 0.0;

    /**
     * Distance entre les points p3 et p1
     */
    private double d3 = 0.0;

    /**
     * Constructeur prenant en paramètres trois points
     *
     * @param p1 Point
     * @param p2 Point
     * @param p3 Point
     */
    public TriangleLstCirc(Point p1, Point p2, Point p3) {
        super(p1, p2, p3);
        this.d1 = p1.distance(p2);
        this.d2 = p2.distance(p3);
        this.d3 = p3.distance(p1);
    }

    /**
     * Calcule la surface d'un triangle
     *
     * @return la surface du triangle
     */
    @Override
    public double surface() {
        double demiPerimetre = this.perimetre() / 2;
        return Math.sqrt(demiPerimetre * ((demiPerimetre - (this.d1)) * ((demiPerimetre - (this.d2)) * (demiPerimetre - (this.d3)))));
    }

    /**
     * Vérifie si un triangle est isocèle
     *
     * @return true si le triangle est isocèle
     */
    public boolean isIsocele() {
        return Point.memeReel(d1, d2) || Point.memeReel(d1, d3) || Point.memeReel(d2, d3);
    }

    /**
     * Vérifie si un triangle est équilatéral
     *
     * @return true si le triangle est équilatéral
     */
    public boolean isEquilateral() {
        return Point.memeReel(d1, d2) && Point.memeReel(d1, d3) && Point.memeReel(d2, d3);
    }

    /**
     * Affiche les informations d'un triangle
     *
     * @return les informations du triangle
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Triangle ");

        if (this.isEquilateral()) {
            sb.append(" équilatéral ");
        } else if (this.isIsocele()) {
            sb.append(" isocèle ");
        } else {
            sb.append(" scalène ");
        }
        sb.append(" : ");
        sb.append(this.texteSommets());
        return sb.toString();

    }
}

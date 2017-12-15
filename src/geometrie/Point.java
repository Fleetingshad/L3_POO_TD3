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
public class Point {

    /**
     * Abscisse du point
     */
    private final double x;

    /**
     * Ordonée du point
     */
    private final double y;

    /**
     * Constante de classe paramétrée à 10^(-9)
     */
    public static final double EPSILON = 0.000000001;

    /**
     * Constructeur champ à champ
     *
     * @param x Abscisse du point
     * @param y Ordonée du point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Accesseur pour l'abscisse du point
     *
     * @return l'abscisse du point
     */
    public double getX() {
        return this.x;
    }

    /**
     * Accesseur pour l'ordonée du point
     *
     * @return l'ordonée du point
     */
    public double getY() {
        return this.y;
    }

    /**
     * Calcule la distance entre deux points
     *
     * @param point point, Point
     * @return la distance entre deux points
     */
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2));
    }

    /**
     * Vérifie si deux nombres sont égaux
     *
     * @param nombre1 double
     * @param nombre2 double
     * @return true si les deux nombres sont égaux
     */
    public static boolean memeReel(double nombre1, double nombre2) {
        return Math.abs(nombre1 - nombre2) <= EPSILON;
    }

    /**
     * Vérifie si deux points sont égaux
     *
     * @param O Objet
     * @return true si deux points sont égaux
     */
    @Override
    public boolean equals(Object O) {
        if (O == null || !(O.getClass().equals(this.getClass()))) {
            return false;
        }
        Point p = (Point) O;
        return memeReel(this.getX(), p.getX())
                && memeReel(this.getY(), p.getY());
    }

    /**
     * Affichage des informations d'un point
     *
     * @return les informations du point
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.getX());
        sb.append(",");
        sb.append(this.getY());
        sb.append("> ");
        return sb.toString();       
    }
}

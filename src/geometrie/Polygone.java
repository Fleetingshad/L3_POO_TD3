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
public interface Polygone {

    /**
     * Calcule la surface d'un polygone, non-implémentée pour l'instant
     *
     * @return -1 
     */
    public double surface();

    /**
     * Calcule le périmètre d'un polygone
     *
     * @return le périmètre du polygone 
     */
    public double perimetre();

    /**
     * Retourne la liste des sommets sous forme de chaîne de caractères
     *
     * @return une chaîne contenant la liste des sommets 
     */
    public String texteSommets();

    /**
     * Permet d'obtenir le nombre de points d'un polygone
     * 
     * @return le nombre de sommets du polygone
     */
    public int getNbeSommets();

    /**
     * Retourne le point correspondant au numero du sommet passé en paramètre
     * 
     * @param indicePoint le numéro d'un sommet d'un polygone
     * @return un Point
     */
    public Point getUnSommet(int indicePoint);

}

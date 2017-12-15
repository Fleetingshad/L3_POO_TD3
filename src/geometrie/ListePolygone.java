/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas et Lucie
 */
public class ListePolygone {

    /**
     * Arraylist de Polygones, constante de classe
     */
    protected static final List<Polygone> LISTE_POLYGONES = new ArrayList<>();

    /**
     * Constructeur par défaut, on peut initialiser une liste vide
     */
    public ListePolygone() {
    }

    /**
     * Ajoute un polygone à la liste de polygones
     *
     * @param p un polygone
     */
    public void ajoutPolygone(Polygone p) {
        LISTE_POLYGONES.add(p);
    }

    /**
     * Affiche les informations des polygones de la liste (type, sommets,
     * périmètre et surface)
     */
    public void afficheInfos() {
        LISTE_POLYGONES.forEach(p -> System.out.println(p.toString() + "\nPérimètre : " + p.perimetre() + "\nSurface : " + p.surface()+'\n'));
    }

    /**
     * Affiche le nombre de polygones de la liste
     *
     * @return une chaine comprenant le nombre de polygones de la liste
     */
    @Override
    public String toString() {
        return "Liste de " + LISTE_POLYGONES.size() + " polygones. \n";
    }
}

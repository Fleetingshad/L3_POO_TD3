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
public abstract class PolygoneAbstract implements Polygone {

    protected int taille;

    /**
     * Constructeur pour un tableau de points ou une liste chainée
     *
     * @param taille le nombre de sommets du polygone 
     * @throws IllegalArgumentException Exception
     */
    public PolygoneAbstract(int taille) throws IllegalArgumentException {
        if (taille < 3) {
            throw new IllegalArgumentException("Vous ne pouvez pas initialiser un polygone de moins de trois sommets.");
        }
        this.taille = taille;
    }

    /**
     * Permet d'obtenir le nombre de points d'un polygone
     * 
     * @return le nombre de sommets du polygone 
     */
    @Override
    public int getNbeSommets() {
        return this.taille;
    }

    /**
     * Calcule la surface d'un polygone, non-implémentée pour l'instant
     *
     * @return -1
     */
    @Override
    public double surface() {
        return -1;
    }

    /**
     * Calcule le périmètre d'un polygone
     *
     * @return le périmètre du polygone
     */
    @Override
    public double perimetre() {
        double perimetre = 0;
        for (int i = 0; i < this.taille; i++) {
            perimetre += this.getUnSommet(i).distance(this.getUnSommet(i + 1));
        }
        return perimetre;
    }

    ;    

    /**
     * Retourne la liste des sommets sous forme de chaîne de caractères
     *
     * @return une chaîne contenant la liste des sommets
     */
    @Override
    public String texteSommets() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.taille; i++) {
            stringBuilder.append(this.getUnSommet(i).toString());
        }
        return stringBuilder.toString();
    }

    
    /**
     * Vérifie si deux polygones sont égaux, prend en compte la rotation
     *
     * @param obj Objet
     * @return true si les deux polygones sont égaux
     */
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof PolygoneTab) && !(obj instanceof PolygoneLstCirc)) {
            return false;
        }
        
        PolygoneAbstract polygone = (PolygoneAbstract) obj;
        
        if (obj instanceof PolygoneLstCirc) {
            polygone = (PolygoneLstCirc) obj;
            
        }else{
            polygone = (PolygoneTab) obj;
        }
        
        int eq = 0;
        int eq2 = 0;
        if (this.taille == polygone.taille) { //si les deux polygones ont le même nombre de sommets
            for (int i = 0; i < polygone.taille; i++) {
                if (this.getUnSommet(0).equals(polygone.getUnSommet(i))) { //si le second polygone contient le sommet 0 du prremier polygone.
                    int x = 1; //Pour parcourir la seconde partie du second polygone 
                    //On parcourt le second polygone en partant du point suivant le point commun aux deux polygones.
                    while ((x + i) < polygone.taille && this.getUnSommet(x).equals(polygone.getUnSommet(x + i))) {
                        eq++; //Incrémentation représentant le nombre de points communs aux deux polygones
                        x++; //on passe au sommet suivant
                    }
                    int y = 0; //Pour parcourir la première partie du second polygone  
                    //On parcourt le second polygone en partant du point 0 jusqu'au point avant le point commun aux deux polygones
                    while ((eq + (y + 1)) < this.taille && y <= i && polygone.getUnSommet(y).equals(this.getUnSommet(eq + (y + 1)))) {
                        eq2++; //Incrémentation représentant le nombre de points communs aux deux polygones
                        y++; //on passe au sommet suivant
                    }
                }
                if (eq + eq2 + 1 == this.taille) { //si le nombre de sommets communs correspond a la 'longueur' du polygone
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Affichage des informations d'un polygône
     *
     * @return les informations du polygone
     */
    @Override
    public String toString() {
        return "Polygone à " + this.taille + " sommets : \n" + this.texteSommets();
    }

}

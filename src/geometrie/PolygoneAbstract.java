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
public abstract class PolygoneAbstract implements Polygone {
    
    protected int taille;

    /**
     * Constructeur pour un tableau de points
     *
     * @param sommets tableau de Points
     */
    public PolygoneAbstract(int taille) throws IllegalArgumentException {
         if (taille < 3) {
            throw new IllegalArgumentException("Vous ne pouvez pas initialiser un polygone de moins de trois sommets.");
        }
        this.taille = taille;
    }
    
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
    public double perimetre(){
       double perimetre = 0;
            for (int i = 0; i < this.taille; i++) {
                    perimetre += this.getUnSommet(i).distance(this.getUnSommet(i+1));
            }
        return perimetre; 
    };    

    /**
     * Retourne la liste des sommets sous forme de chaîne de caractères
     *
     * @return une chaîne contenant la liste des sommets
     */
    @Override
    public String texteSommets(){
        StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < this.taille; i++) {
                    stringBuilder.append(this.getUnSommet(i));
                    stringBuilder.append(" ");
         }
         return stringBuilder.toString();
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

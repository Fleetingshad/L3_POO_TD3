/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

import java.util.Iterator;

/**
 *
 * @author Lucie et Nicolas 
 */
public abstract class PolygoneAbstract implements Polygone {

    protected int taille;
    protected int indice =0;
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
        //new string builder
        StringBuilder sb = new StringBuilder();
        // etendre buff avec le message qui suit :
        sb.append("Polygone à ");
        // etendre buff avec la taille :
        sb.append(this.taille);
        // etendre buff avec le message suivant :
        sb.append(" sommets :\n ");
        // insertion des sommets :
        sb.append(this.texteSommets());
        // Renvoie de la chaîne :
        return sb.toString();
    }

    public Iterator<Point> iterator(){
        return new Itr();
    }
    private class Itr implements Iterator<Point>{

        @Override
        public boolean hasNext() {
            // Return vrai si il y'a d'autres éléments , sinon return false;
            return indice < taille;
        }

        @Override
        public Point next() {
            // retourne le sommet suivant par rapport à l'indice courant            
            return getUnSommet(indice+1);                
        }

        @Override
        public void remove() {
            // cette méthode est optionnel :
            // On ne peut pas modifié une liste en cours d'itération
            // car l'itérateur a besoin de connaitre quoi retourner pour la méthode hasnext() et next()            
            while(this.hasNext()){
                this.next();
                this.remove();
            }
        }
        
    }
    
}

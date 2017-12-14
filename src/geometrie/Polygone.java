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
public interface Polygone {

    public double surface();

    public double perimetre();

    public String texteSommets();

    public int getNbeSommets();

    public Point getUnSommet(int indicePoint);

}

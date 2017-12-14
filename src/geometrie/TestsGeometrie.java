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
public class TestsGeometrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Point[] point = {new Point(4, 6), new Point(1, 4), new Point(2, 3)};
            
            
            System.out.println("\nTESTS POINTS\n");
            //test sur egalités de deux points
            
            Point a = new Point(1, -2.344445570);
            System.out.println(a.toString());

            Point b = new Point(1, -2.34444457);
            System.out.println(b.toString());

            System.out.println("Egalité des deux points ? " + a.equals(b) + '\n');
            
            
            
            System.out.println("\nTESTS POLYGONE CIRCULAIRE\n");
            //création et affichage de polygone circulaire

            Polygone polyCirc = new PolygoneLstCirc(point);
            int sommetChoisi = 2;
            
            System.out.println(polyCirc.toString());

            System.out.println("\nRécupération du sommet " + sommetChoisi + " :");            
            System.out.println(polyCirc.getUnSommet(sommetChoisi-1));
            
            System.out.println("\nPérimètre: " + polyCirc.perimetre() + '\n');

            
            
            System.out.println("\nTESTS POLYGONE TABLEAU\n");
            //création et affichage de polygone

            Polygone polyTab = new PolygoneTab(new Point[]{new Point(0, 0), new Point(-1, 4), new Point(2, 0), new Point(3, 4.5), new Point(0, 8)});
            System.out.println(polyTab.toString());
            
            System.out.println("\nRécupération du sommet " + sommetChoisi + " :");            
            System.out.println(polyTab.getUnSommet(sommetChoisi-1));
            
            System.out.println("\nPérimètre: " + polyTab.perimetre() + '\n');

            

            System.out.println("\nTESTS EGALITES DE POLYGONES\n");
            //tests égalité de polygones avec rotation
            String et = "\n ET \n";
            String f = "\n -> ";
            Polygone poly1 = new PolygoneTab(new Point(4, 5), new Point(5, 2), new Point(3, 1), new Point(1, 1), new Point(2, 4));
            Polygone poly2 = new PolygoneLstCirc(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2), new Point(3, 1));
            System.out.println(poly1.toString() + et + poly2.toString() + f + poly1.equals(poly2) + '\n');

            Polygone poly3 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(-5, 2), new Point(3, 1));
            System.out.println(poly1.toString() + et + poly3.toString() + f + poly1.equals(poly3) + '\n');

            Polygone poly4 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2));
            System.out.println(poly3.toString() + et + poly4.toString() + f + poly3.equals(poly4) + '\n');

            Polygone poly5 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2), new Point(3, 1));
            System.out.println(poly1.toString() + et + poly5.toString() + f + poly1.equals(poly5) + '\n');

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

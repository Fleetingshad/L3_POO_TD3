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
            
            
            System.out.println("\n-- TESTS DE LA CLASSE POINT --\n");
                        
            Point a = new Point(1, -2.344445570);
            //affichage du point a :
            System.out.println("toString du point 'a' (-2.344445570) : ");
            System.out.println(a.toString());

            Point b = new Point(1, -2.34444457);
            //affichage du point b :
            System.out.println("\ntoString du point 'b' (-2.34444457) : ");
            System.out.println(b.toString());

            System.out.println("\n -> Egalité entre les points a & b : " + a.equals(b) + '\n');
            
            System.out.println("Distance entre le point a et le point b : ");
            System.out.println(a.distance(b));
            
            System.out.println("Test des getters :\n");
            System.out.println("a.getX() : ");
            System.out.println(a.getX());
            System.out.println("\na.getY()");
            System.out.println(a.getY());
            System.out.println("\nb.getX()");
            System.out.println(b.getX());
            System.out.println("\nb.getY()");
            System.out.println(b.getY());
            System.out.println("\nTest de la méthode memeReel()");
            System.out.println("Valeur de x = 3.999999999999 et y = 3.999999999999");
            System.out.println(Point.memeReel(3.999999999999, 3.999999999999));
            System.out.println("Valeur de x = 3.999999999998 et y = 3.999999999999");
            System.out.println(Point.memeReel(3.999999999998, 3.999999999999));
            System.out.println("Valeur de x = 3.99999997999 et de y = 3.999999999999");
            System.out.println(Point.memeReel(3.999999979998, 3.999999999999));
            
            
            /////////////////////////////////////////////////////////////////////////////
            
            System.out.println("\n-- TESTS DE LA CLASSE POLYGONE CIRCULAIRE --\n");
            //création et affichage de polygone circulaire

            Polygone polyCirc = new PolygoneLstCirc(point);
            int sommetChoisi = 2;
            //Affichage du polygone circulaire :
            System.out.println(polyCirc.toString());

            //récupération d'un sommet choisit : 
            System.out.println("\nRécupération du sommet numero " + sommetChoisi + " :");            
            System.out.println(polyCirc.getUnSommet(sommetChoisi-1));
            
            System.out.println("\nPérimètre: " + polyCirc.perimetre() + '\n');

            
            /////////////////////////////////////////////////////////////////////////////
            
            
            System.out.println("\n-- TESTS DE LA CLASSE POLYGONE TABLEAU --\n");
            //création et affichage de polygone

            Polygone polyTab = new PolygoneTab(new Point[]{new Point(0, 0), new Point(-1, 4), new Point(2, 0), new Point(3, 4.5), new Point(0, 8)});
            //affichage du polygone tab :
            System.out.println(polyTab.toString());
            
            System.out.println("\nRécupération du sommet " + sommetChoisi + " :");            
            System.out.println(polyTab.getUnSommet(sommetChoisi-1));
            
            System.out.println("\nPérimètre: " + polyTab.perimetre() + '\n');

            
            /////////////////////////////////////////////////////////////////////////////
            

            System.out.println("\n-- TESTS DES EGALITEES DE POLYGONES --\n");
            //tests égalité de polygones avec rotation
            String et = "\n ET \n";
            String f = "\n -> ";
            Polygone poly1 = new PolygoneTab(new Point(4, 5), new Point(5, 2), new Point(3, 1), new Point(1, 1), new Point(2, 4));
            Polygone poly2 = new PolygoneLstCirc(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2), new Point(3, 1));
            //Egalité entre polygone tab & polygone circulaire
            System.out.println(poly1.toString() + et + poly2.toString() + f + poly1.equals(poly2) + '\n');

            Polygone poly3 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(-5, 2), new Point(3, 1));
            // Egalité entre deux polygone tab  :
            System.out.println(poly1.toString() + et + poly3.toString() + f + poly1.equals(poly3) + '\n');

            Polygone poly4 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2));
            // Egalité entre deux polygone tab de taille différente :
            System.out.println(poly3.toString() + et + poly4.toString() + f + poly3.equals(poly4) + '\n');

            Polygone poly5 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2), new Point(3, 1));
            // Egalité entre deux polygone tab 
            System.out.println(poly1.toString() + et + poly5.toString() + f + poly1.equals(poly5) + '\n');

            
            /////////////////////////////////////////////////////////////////////////////
            
            
            System.out.println("\n-- TESTS DE LA CLASSE DES RECTANGLES TAB --\n");
            RectangleTab RT = new RectangleTab(new Point(1,1), new Point(3,3));
            RectangleTab RT2 = new RectangleTab(new Point(1,1), new Point(3,3),new Point(2,2), new Point(6,6));
            RectangleTab RT3 = new RectangleTab(new Point(5,5), new Point(7,7));
            RectangleTab RT4 = new RectangleTab(new Point(1,1),new Point(3,1),new Point(3,3),new Point(1,3));
            //affichage du rectangle : 
            System.out.println("toString() du rectangle tab 1 : ");
            System.out.println(RT.toString());
            System.out.println("Nombre de sommets de rect tab 1 : "+ RT.getNbeSommets());
            System.out.println("Surface du rectangle tab 1 :" + RT.surface());
            System.out.println("\nTexte sommets du rectangle 2 :");
            System.out.println(RT2.texteSommets());
            System.out.println("\nPerimetre du rectangle tab 2 :");
            System.out.println(RT2.perimetre());
            System.out.println("\nEgalité entre rectangle tab 1 & rectangle tab 2 : ");
            System.out.println(RT.toString() + et + RT2.toString() + f + RT.equals(RT2));
            System.out.println("\nEgalité entre rectangle tab 1 & rectangle tab 3 : ");
            System.out.println(RT.toString() + et + RT3.toString() + f + RT.equals(RT3));
            System.out.println("\nEgalité entre rectangle tab 1 & rectangle tab 4 : ");
            System.out.println(RT.toString() + et + RT4.toString() + f + RT.equals(RT4));
            
            /////////////////////////////////////////////////////////////////////////////
            
            
            System.out.println("\n-- TESTS DE LA CLASSE DES RECTANGLES LISTE CIRCULAIRE --\n");
            RectangleTab RLC = new RectangleTab(new Point(1,1), new Point(3,3));
            RectangleTab RLC2 = new RectangleTab(new Point(1,1), new Point(3,3),new Point(2,2), new Point(6,6));
            RectangleTab RLC3 = new RectangleTab(new Point(5,5), new Point(7,7));
            
            //affichage du rectangle : 
            System.out.println("toString() du rectangle circ 1 : ");
            System.out.println(RLC.toString());
            System.out.println("Nombre de sommets du rect circ 1 : "+ RLC.getNbeSommets());
            //System.out.println("Surface du rectangle 1 :" + RLC.surface());
            System.out.println("\nTexte sommets du rectangle circ 2 :");
            System.out.println(RLC2.texteSommets());
            System.out.println("\nPerimetre du rectangle circ 2 :");
            System.out.println(RLC2.perimetre());
            System.out.println("\nEgalité entre rectangle circ 1 & rectangle circ 2 : ");
            System.out.println(RLC.toString() + et + RLC2.toString() + f + RLC.equals(RLC2));
            System.out.println("\nEgalité entre rectangle circ 1 & rectangle circ 3 : ");
            System.out.println(RLC.toString() + et + RLC3.toString() + f + RLC.equals(RLC3));
           
            ///////////////////////////////////////////////////////////////////////////////:
            
            System.out.println("\n-- TESTS DE LA CLASSE CARRETAB --\n");
            //CarreTab ct1 = new CarreTab();
            System.out.println("\n-- TESTS DE LA CLASSE CARRELSTCIRC --\n");
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        /////////////////////////////////////////////////////////////////////////////
            
        
        System.out.println("\n-- Test de condition contructeur polygone --");
        
        try {
            System.out.println("Polygone a 2 sommets : ");
            PolygoneLstCirc poly2Sommets = new PolygoneLstCirc(new Point[]{new Point(-12,0), new Point(5,10)});
            System.out.println(poly2Sommets);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}

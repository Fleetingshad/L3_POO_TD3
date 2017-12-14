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

        // try {
//            System.out.println("\nTESTS RECTANGLE\n");
//            //création de points
//            Point p1 = new Point(4, 3);
//            Point p2 = new Point(0, 2);

//        Point[] point = {new Point(4,6), new Point(1, 4), new Point(2, 3)};
//        PolygoneLstCirc p = new PolygoneLstCirc(point);
//        p.afficher();
//        
//       System.out.println("Récupération du sommet "+6);
//       System.out.println(p.getUnPoint(6));
//       System.out.println(p.perimetre());
//       System.out.println(p.texteSommets());
//        
//            //création et affichage de rectangle 
//            Rectangle r = new Rectangle(p1, p2);
//            System.out.println(r.toString());
//            double surfaceR = r.surface();
//            System.out.println("Surface : " + r.arrondi(surfaceR));
//
//            System.out.println("\nTESTS TRIANGLE\n");
//            //création de triangles
//            Triangle unTriangleIsocele = new Triangle(new Point(0, 0), new Point(1, 4), new Point(2, 0));
//            Triangle unTriangleScalene = new Triangle(new Point(2, 2), new Point(3, 1), new Point(5, 6));
//            Triangle unTriangleEquilateral = new Triangle(new Point(10, 0), new Point(0, 0), new Point(5, 8.6602540378));

//            //affichage de triangles
//            System.out.println(unTriangleScalene.toString());
//            double surfaceT = unTriangleScalene.surface();
//            System.out.println("Surface : " + unTriangleScalene.arrondi(surfaceT) + '\n');
//
//            System.out.println(unTriangleEquilateral.toString() + '\n');
//            System.out.println(unTriangleIsocele.toString());
//
//            System.out.println("\nTESTS CARRE\n");
//            //création et affichage de carré
//            Carre carre = new Carre(new Point(0, 0), 6);
//            System.out.println(carre.toString());
//            double surfaceC = carre.surface();
//            System.out.println(carre.arrondi(surfaceC) + '\n');
//
//            System.out.println("\nTESTS POLYGONE\n");
//            //création et affichage de polygone
//            PolygoneTab p = new PolygoneTab(new Point(0, 0), new Point(-1, 4), new Point(2, 0), new Point(3, 4.5), new Point(0, 8));
//            System.out.println(p.toString());
//            double perimP = p.perimetre();
//            System.out.println("Périmètre: " + p.arrondi(perimP) + '\n');
//
//            System.out.println("\nTESTS LISTE POLYGONES\n");
//            //déclaration de la liste de polygones
//            ListePolygone liste = new ListePolygone();
//            //Ajout dans la liste
//            liste.ajoutPolygone(p);
//            liste.ajoutPolygone(unTriangleIsocele);
//            liste.ajoutPolygone(unTriangleEquilateral);
//            liste.ajoutPolygone(new PolygoneTab(new Point[]{new Point(50, 2.5), new Point(3.1, 1)}));
//            liste.ajoutPolygone(carre);
//            //Affichage des informations
//            liste.afficheInfos();
//
//            System.out.println("\nTESTS POINTS\n");
//            //test sur egalités de deux points
//            Point a = new Point(1, -2.344445570);
//            System.out.println(a.toString());
//
//            Point b = new Point(1, -2.34444457);
//            System.out.println(b.toString());
//
//            System.out.println("Egalité des deux points ? " + a.equals(b) + '\n');
//
//            System.out.println("\nTESTS EGALITES DE POLYGONES\n");
//            //tests égalité de polygones avec rotation
//            String et = "\n ET \n";
//            String f = "\n -> ";
//            PolygoneTab poly1 = new PolygoneTab(new Point(4, 5), new Point(5, 2), new Point(3, 1), new Point(1, 1), new Point(2, 4));
//            PolygoneTab poly2 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2), new Point(3, 1));
//            System.out.println(poly1.toString() + et + poly2.toString() + f + poly1.equals(poly2) + '\n');
//
//            PolygoneTab poly3 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(-5, 2), new Point(3, 1));
//            System.out.println(poly1.toString() + et + poly3.toString() + f + poly1.equals(poly3) + '\n');
//
//            PolygoneTab poly4 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(5, 2));
//            System.out.println(poly3.toString() + et + poly4.toString() + f + poly3.equals(poly4) + '\n');
//
//            PolygoneTab poly5 = new PolygoneTab(new Point(1, 1), new Point(2, 4), new Point(4, 5), new Point(3, 1), new Point(5, 2));
//            System.out.println(poly1.toString() + et + poly5.toString() + f + poly1.equals(poly5) + '\n');
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

}

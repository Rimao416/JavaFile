package Seance_13_11_2020;

public class TestPoint {
    Point P1=new Point();
Point P2=new Point(10,3);
Point P3 = P2;
Point P5 =
Point P4 = new Point(2,3);
System.out.println("P1: "+P1);
System.out.println("P2: "+P2);
System.out.println("P3: "+P3);


/*
pour exo1:
P1.affiche();
P2.affiche();
P3.affiche();


P1.affiche();
P2.affiche();
P1=P2;
P1.affiche();
P2.affiche();
P2.setX(15);
P2.setY(17);
P1.affiche();
P2.affiche();
System.out.println("la distance est: "+P2.distance(P4));
P2.deplacer(-2, -5);
P2.affiche();*/
Segment S1 = new Segment (P2,P4);
S1.affiche();
Segment S2 = new Segment (1,4,3,8);
S2.affiche();
Segment S3 = new Segment();
S3.affiche();
System.out.println(" la longueur du segment S2: "+ S2.longueur());
System.out.println("P3 appartient à S1: "+S1.appartient(P3));

}​​


    
}

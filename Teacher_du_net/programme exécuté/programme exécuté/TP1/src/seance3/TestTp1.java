package seance3;

public class TestTp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point P1=new Point(2,3);
		Point P2=new Point(4,7);
		Point P3 = new Point(10,20);
		Point P4 = new Point(10,25);
		Point P5 = new Point(2,3);
		
		System.out.println();
		Segment S1 = new Segment(P1,P2);
		System.out.println("la longueur du segment S1 est: "+S1.longueur());
		Segment S2 = new Segment(P3,P2);
		System.out.println();
		Segment S3 = new Segment(P3,P4);
		Segment S4 = new Segment(P4,P1);
		Segment S5 = new Segment(P4,P5);
		Ligne L1 = new Ligne(3);
		L1.les_segments[0]= S1;
		L1.les_segments[1]= S2;
		L1.les_segments[2]= S3;
		Ligne L2 = new Ligne(4);
		L2.les_segments[0] = S1;
		L2.les_segments[1] = S2;
		L2.les_segments[2] = S3;
		L2.les_segments[3] = S4;
	System.out.println("P3 appartient à S1: "+S1.appartient(P3));
		Ligne L3 = new Ligne(4);
		L3.les_segments[0] = S1;
		L3.les_segments[1] = S2;
		L3.les_segments[2] = S3;
		L3.les_segments[3] = S5;
		System.out.println("Ligne  L1");
		L1.polygone();
		System.out.println("Ligne  L2");
		L2.polygone();
		System.out.println("Ligne  L3");
		L3.polygone();
		
		
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
		System.out.println("la distance est:  "+P2.distance(P4));
		P2.deplacer(-2, -5);
		P2.affiche();*/
		
	}

}

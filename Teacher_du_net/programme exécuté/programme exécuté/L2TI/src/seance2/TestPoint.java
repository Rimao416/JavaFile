package seance2;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point P1 = new Point();
		P1.setX(4);
		P1.setY(5);
		P1.getX();
		P1.getY();
		System.out.println(P1);
		Point P2 = new Point(2,3);
		Point P3 = new Point(2,3);
		Point P4;
		P4 = P2;
		
		System.out.println("P2: "+P2); //affichage de P2 ou de ses attributs, si on a fait String toString
		System.out.println("P3: "+P3); //affichage de P3 ou de ses attributs, si on a fait String toString
		System.out.println("P3 == P4 : "+ (P2 == P3) );
		System.out.println("P2 == P4 : "+ (P2 == P4) );
		System.out.println("P2 equals P3 : "+ (P2.equals(P3)));//False car il faut apprendre à l'ordi à travers le modèle 
		System.out.println("P2 equals P4 : "+ (P2.equals(P4)));//False car il faut apprendre à l'ordi à travers le modèle 
	
		
	}

}

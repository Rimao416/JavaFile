package Seance3;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Papa P1 = new Papa();
System.out.println(P1);
System.out.println(P1.calcul(5));
Papa P2 = new Papa(4);
System.out.println(P2);
System.out.println(P2.calcul(5));


Enfant E1 = new Enfant();
System.out.println(E1);
System.out.println(E1.calcul(5));
Enfant E2 = new Enfant(3);
System.out.println(E2);
System.out.println(E2.calcul(5));
	}

}

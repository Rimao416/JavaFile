package TP3;

public class TestTache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TacheComplexe tA = new TacheComplexe("A",5);
		TacheElementaire TA1 = new TacheElementaire("A1", 10);
		tA.ajouterTache(TA1);
		TacheElementaire TA2 = new TacheElementaire("A2", 20);
		tA.ajouterTache(TA2);
		TacheElementaire TA3 = new TacheElementaire("A3", 50);
		tA.ajouterTache(TA3);
		System.out.println("Cout de tA = " + tA.getCout());
		tA.afficherSousTaches();
		tA.supprimerTache(TA3);
		System.out.println("Cout de tA = " + tA.getCout());
		tA.afficherSousTaches();
	}

}

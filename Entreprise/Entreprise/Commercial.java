package Entreprise;

public class Commercial extends Employe {
	private double ca;
	private double fixe;
	private static final double pourentageCa = 1.0;

	public Commercial(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	

	public Commercial(String nom, double ca, double fixe) {
		super(nom);
		this.ca = ca;
		this.fixe = fixe;
	}



	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return fixe +(pourentageCa*ca)/100;
	}



	@Override
	public String toString() {
		return "Commercial [ca=" + ca + ", fixe=" + fixe + "]";
	}



}

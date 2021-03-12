package Entreprise;

public class EmployeHoraire extends Employe {

	private double nbHeures;
	private double tarifHoraire;
	private double pourcentageHeureSup;
	private static final double heuresDues = 39;
	
	public EmployeHoraire(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public EmployeHoraire (String nom ,double nbHeures, double tarfiHoraire , double pourcentageHeuresSup)
	{
		super(nom);
		this.nbHeures=nbHeures;
		this.tarifHoraire = tarifHoraire;
		this.pourcentageHeureSup = pourcentageHeureSup;
		
	}
	

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		if(nbHeures >heuresDues)
		{
			return tarifHoraire*(heuresDues+(nbHeures-heuresDues)* (1 + pourcentageHeureSup/100));
		}
		else
		{
			
		return tarifHoraire * nbHeures;
		
		}
	}

	@Override
	public String toString() {
		return "EmployeHoraire [nbHeures=" + nbHeures + ", tarifHoraire="
				+ tarifHoraire + ", pourcentageHeureSup=" + pourcentageHeureSup
				+ "]";
	}

	
	

}

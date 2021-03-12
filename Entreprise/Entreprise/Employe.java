package Entreprise;

public abstract class Employe {
	private String nom;
	private Entreprise monEntreprise;
	


	public Employe(String nom)
	{
		this.nom = nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}


	public void setMonEntreprise(Entreprise monEntreprise) {
		this.monEntreprise = monEntreprise;
	}
	
	public Entreprise getEntreprise()
	{
		return monEntreprise;
	}
	
	public void setEntreprise(Entreprise Entrp)
	{
		if((monEntreprise!=null)&&(! monEntreprise.aPourEmploye(this))||(this.monEntreprise!=null)&&(this.monEntreprise.aPourEmploye(this)))
		{
			throw new UnsupportedOperationException("SetEntreprise ne peut être appelée directeemnt");
		}
		
		this.monEntreprise = Entrp;
		
	}
	public void demissione()
	{
		if(monEntreprise.aPourEmploye(this)==true)
		{
			try {
				monEntreprise.seSeparerDe(this);
			} catch (EmployeExecption e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		else
		{
			this.monEntreprise = null;
		}
	}

	public abstract double getSalaire();
}

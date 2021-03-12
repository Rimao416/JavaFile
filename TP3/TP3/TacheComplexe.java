package TP3;

public class TacheComplexe implements Tache {
	
	private String Nom;
	private int Cout;
	private TacheElementaire sousTaches[];
	
	public TacheComplexe (String Nom, int N)
	{
		this.Nom = Nom;
		this.sousTaches = new TacheElementaire[N];
	}

	public void ajouterTache(TacheElementaire Te)
	{
		int i = 0; 
		while ( (i < sousTaches.length) && ( sousTaches[i] != null) )
		{
			i++;
		}
		sousTaches[i] = Te;
	}
    
	public void supprimerTache( TacheElementaire Te)
	{
		int i = 0;
		while (i < sousTaches.length)
		{
			if(sousTaches[i] != null)
			{
				if( (sousTaches[i].getNom()).equals(Te.getNom()) )
				{
					sousTaches[i] = null;
					break;
				}
			}
			i++;
		}
	}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.Nom;
	}

	@Override
	public int getCout() {
		// TODO Auto-generated method stub
		int Som = 0;
		for (int i = 0; i < sousTaches.length ; i++)
		{
			if(sousTaches[i] != null)
			{
				Som += sousTaches[i].getCout();
			}
		}
		this.Cout = Som;
		return (this.Cout);
	}
	
	public String toString()
	{
		return ("TacheComplexe:[ " + this.Nom + ", " + this.Cout +" ]");
	}
	
	public void afficherSousTaches()
	{
		System.out.println("les sousTaches sont: ");
		for (int i = 0; i < sousTaches.length ; i++)
		{
			if(sousTaches[i] != null)
			{
				System.out.println(sousTaches[i]);
			}
		}
	}
	
	
}

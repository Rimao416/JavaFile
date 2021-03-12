package TP3;

public class Client {
	
	private int code;
	private String nom;
	private String Prenom;
	private Voiture mesVoitures[];
	private int nb_voitures;
	
	public Client (int code, String nom, String Prenom)
	{
		this.code = code;
		this.nom = nom;
		this.Prenom = Prenom;
		mesVoitures = new Voiture[5];
	}
    
	public void louerVoiture(Voiture V)
	{
		if (nb_voitures < 5)
		{
			int i = 0;
			while ((i < 5) && (mesVoitures[i]!= null))
			{
					i++;
			}
			if(mesVoitures[i]== null)
			{
				mesVoitures[i] = V;
				nb_voitures ++;
					
			}
		}
			
	}
	
	public boolean rendreVoiture(Voiture V)
	{
		boolean existe = false;
		int i = 0;
		while((i < 5) && (existe == false))
		{
			if (mesVoitures[i] != null)
			{
				if( mesVoitures[i].equals(V) == true)
				{
					existe = true;
					mesVoitures[i] = null;
					nb_voitures --;
				}
			}
			i++;
		}
		return existe;
	}
	
	public void afficherVoitures()
	{
		int i = 0;
		System.out.println("liste des voitures louées");
		while(i < 5)
		{
			if (mesVoitures[i] != null)
			{
				System.out.println(mesVoitures[i]);
			}
			i++;
		}
	}
	public String toString()
	{
		return "le client "+ this.nom +" "+ this.Prenom + " a pour code " + this.code;
	}
	public int getNb_Voitures()
	{
		return this.nb_voitures;
	}
	public Voiture[] getMesvoitures()
	{
		return this.mesVoitures;
	}
}

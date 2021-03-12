import  java.util.*;
public class Client {
	
	private int code;
	private String nom;
	private String Prenom;
	private ArrayList<Voiture> mesVoitures;
	private int nb_voitures;
	
	public Client (int code, String nom, String Prenom)
	{
		this.code = code;
		this.nom = nom;
		this.Prenom = Prenom;
		mesVoitures = new ArrayList<Voiture>();
	}
    
	public void louerVoiture(Voiture V)
	{
		mesVoitures.add(V);			
	}
	
	public boolean rendreVoiture(Voiture V)
	{
		boolean existe = false;
		if(mesVoitures.contains(V)==true){
			mesVoitures.remove(V);
			existe=true;
		}
		return existe;
	}
	
	public void afficherVoitures()
	{
		for(Voiture V: mesVoitures){
			System.out.println(V);
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
	public List<Voiture> getMesvoitures()
	{
		return this.mesVoitures;
	}
}

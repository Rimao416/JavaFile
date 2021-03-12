
public class Catégorie {
	public static int ID_Categorie=0;
	private String LibelleCategorie;
	
	
	public int getID_Categorie() {
		return ID_Categorie;
	}	
	public String getLibelleCategorie() {
		return LibelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		LibelleCategorie = libelleCategorie;
	}
	public Catégorie(){
		
	}
	public Catégorie(String libelleCategorie) {
		ID_Categorie++;
		LibelleCategorie = libelleCategorie;
	}
	
	@Override
	public String toString() {
		return "Categorie [ID_Categorie=" + ID_Categorie
				+ ", LibelleCategorie=" + LibelleCategorie + "]";
	}
	
	public void Affichage()
	{
		System.out.println(toString());
	}
	

}

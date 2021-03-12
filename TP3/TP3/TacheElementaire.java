package TP3;

public class TacheElementaire implements Tache {
	
	private String Nom;
	private int Cout;
	
	public TacheElementaire(String Nom, int Cout)
	{
		this.Nom = Nom;
		this.Cout = Cout;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return Nom;
	}

	@Override
	public int getCout() {
		// TODO Auto-generated method stub
		return Cout;
	}
	
	public String toString()
	{
		return ("TacheElementaire:[ " + this.Nom + ", " + this.Cout +" ]");
	}
	

}

package TP3;

public class Voiture {
	
	private String immatriculation;
	private String marque;
	private double prix;
	
	public Voiture ()
	{
		this.immatriculation ="";
		this.marque ="";
	}
	
	public Voiture (String immatriculation, String marque, double prix)
	{
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.prix = prix;
		
	}
	
	public String getImmatriculation()
	{
		return immatriculation;
	}
	
	public void setImmatriculation(String immatriculation)
	{
		this.immatriculation = immatriculation;
	}
	
	public String getMarque()
	{
		return marque;
	}
	
	public void setMarque(String marque)
	{
		this.marque = marque;
	}
	
	public double getPrix()
	{
		return prix;
	}
	
	public void setPrix(double prix)
	{
		this.prix = prix;
	}
	public String toString()
	{
		return "la voiture est de marque "+ this.marque + " son immatriculation est "+ 
	            immatriculation + " son prix de location est " + prix;
	}
	public boolean equals (Voiture V)
	{
		return (this.immatriculation.equals(V.immatriculation) && (this.marque.equals(V.marque)));
	}
}

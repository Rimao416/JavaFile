package Entreprise;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private String Nom;
	private List<Employe> mesEmployes;
	
	public Entreprise(String nom)
	{
		Nom = nom;
		ArrayList<Employe> mesEmployes;
	}

	public String getNom() 
	{
		return Nom;
	}

	public void setNom(String nom) 
	{
		Nom = nom;
	}

	
	public Boolean aPourEmploye(Employe Emp)
	{
		return (this.mesEmployes.contains(Emp));
	}
	
	public void engager(Employe Emp) throws EmployeExecption
	{
		if(this.aPourEmploye(Emp) == true)
		{
			throw new EmployeExecption("L employé appartient déja à l'entreprise" );
		}
		Entreprise Entrp = Emp.getEntreprise();
		
		if(Entrp == null)
		{
			this.mesEmployes.add(Emp);
			Emp.setEntreprise(this);
		}
		else
		{
			Entrp.mesEmployes.remove(Emp);
			this.mesEmployes.add(Emp);
			Emp.setEntreprise(this);
			
		}
	}
	public void seSeparerDe(Employe Emp) throws EmployeExecption
	{
		if(!this.mesEmployes.remove(Emp))//Vu que le remove indique si employé appartient, alors s'il 
		{
			throw new EmployeExecption("L'employé n'appartient pas à l'entreprise");
		}
		
	}
	
	

}

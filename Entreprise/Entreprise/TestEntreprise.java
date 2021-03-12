package Entreprise;

public class TestEntreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Entreprise E1 = new Entreprise ("Google");
			Entreprise E2 = new Entreprise ("Apple");
			
			Commercial C11 = new Commercial("Seif",6000 ,4000);
			
		}
		catch(EmployeExecption e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}

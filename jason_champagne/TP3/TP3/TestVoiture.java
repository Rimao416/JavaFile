
public class TestVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Client c1 = new Client (1,"Zouari","Amine");
       
       Voiture V1 = new Voiture ("120 TN 1234","Peugeot 206",14.500) ;
       Voiture V2 = new Voiture ("119 TN 4321","Polo 5",16.000);
       Voiture V3 = new Voiture ("121 TN 5678","Fait Punto",13.200);
     
       System.out.println(c1);
       c1.louerVoiture(V1);
       c1.louerVoiture(V2);
       c1.louerVoiture(V3);
       System.out.println("le nombre de voiture lou�es est: "+ c1.getNb_Voitures());
       c1.afficherVoitures();
       
       System.out.println(c1.rendreVoiture(V2));
       
       System.out.println("le nombre de voiture lou�es est: "+ c1.getMesvoitures());
       c1.afficherVoitures();
       
       Voiture V4 = new Voiture ("156 TN 9876","Peugeot 2008",30.500) ;
       c1.louerVoiture(V4);
//       System.out.println("le nombre de voiture lou�es est: "+ c1.getNb_Voitures());
       System.out.println("Le nombre des voitures louées est de "+c1.getMesvoitures());
	}
	

}

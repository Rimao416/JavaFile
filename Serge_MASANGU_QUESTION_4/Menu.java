//Creation de la classe Menu
public class Menu{
   private Eleve mesEleves[];
   private static int compter=0;
   public Menu(){

        mesEleves=new Eleve[30];
    }

    public void AjoutEleve(Eleve e){
        if (compter < 30)
		{
			int i = 0;
			while ((i < 30) && (mesEleves[i]!= null))
			{
					i++;
			}
			if(mesEleves[i]== null)
			{
				mesEleves[i] = e;
				compter ++;
			}
		}
    }
    public void SuppimerEleve(Eleve e){
        int i=0;
        while((i<=30)&&(mesEleves[i]!=null)){
            if(mesEleves[i].equals(e)==true){
                mesEleves[i]=null;
                compter--;

                System.out.println(e.getNom()+" a été supprimé");
                break;
            }else{
                i++;
            }
            if(i==30){
                System.out.println("Aucun membre n'a été supprimé");
            }
        }
    }
    public void AfficherEleve(){
        System.out.println("Listes des eleves");
        int i=0;
        while(i<compter){
            
            System.out.println("L'élève à l'identifiant "+mesEleves[i].getIdentifiant()+" a comme nom "+mesEleves[i].getNom()+" a comme prenom "+mesEleves[i].getPrenom());
            i++;
        }
        System.out.println("EN TOUT IL Y'A "+compter+" étudiants dans notre registre");
    }

}

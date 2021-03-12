import java.util.ArrayList;
public class ClientBanque {
    private int idClient=0;
    private String Nom;
    private String Addresse;
    private CompteBancaire C;
    private ArrayList<CompteBancaire> mesComptes; 
    public ClientBanque(String Nom, String Addresse){
        this.idClient++; //C'est une clé primaire
        this.Nom=Nom;
        this.Addresse=Addresse;
        mesComptes=new ArrayList<>();
    }
    public void ajouterCompte(String typeCompte, CompteBancaire C){
        if(typeCompte=="courant"){
            mesComptes.add(C);
    }
}
    public CompteBancaire rechecheBancaire(int numero){
        for(CompteBancaire C:mesComptes){
            if(C.getNum()==numero){
                return mesComptes;
            }
        }
    }
}  

import java.util.*;



public class Serviceinfo{
    private ArrayList<collaborateur>lesCollaborateurs;
    public Serviceinfo(){
        lesCollaborateurs=new ArrayList<collaborateur>();
    }
    public void ajouterCollaborateur(collaborateur c){
        if(!lesCollaborateurs.contains(c)){
            lesCollaborateurs.add(c);
        }


    }
    public collaborateur retirerCollaborateurMoinsCher(int n)
    {
        collaborateur collaborateurMoinsCher=lesCollaborateurs.get(0);
        double coutmin=collaborateurMoinsCher.CalculCoutProjet(n);
        for(collaborateur col:lesCollaborateurs){
            if(col.CalculCoutProjet(n)<coutmin){
                coutmin=col.CalculCoutProjet(n);
                collaborateurMoinsCher=col;
            }
        }
        lesCollaborateurs.remove(collaborateurMoinsCher);
        return collaborateurMoinsCher;

    }

public ArrayList<collaborateur>triCroissantParcours(int n)
{
    ArrayList<collaborateur>LesCollaborateursTri=new ArrayList<collaborateur>();
    while(!LesCollaborateursTri.isEmpty()){
        collaborateur collaborateurMoinsCher=retirerCollaborateurMoinsCher(n);
        LesCollaborateursTri.add(collaborateurMoinsCher);

    }
    return LesCollaborateursTri;
}
public String toString() {
    return "ServiceInfo [lesCollaborateurs=" + lesCollaborateurs + "]";
    }
    
}
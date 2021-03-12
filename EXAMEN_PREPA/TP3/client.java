import java.util.*;
public class client {
    private String nom,prenom;
    private int code;
    ArrayList<voiture>mesVoitures=new ArrayList<voiture>();
    public client(){

    }
    public client(String n, String p, int c){
        this.nom=n;
        this.prenom=p;
        this.code=c;
        mesVoitures=new ArrayList<>();
    }
    public String getName(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public int getCode(){
        return this.code;
    }
    public void setName(String n){
        this.nom=n;
    }
    public void setPrenom(String p){
        this.prenom=p;
    }
    public void setCode(int c){
        this.code=c;
    }
    public void louerVoiture(voiture v){
        mesVoitures.add(v);
        v.setId_client(this.code);
    }
    public boolean rechercher(voiture v){
        String reponse="";
        for(voiture va:mesVoitures){
            if(va.Equals(v)){
                reponse="oui";
            }else{
                reponse="non";
            }

        }
        if(reponse.equals("oui")){
            return true;
        }else{
            return false;
        }
    }
    public void affichageInfoClient(client c){
        for(voiture v:mesVoitures){
            if(v.getIdclient()==c.getCode()){
                System.out.println(v.toString());
            }else{
                System.out.println("Le client tapé n'existe pas");
            }
        }
    }

}

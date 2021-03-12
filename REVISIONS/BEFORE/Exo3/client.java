public class client {
    private int code;
    private String nom,prenom;
    voiture mesVoitures[];
    public client(){
        this.code=0;
        this.nom="";
        this.prenom="";
    }
    public client(int code, String nom, String prenom){
        this.code=code;
        this.nom=nom;
        this.prenom=prenom;
        mesVoitures=new voiture[5];
    }
    public void louerVoiture(voiture v){
        
    }

}

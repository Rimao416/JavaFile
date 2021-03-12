public class main {
    public static void main(String[] args){
        voiture v=new voiture(1000,"toyota",1500);
        voiture v1=new voiture(1000,"oyota",1500);
        voiture v2=new voiture(1000,"yota",1500);
        voiture v3=new voiture(1000,"ota",1500);
        voiture v4=new voiture(1000,"ta",1500);
        client c=new client("omari","babo",1500);
        c.louerVoiture(v);
        c.louerVoiture(v1);
        c.affichageInfoClient(c);
    }

}

package cours1.Exercice_1;

public class joueur {
    public int nombre1;
    public int nombre2;
    public String NomJoueur;
    public joueur(String Joueur){
        this.NomJoueur=Joueur;
    }
    public void setScore(int num1,int num2){
        this.nombre1=num1;
        this.nombre2=num2;
    }
    public int getAge(){
        return nombre1;
    }
    public int getAge2(){
        return nombre2;
    }
    public int Comparaison(int num1,int num2){
        if(num1<num2){
            return getAge();
        }else{
            return getAge2();
        }
    }
    public void AfficheGagnant(){
        System.out.println("Le vainqueur est "+Comparaison(nombre1,nombre2));
    }
    
}

public class Test {
    public static void main(String[] args) {
        Etudiant Etu=new Etudiant();
        Etu.SetnEtudiant("Ben Salah");
        Etu.SetClasse("L_B_D_1");
        Etu.SetDate(2000);
        Etudiant Etu2=new Etudiant("Ben Salah","L_B_D_1",2000);
        Etu.Affiche(); 
        Etu2.Affiche();
    }
    
}

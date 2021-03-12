public class Test {
    public static void main(String[] args) {
        //ON COMMENCE PAR CREER DES INSTANCES ELEVE
        //EN GROS, NOUS CREONS 25 ELEVES / 30
        Eleve Etudiant=new Eleve(12345,"Serge","Masangu");
        Eleve Etudiant2=new Eleve(12346,"Omari","Asangu");
        Eleve Etudiant3=new Eleve(12347,"Serge","Osangu");
        Eleve Etudiant4=new Eleve(12348,"Serge","Basangu");
        Eleve Etudiant5=new Eleve(12349,"Serge","Lasangu");
        Eleve Etudiant6=new Eleve(12345,"Serge","Masangu");
        Eleve Etudiant7=new Eleve(12346,"Omari","Asangu");
        Eleve Etudiant8=new Eleve(12347,"Serge","Osangu");
        Eleve Etudiant9=new Eleve(12348,"Serge","Basangu");
        Eleve Etudiant10=new Eleve(12349,"Serge","Lasangu");
        Eleve Etudiant11=new Eleve(12345,"Serge","Masangu");
        Eleve Etudiant12=new Eleve(12346,"Omari","Asangu");
        Eleve Etudiant13=new Eleve(12347,"Serge","Osangu");
        Eleve Etudiant14=new Eleve(12348,"Serge","Basangu");
        Eleve Etudiant15=new Eleve(12349,"Serge","Lasangu");
        Eleve Etudiant16=new Eleve(12345,"Serge","Masangu");
        Eleve Etudiant17=new Eleve(12346,"Omari","Asangu");
        Eleve Etudiant18=new Eleve(12347,"PAPA","Osangu");
        Eleve Etudiant19=new Eleve(12348,"Serge","Basangu");
        Eleve Etudiant20=new Eleve(12349,"Serge","Lasangu");
        Eleve Etudiant21=new Eleve(12345,"Serge","Masangu");
        Eleve Etudiant22=new Eleve(12346,"Omari","Asangu");
        Eleve Etudiant23=new Eleve(12347,"Serge","Osangu");
        Eleve Etudiant24=new Eleve(12348,"Serge","Basangu");
        Eleve Etudiant25=new Eleve(12349,"Serge","Lasangu");
        //A PARTIR D'ICI, nous ajoutons, chaque étudiant dans notre tableau
        Menu men=new Menu();
        men.AjoutEleve(Etudiant);
        men.AjoutEleve(Etudiant2);
        men.AjoutEleve(Etudiant3);
        men.AjoutEleve(Etudiant4);
        men.AjoutEleve(Etudiant5);
        men.AjoutEleve(Etudiant6);
        men.AjoutEleve(Etudiant7);
        men.AjoutEleve(Etudiant8);
        men.AjoutEleve(Etudiant9);
        men.AjoutEleve(Etudiant10);
        men.AjoutEleve(Etudiant11);
        men.AjoutEleve(Etudiant12);
        men.AjoutEleve(Etudiant13);
        men.AjoutEleve(Etudiant14);
        men.AjoutEleve(Etudiant15);
        men.AjoutEleve(Etudiant16);
        men.AjoutEleve(Etudiant17);
        men.AjoutEleve(Etudiant18);
        //Et le code qui suit, montre la suppression d'un étudiant, l'étudiant 18
        men.SuppimerEleve(Etudiant18);
        //Et ici, on affiche les élèves qui sont dans notre Tableau et 
        //avec le nombre total d'élèves dans le tableau
        men.AfficherEleve();

    }
}

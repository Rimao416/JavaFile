public class president extends employe implements Affiche {
    //Un président est payé par rapport à son statut
    /*
        SI SON STATUT EST BON== SALAIRE==15000
        SI SON STATUT EST NUL== SALAIRE==500
        SI SON STATUT EST MOYEN== SALAIRE ==10000
        SINON == 0
    */
    private String Statut;
    public president(String Statut){
        super();
        this.Statut=Statut;
    }    
    public double CalculSalaire(){
        if(this.Statut=="BON"){
            return 15000;
        }else if(this.Statut=="NUL"){
            return 500;
        }else{
            return 10000;
        }
    }
    public void Afficher(cadre c){
        System.out.println("Le cadre"+c);

    } 
}
//SEUL LE PRESIDENT A LE DROIT D'AFFICHER LA LISTE DE TOUS LES OUVRIERS

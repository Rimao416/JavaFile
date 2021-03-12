public class stock{
    private article myArticle[];
    public static int compter;
    public boolean myBoolean=true;
    public stock(){
        myArticle=new article[10];
    }
    public void AjouterArticle(article a){
        int i=0;
        while(i!=compter){
            if(myArticle[i].equals(a)==true){
                System.out.println(a.GetNom()+" existe deja ");
                myBoolean=false;
                break;
            }
            i++;
            
        }
        if(myBoolean==true){
   
        if(compter<10){
            while((i<10)&&(myArticle[i]!=null)){
                i++;
            }
            if(myArticle[i]==null){
                myArticle[i]=a;
                compter++;
                System.out.println("Larticle "+a.GetNom()+" est ajouté ");
            }
        }
    }

    }
    public void supprimerArticle(article a){
        int i=0;
        while(i<myArticle.length){
            if(myArticle[i].equals(a)==true){
                myArticle[i]=null;
                System.out.println("L'article "+a.GetNom()+" vient d'etre supprimé");
                compter--;
                break;
                
            }
            i++;
        }

    }
    public void afficherArticle(){
        int i=0;
        while(i<myArticle.length){
            myArticle[i].Affiche();
            i++;
        }
    }

   
}

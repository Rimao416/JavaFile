public class Forme {        
    public class Cercle extends Forme {​​​​​​​
        double rayon;
        static int compteur ;
    public Cercle(double rayon,Point P)
    {​​​​​​​
        super(P);
        this.rayon = rayon;
        compteur = compteur + 1;
    }​​​​​​​
    public Cercle ()
    {​​​​​​​
        super(new Point());
        this.rayon = 0;
        compteur ++;
    }​​​​​​​
    public String toString()
    {​​​​​​​    
        return "Le cercle est de rayon :"+rayon+"a pour centre: "+centre.toString();
    }​​​​​​​
    public void affiche(){​​​​​​​
        System.out.println(toString());
    }​​​​​​​
    double perimetre()
    {​​​​​​​
        return(2* Math.PI *rayon);
     }​​​​
    
    double surface()
    {​​​​​​​
        
        return (Math.PI * rayon * rayon);
        
    }​​​​​​​
    public void finalize()
    {​​​​​​​
        if (true)
        {​​​​​​​
        compteur = compteur - 1;
        System.out.println("Suppression d’un objet CERCLE");
        System.out.println("voici la nouvelle  valeur du compteur:  "+compteur);
        }​​​​​​​
        
    }​​​​​​​
    
    
    
    }​​​​​​​
     
    
    
    
    
    
    
    
}

package TP2;

public class Cercle extends Forme{
	double rayon;
	static int compteur ;
	
public Cercle(double rayon,Point P)
{
	super(P);
	this.rayon = rayon;
	compteur = compteur + 1;
}
public Cercle ()
{
	super(new Point());
	this.rayon = 0;
	compteur ++;
	
}
public String toString()
{	
	return "Le cercle est de rayon:" + rayon + " a pour centre: "+centre.toString();
	
}
public void affiche(){
	
	
	System.out.println(toString());

}
double perimetre()
{
	return(2* Math.PI *rayon);
	
}

double surface()
{
	
	return (Math.PI * rayon * rayon);
	
}
public void finalize()
{
	if (true)
	{
	compteur = compteur - 1;
	System.out.println("Suppression d�un objet CERCLE");
	}

	
	
}
 void test(Cercle c)
{
	double d = this.centre.distance(c.centre) ;
	double d2 = this.rayon + c.rayon ;
	if(d>d2)
	{
	 System.out.println("les deux cercles ont une intersection vide");	
	}
	else
	{
		if (d == d2)			
			{
			System.out.println("les deux cercles sont tangents");
			}
		else
			{
		 System.out.println("les deux cercles sont s�cants");	
			}
		
		
	}
}

public int compareTo (Object arg0){
	 if(this.surface()> ((Cercle)arg0).surface()){
		 return 1;
	 }else{
		 if(this.surface()==((Cercle)arg0).surface()){
			return 0;
		 }else{
			 return -1;
		 }
	 }
}

}



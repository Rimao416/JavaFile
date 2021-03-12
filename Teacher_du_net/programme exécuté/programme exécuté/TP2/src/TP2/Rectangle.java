package TP2;


public class Rectangle extends Forme{
		
	private double longueur,largeur;
		
		public Rectangle(Point P,double longueur,double largeur)
		{
			super(P);
			this.longueur=longueur;
			this.largeur=largeur;
		}
		
		double perimetre()
		{
			return(2*(longueur+largeur));
			
		}
		
		double surface()
		{
			return longueur*largeur;
			
		}
		
		public String toString(){
		
			return ("Le rectangle de longueur:"+ longueur +"et de largeur"+ largeur);
			
		}
		
		public void affiche(){
		
			
			System.out.println(toString());
		
		}
		public int compareTo(Object arg0){
			return 0;
		}
		
	
	}


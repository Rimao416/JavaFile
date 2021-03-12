package TP2;

import seance1.Point;

public class TestTP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point (2,6);
		Forme f[] = new Forme[3];
		f[0]= new Cercle(p,4);
		//f[1]= new Cercle(p,16);
		f[1] = new Rectangle(p, 4, 6);
		f[2]= new Cercle(p,8);
		Cercle c1 = new Cercle() ;
		Cercle c2 = new Cercle() ;
		System.out.println("le nombre de cercles est : " + Cercle.Compteur);
		c1 = c2 ;
		System.gc() ;
		for(int i=0;i<3;i++)
		{
			f[i].affiche();
			System.out.println("Périmetre: " + f[i].perimetre());
			System.out.println("Surface : " + f[i].surface());
		}
		System.out.println("le nombre de cercles est : " + Cercle.Compteur);
		/*Forme temp;
		for (int i = 1; i < f.length; i++)
		{
				for (int j = 0; j < f.length - 1; j++)
				{
					if ( ((Cercle)f[j]).compareTo((f[j+1])) > 0 )  // if (Tab[j]>Tab[j+1])
					{
						temp = f[j+1];
						f[j+1] = f[j];
						f[j] = temp;
					}
				}
		}
		System.out.println("tableau trié");
		for(int i=0;i<3;i++)
		{
			f[i].affiche();
			System.out.println("Périmetre: " + f[i].perimetre());
			System.out.println("Surface : " + f[i].surface());
		}
*/
	}


}

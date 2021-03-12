package TP2;
//import java.util.Arrays;

public class TestTP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point P = new Point(2,6);
		Forme[]f= new Forme[3];
		f[0]=new Cercle(4,P);
		//f[1]=new Rectangle(P,2,8);
		f[1]=new Cercle(15,P);
		f[2]=new Cercle(16,P);
		Cercle c1 =new Cercle();
		Cercle c2 =new Cercle();
		Cercle c3 =new Cercle();
		Cercle c4 =new Cercle();
		Cercle c5 =new Cercle();
		Cercle c6 =new Cercle();
		System.out.println("le nombre de cercle est: "+Cercle.compteur);
		c1 = c2;
		c5=c6;
		c3=c4;
		System.gc();
	

		
		
		for(int i=0;i<3;i++)
		{
			f[i].affiche();
			System.out.println("P�rimetre: "+f[i].perimetre());
			System.out.println("Surface: "+f[i].surface());
		}
		
		System.out.println("le nombre de cercle est: "+Cercle.compteur);
//--------------------------------------------------PREPARATION DE L'OPERATION DE TRI------------------------------------------------------//

		Forme temp;
		for(int i=1;i<f.length;i++){
			for(int j=0;j<f.length-1;j++){
				if(((Cercle)f[j]).compareTo((f[j+1]))>0 ){
					temp=f[j+1];
					f[j+1]=f[j];
					f[j]=temp;
				}
			}
		}
//--------------------------------------------------FIN DE L'OPERATION DE TRI------------------------------------------------------//
System.out.println("Tableau Trié");
for(int i=0;i<3;i++)
{
	System.out.println("La programmation en Java est dementielle, elle demande beaucoup de pratiques et de concentrations");
}




}

}

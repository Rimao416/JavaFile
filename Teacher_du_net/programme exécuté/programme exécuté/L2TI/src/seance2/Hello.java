package seance2;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
/*int T[] = new int[] {10,20,30};
int s = 0;
for(int i = 0; i<T.length;i++)
{
	s=s+T[i];
	
}

for(int i = 0; i<T.length;i++)
{
	System.out.print(T[i] + " | ");
	
}
System.out.println("la somme est: "+s);
	}
}
*/

		char Tab [] = new char[5];
		
		for (int i = 0; i < Tab.length; i++)
		{
			System.out.print(Tab[i] + " | ");
		}
        System.out.println();
        System.out.println();
      
		String TabStr[] = new String[5];
		
		for (int i = 0; i < TabStr.length; i++)
		{
			System.out.print(TabStr[i] + " | ");
		}
		
		
		System.out.println();
		System.out.println();
		TabStr[0] = "Bonjour";
		TabStr[1] = new String("Hello");
		TabStr[2] = new String ("L2TI");
		for (int i = 0; i < TabStr.length; i++)
		{
			System.out.print(TabStr[i] + " | ");
		}
		System.out.println();
		System.out.println();
	
		 
		for (int i= 0; i < TabStr[1].length(); i++)
		{
			Tab[i] = TabStr[1].charAt(i);
			System.out.print(Tab[i]);
			
		}
		for (int i = 0; i < Tab.length; i++)
		{
			System.out.print(Tab[i] + " | ");
		}
	}

}
		
	



package input;
import java.util.Scanner;
public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom =""; int age = 0;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Entrez votre nom: ");
		nom=Sc.nextLine();
		System.out.println("Entrez votre age: ");
		age=Sc.nextInt();
		System.out.println("votre nom est "+ nom +" votre age est "+ age);
	}

}


package cours1;
import java.util.*;
public class PersonneTest {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Personne P1=new Personne("Kayumba","Omari");
        Personne P2=new Personne("Kayumba","Dido");
        Personne P3=new Personne("Kayumba","Furah");
        Personne P4=new Personne("Kayumba","Deborah");
        System.out.println(Personne.nombreTotalDePersonnes);
        System.out.println(P1.full_title("Je m'appelle"));
    }

    
}

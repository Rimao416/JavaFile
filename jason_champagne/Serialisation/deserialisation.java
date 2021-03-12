import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class deserialisation {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
//Sauvegarde l'état d'un objet en une suite sur un objet
            FileInputStream FIS = new FileInputStream("save animal");
            ObjectInputStream OIS=new ObjectInputStream(FIS);
            ArrayList<Animal> Objet_deseriable=(ArrayList<Animal>)OIS.readObject();
            System.out.println(Objet_deseriable);
            OIS.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }




}

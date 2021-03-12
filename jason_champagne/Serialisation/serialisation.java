import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialisation {

    public static void main(String[] args) {
        Animal chien = new Animal(3, " rouge", true);
        Animal chat=new Animal(4,"jaune",true);
        Animal loup=new Animal(12,"blanc",false);
        ArrayList<Animal> une_ferme=new ArrayList<Animal>();
        une_ferme.add(chien);
        une_ferme.add(chat);
        une_ferme.add(loup);
        try {
//Sauvegarde l'état d'un objet en une suite sur un objet
            FileOutputStream FOS = new FileOutputStream("save animal");
            ObjectOutputStream OOS=new ObjectOutputStream(FOS);
            OOS.writeObject(une_ferme);
            OOS.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}

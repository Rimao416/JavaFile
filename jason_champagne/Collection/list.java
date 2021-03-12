import java.util.*;
public class list{
    public static void main(String[] args) {
//        ArrayList<String> List=new ArrayList<String>();
//        LinkedList<String> List=new LinkedList<String>();
            TreeSet<String>HS=new TreeSet<String>();
            HS.add("Ali");
            HS.add("Omari");
            HS.add("Junior");
            HS.add("Bababoubak");
            HS.add("Jeremie");
            HS.add("Ali");
            HS.add("Potentiel");
            HS.add("Papymoto");

      
            
/*        for(int i=0;i<List.size();i++){
            System.out.println(List.get(i));
        }*/
/*        for(String var:List){
            System.out.println(var);
        }*/
        Iterator <String> It=HS.iterator();
        while(It.hasNext()){
            System.out.println(It.next());
        }
    }
}
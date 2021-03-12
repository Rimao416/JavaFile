import java.util.*;
public class treemap {
    public static void main(String[] args) {
        TreeMap<String ,Integer>vehicles=new TreeMap<String ,Integer>();
        vehicles.put("Omari",10);
        vehicles.put("Mabeng",15);
        vehicles.put("Junior",20);
        vehicles.put("Eli",45);
        vehicles.put("Serge",120);
        vehicles.put("Papa",850);
        System.out.println("Total vehicles "+vehicles.size());
        for(String key:vehicles.keySet()){
            System.out.println(key+" - "+vehicles.get(key));
        }            
    }

     
}

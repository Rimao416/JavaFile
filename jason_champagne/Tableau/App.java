

public class App {
    public static void Tab(int t[]){
        for(int element:t){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int tab[]=new int[]{1,2,3,4};
            Tab(tab);
    }
}

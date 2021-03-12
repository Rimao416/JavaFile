    public class TestPoint{
        public static void main(String [] args){
            Point P1 = new Point(1,5);
            Point P2 = new Point(2,3);
            Point P3=new Point(4,5);//Ceci est une référence null
         P1.affiche();
         P2.affiche();
         P3.affiche();
         System.out.println(P1.distance(P2));



            
        }  
        }
       
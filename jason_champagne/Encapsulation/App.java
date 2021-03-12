public class App {
        public static void main(String[] args) {
            SoftwareRegistry sr=new SoftwareRegistry(2020);
            sr.Affiche();
            int number=5;
            for(int i=0;i<number;i++){
                sr.Set(sr.Aleatoire(250));
                sr.Affiche();   
            }

        }
       
}

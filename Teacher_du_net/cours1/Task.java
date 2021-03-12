//Pourquoi la programmation orienté objet?
    

package cours1;
    public class Task{
      public String Title="Null";
      public String Description="RIEN EXECUTE";
      public Task(String monTitre, String maTache){
          this.Title=monTitre;
          this.Description=maTache;
      }
      public void AfficherLaTache(){
          System.out.println(Title+" \n "+Description);
      }
    }

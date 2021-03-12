public class living extends human {
    private String indetifiString;
    public living(){
        Human_Name=GetAuthentification();
    }
    public void SetAuthentification(String indetifiString){
        this.indetifiString=indetifiString;
    }
    public String GetAuthentification(){
        return indetifiString;
    }
    public void Walk(){
        System.out.println(this.GetAuthentification()+"When he Walks, nothing can stop him");
    }
    public void Stop(){
        System.out.println("When he stops, all thing is better");
    }
}

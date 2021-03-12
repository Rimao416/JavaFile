    public class LireMedicaments {
   Medicament medi[];
    public final int compter=30;
    client monClient[];
    public LireMedicaments(){
        medi=new Medicament[50];
    }
    public void Approvisionner(Medicament M,int Addition){
        int i=0;
        int val=0;
        for(i=0;i<medi.length;i++){
            if(medi[i].equals(M)==true){
                val=medi[i].stocK();
                medi[i].SetStock(val+Addition);
                break;
            }
        }      

    }


}

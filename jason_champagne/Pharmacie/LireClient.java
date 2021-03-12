public class LireClient {
    public client MonClient[];

    public LireClient(){
        MonClient=new client[20];
    }
    public int compter=30;
    public void AjouterClient(client e){
        if (compter < 30)
		{
			int i = 0;
			while ((i < 30) && (MonClient[i]!= null))
			{
					i++;
			}
			if(MonClient[i]== null)
			{
				MonClient[i] = e;
				compter ++;
			}
		}
    }


    
}

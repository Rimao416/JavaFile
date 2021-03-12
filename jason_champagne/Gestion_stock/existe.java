public class existe {
    public static void main(String[] args) {
        article a=new article(1500,1400,1500,"Kabuya");
        article b=new article(1501,1400,1500,"Kabuya");
        article c=new article(1502,1400,1500,"Kabuya");
        article d=new article(1503,1400,1500,"Kabuya");
        article e=new article(1504,1400,1500,"Kabuya");
        article f=new article(1505,1400,1500,"Kabuya");
        stock articles=new stock();
        articles.AjouterArticle(a);
        articles.AjouterArticle(b);
        articles.AjouterArticle(c);
        articles.AjouterArticle(d);
        articles.AjouterArticle(e);
        articles.AjouterArticle(f);
        articles.afficherArticle();
    }
}

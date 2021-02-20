public class Book extends Item{
    private String author;
    Book(String itn,String sc,float p,String a,int suid){
        //super(itn,sc,p,suid);
        super(sc,itn,p,suid);
        this.author = a;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return (super.getSubj()+","+super.getItemName()+","+this.author+","+super.getPrice()+","+super.getSellerID());
    }
    public String toDetails(){
        return ("ITEM NAME - "+super.getItemName()+"\nAUTHOR - "+this.author+"\nPRICE - "+super.getPrice());
    }
}
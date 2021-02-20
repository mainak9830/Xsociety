public class Equipment extends Item{
    private String link;//drive link of Equipment picture
    Equipment(String itn,String sc,float p,String a,int suid){
        super(sc,itn,p,suid);
        this.link = a;
    }
    public String getLink(){
        return this.link;
    }
    public String toString(){
        return (super.getSubj()+","+super.getItemName()+","+this.link+","+super.getPrice()+","+super.getSellerID());
    }
    public String toDetails(){
        return ("ITEM NAME - "+super.getItemName()+"LINK - "+this.link+"\nPRICE - "+super.getPrice());
    }
}
public class Equipment extends Item{
    private String link;//drive link of Equipment picture
    Equipment(String itn,String sc,float p,String a,int suid){
        super(itn,sc,p,suid);
        this.link = a;
    }
    public String getLink(){
        return this.link;
    }
    public String toString(){
        return (super.getSubj()+","+super.getItemName()+","+super.getPrice()+","+super.getSellerID()+",\n"+this.link);
    }
}
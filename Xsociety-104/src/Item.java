public class Item {
    private String subjectCode;
    private String ItemName;
    private float price;
    private int sellerID;
    Item(String it,String s,float p,int suid){
        this.ItemName = it;
        this.subjectCode = s;
        this.price = p;
        this.sellerID = suid;
    }
    public String getSubj(){
        return this.subjectCode;
    }
    public String getItemName(){
        return this.ItemName;
    }
    protected float getPrice(){
        return this.price;
    }
    public int getSellerID(){
        return this.sellerID;
    }
}

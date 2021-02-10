/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */
import java.io.*;
import java.util.ArrayList;
public class StoreManager {
    private ArrayList<Book> booklist;
    private ArrayList<Equipment> eqtlist;
    //Add new book details in Books.csv
    public boolean init(){
        booklist = new ArrayList<>();
        eqtlist = new ArrayList<>();
        try{
            FileReader ux1 = new FileReader("Bookstock.csv");
            BufferedReader br = new BufferedReader(ux1);
            String line=br.readLine();
            while(line!=null){
                line=br.readLine();
                if(line==null)
                    break;
                String[] sb = line.split(",");
                booklist.add(new Book(sb[0],sb[1],Float.parseFloat(sb[2]),sb[3],Integer.parseInt(sb[4]))); 
            
            }            
            //System.out.println(list.size()); 
            br.close();
            ux1.close();
        }catch(Exception e){
            System.out.println(e);
        } 
        try{
            FileReader ux1 = new FileReader("Equipmentstock.csv");
            BufferedReader br = new BufferedReader(ux1);
            String line=br.readLine();
            while(line!=null){
                line=br.readLine();
                if(line==null)
                    break;
                String[] sb = line.split(",");
                eqtlist.add(new Equipment(sb[0],sb[1],Float.parseFloat(sb[2]),sb[3],Integer.parseInt(sb[4]))); 
            
            }
            
            //System.out.println(list.size()); 
            br.close();
            ux1.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    public boolean addItem(Book b){
        try{
            
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter("Bookstock.csv", true)); 
            out.write("\n"+b.getSubj()+","+b.getItemName()+","+Float.toString(b.getPrice())+","+b.getAuthor()+","+Integer.toString(b.getSellerID()));
            booklist.add(b);
            out.close();
            return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            return false;
        }
    }
    //Add new Equipment details to Equipments.csv
    public boolean addItem(Equipment b){
        try{
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter("Equipmentstock.csv", true)); 
            out.write("\n"+b.getSubj()+","+b.getItemName()+","+Float.toString(b.getPrice())+","+b.getLink()+","+Integer.toString(b.getSellerID()));
            eqtlist.add(b);
            out.close();
            return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            return false;
        }
    }
    public ArrayList<String> getList(String st,int ch){ //use same function to generate buying list filtered according to subject code
        System.out.println(st+" "+ch);
        ArrayList<String> list = new ArrayList<String>();
        if(ch==0){
            for(Book i:booklist){
                String h = i.getItemName().toLowerCase();
                //System.out.println("check if "+h+" ="+st.toLowerCase());
                if(h.lastIndexOf(st.toLowerCase())!=-1){
                    
                    list.add(i.toString());
                }//end of inner if
            }//end of for
        }
        else{ //for ch == 1
            for(Equipment i:eqtlist){
                String h = i.getItemName().toLowerCase();
                if(h.lastIndexOf(st.toLowerCase())!=-1){
                    list.add(i.toString());
                }//end of inner if
            }//end of for
        }
        
        return list;
    }
    public Book buyBook(String suid){
        int index = -1;
        for(int i = 0;i<booklist.size();i++){
            Book x = booklist.get(i);
            if(Integer.toString(x.getSellerID()).compareTo(suid)==0)
                index = i;
        }
        int sz = booklist.size();
        try{    
           FileWriter fw=new FileWriter("Bookstock.csv");    
           fw.write("SUBJECT CODE,ITEM NAME,PRICE,AUTHOR,SELLER ID");
           
           Book r = booklist.get(index);
           for(int i = 0;i<sz-1;i++){
               if(i!=index){
                   Book b = booklist.get(i);
                   fw.write("\n"+b.getSubj()+","+b.getItemName()+","+Float.toString(b.getPrice())+","+b.getAuthor()+","+Integer.toString(b.getSellerID()));
               }
           }
           
           fw.close(); 
           return r; 
          }catch(Exception e){System.out.println(e);}
        return null;
    }
    public Equipment buyEquipment(String suid){
        int index = -1;
        for(int i = 0;i<eqtlist.size();i++){
            Equipment x = eqtlist.get(i);
            if(Integer.toString(x.getSellerID()).compareTo(suid)==0)
                index = i;
        }
        int sz = eqtlist.size();
        if(index==-1)return null;
        Equipment r = eqtlist.get(index);
        try{    
           FileWriter fw=new FileWriter("Equipmentstock.csv");  
           fw.write("SUBJECT CODE,ITEM NAME,PRICE,LINK TO PDF,SELLER ID");
           for(int i = 0;i<sz-1;i++){
               if(i!=index){
                   Equipment b = eqtlist.get(i);
                   fw.write("\n"+b.getSubj()+","+b.getItemName()+","+Float.toString(b.getPrice())+","+b.getLink()+","+Integer.toString(b.getSellerID()));
               }
           }
           
           fw.close(); 
           return r; 
          }catch(Exception e){System.out.println(e);}
        return null;        
        
    }
    public static void main(String args[]){
        StoreManager ob = new StoreManager();
        ob.init();
        //System.out.print(ob.booklist.size());
        //assert ob.booklist.size() > 0;
        //ob.addItem(new Book("CS502","OOP book",200.0f,"A K Deb",2114));
        //assert ob.booklist.size() == 3;
        //ob.addItem(new Equipment("CS502","OOP book",200.0f,"www.wang.marbe.com",2114));
        //assert ob.eqtlist.size() > 0;
        //System.out.println(ob.eqtlist.size()+"   "+ob.booklist.size());
        /**
        ArrayList<String> t = ob.getList("compiler", 0);
         System.out.println(ob.booklist.size());
        for(String i:t){
            System.out.println(i);
        }
        */
        
        /**
        Book p = ob.buyBook("1111");
        if(p!=null)
            System.out.println(p.toString());
        */
        /**
        Equipment q = ob.buyEquipment("1112");
        if(q!=null){
            System.out.println(q.toString());
        }
        * */
        new EStoreUI().setVisible(true);
        
    }
}
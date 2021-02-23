
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mainak
 */



import java.util.*;
import java.io.*;
public class NotesManager {
    private ArrayList<Resource> list;
    private ArrayList<String> urls; 
    //Function to return list of books for chosen subject code
    //returned list would be displayed in dropdown menu - combo box format
    public boolean init(){
        list = new ArrayList<>();
        urls = new ArrayList<>();
        try{
            FileReader ux1 = new FileReader("Books.csv");
            BufferedReader br = new BufferedReader(ux1);
            String line=br.readLine();
            while(line!=null){
                line=br.readLine();
                if(line==null)
                    break;
                String[] sb = line.split(",");//subject code first token in csv
                //comparing subject code
                
                list.add(new Resource(sb[0],sb[1],sb[2],sb[3]));
                          
            }
            //System.out.println(list.size()); 
            br.close();
            
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
        return true;
    }
    //object of Resource class passed to be uploaded to Library.csv file
    public boolean uploadNotes(Resource ob){
        try{
            
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter("Books.csv", true)); 
            out.write("\n"+ob.getSubj()+","+ob.getName()+","+ob.getAuthor()+","+ob.getLink()); 
            out.close(); 
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return true;
    }
    
    
    public ArrayList<Resource> getList(){
        return list;
    }
    
    public ArrayList<String> getUrls(){
        return urls;
    }
   
    
    public ArrayList<Resource> searchNotes(String sr){
        ArrayList<Resource> temp=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            
            String subj=list.get(i).getSubj();
            if(subj.endsWith(sr)){
                urls.add(list.get(i).getLink());
                temp.add(list.get(i));
            }
        }
        return temp;    
    }
    /**
    public static void main(String args[]){
        NotesManager x2 = new NotesManager();
        assert(x2.init() == true);
        
        //assert x2.searchNotes("CS501").size() > 0;
        
        //x2.uploadNotes(new Resource("ESC501","OS","MAINAK","WWW."));
        //new uploadUI().setVisible(true);
        
  }
  * */
}
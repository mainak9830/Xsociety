/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeepRoy
 */
import java.util.*;
import java.io.*;
public class UserManager {
    private ArrayList<User> list;
    public boolean init(){
        list=new ArrayList<>();
        try{
            FileReader r = new FileReader("Users.csv");
            BufferedReader br = new BufferedReader(r);
            String line=br.readLine();
            while(line!=null){
                line=br.readLine();
                if(line==null)
                    break;
                String[] u = line.split(",");
                list.add(new User(u[0],u[1],u[2],u[3],u[4],u[5]));
                          
            } 
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
        return true;
    }
    public boolean register(User ob){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("Users.csv", true));
            out.write(ob.getUniqueid()+","+ob.getPassword()+","+ob.getYear()+","+ob.getDepartment()+","+ob.getEmail()+","+ob.getContactno());
            ob.hash();
            list.add(ob);
            out.close(); 
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return true;
    }
     public ArrayList<User> getList(){
        return list;
    }
     public User searchUser(String uid){
        //ArrayList<User> temp=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            
            String unique=list.get(i).getUniqueid();
            if(unique.compareTo(uid)==0)
                return(list.get(i));
        }
        return null;   
    }
    public User checkUser(String uid,String pwd){
        User x = searchUser(uid);
        //System.out.println(x.toString());
        if(x != null){
            System.out.println("Check if "+x.getPassword()+" = "+pwd);
            if(x.getPassword().compareTo(pwd)==0){
                return x;
            }
        }
        return null;
    } 
  
    public static void main(String[] args){
        UserManager ob1 = new UserManager();
        ob1.init();
        //assert ob1.list.size() ==2;//check if file is completely read into arraylist or not
        //ob1.register(new User("3333","bababholanath","3rd","CSE","xyz@gmail.com","90900093"));
        assert ob1.list.size() == 3;//check if new User added to list or not
        User x = ob1.searchUser("1111");
        assert x !=null;
        System.out.println(x.toString());
        
        //User y = ob1.checkUser("2000", "duhbwehbweihwieiewb");//wrong login credentials check
        //assert y == null;
        
        User z = ob1.checkUser("1111", "abcd");//right credential check
        assert z != null;
        System.out.println(z.toString());
     }
}

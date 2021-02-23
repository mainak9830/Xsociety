import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;
import java.lang.*;
import java.net.*;
import java.util.*;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class TransactionManager implements Serializable{
	String itemname;
	String path;
	String  desktopPath;
	
	//init
	{
		desktopPath = System.getProperty("user.home") + "/Desktop/";
		  path=desktopPath.replace("\\", "/");
	}
    public String generateReceipt(String buyerD,String sellerD,String ItemD){
        String hash_input=(getMd5(buyerD.concat(sellerD))).substring(0,7);
        System.out.println(hash_input);
                   Date obj=new Date();
                   String date=obj.toString(); 
                    try
                    {
                    FileWriter fo=new FileWriter(path+hash_input+"MyReceipt.txt");

                    fo.write("       *****************************************************************\n");
                    fo.write("                                      RECEIPT    \n");
                    fo.write("        ****************************************************************\n");

                     fo.write(date+"\n\n");

                     fo.write("SELLER DETAILS\n");
                     fo.write(sellerD+"\n\n");


                     fo.write("BUYER DETAILS\n");
                     fo.write(buyerD+"\n\n");

                     fo.write(ItemD+"\n");
                     fo.write("Unique transaction code: "+hash_input+"\n");

                     fo.close();		  
                     return hash_input;
                    }
                    catch(Exception e)
                    {
                            System.out.println(e);
                            return "";
                    }
    }
    public static String getMd5(String input) 
    { 
        try {            
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            byte[] messageDigest = md.digest(input.getBytes()); 
          
            BigInteger no = new BigInteger(1, messageDigest); 
        
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
      
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }	
    /**
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User buy=new User("1290","bybye123","3rd","Computer Science","kmghf@gmail.com","7890267000");
		//User sell=new User("Manju",456);
		Item i=new Item("LabCoat","PCC-CS501",774.0f,4456);
		User sell=new User("4456","hello123","2nd","Computer Science","maitriroy122@gmail.com","7890267119");
                                  Book b1 = new Book("ESC501","book1",500.0f,"DK",2000);
                                  Equipment e1 = new Equipment("ESC501","eqp1", 300.0f, "www.bing.com",3000);
		TransactionManager s1=new TransactionManager();
                                  TransactionManager s2=new TransactionManager();
                                  //s1.init(buy,sell,b1);
                                  //s2.init(buy,sell, e1);
                                  //s1.generateReceipt();
                                  //s2.generateReceipt();
	}
        * */
}
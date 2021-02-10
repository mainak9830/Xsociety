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

	private String sellerID;
	 private String buyerID;
	 private String year_buyer;
	 private String year_seller;
	 private String department_seller;
	 private String department_buyer;
	 private String email_buyer;
	 private String email_seller;
	 float price;
	 String labcode;
	
	String itemname;
	String path;
	String  desktopPath;
	
	//init 
	{
		desktopPath = System.getProperty("user.home") + "/Desktop/";
		  path=desktopPath.replace("\\", "/");
	}
	
	TransactionManager (User buyer,User seller,Item it)
	{ 
		
	    sellerID=seller.getUniqueid();
	    buyerID=buyer.getUniqueid();
		price=it.getPrice();
		year_buyer=buyer.getYear();
		year_seller=seller.getYear();
	    department_buyer=buyer.getDepartment();
	     assert(Pattern.matches("^[a-zA-Z]+",department_buyer)):"Invalid Department";
	     assert(Pattern.matches("^[a-zA-Z]+",department_seller)):"Invalid Department";
		 itemname=it.getItemName();
		 assert(Pattern.matches("^[a-zA-Z]+",itemname)):"Invalid itemname";
		 labcode=it.getSubj();
		 email_seller=seller.getEmail();
		 email_buyer=buyer.getEmail();		 
		 
		 String hash_input=getMd5(sellerID+buyerID+itemname+" ");
		
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
		  fo.write("Seller ID: "+sellerID+"\n");
		  fo.write("Year of Enrollment : "+year_seller+"\n");
		  fo.write("Department: "+department_seller+"\n");
		  fo.write("Email: "+email_seller+"\n\n");
		  
		  
		  fo.write("BUYER DETAILS\n");
		  fo.write("Buyer ID: "+buyerID+"\n");
		  fo.write("Year of Enrollment : "+year_buyer+"\n");
		  fo.write("Department: "+department_buyer+"\n");
		  fo.write("Email "+email_buyer+"\n\n");
		  
		  fo.write("Itemname: "+itemname+"\n");
		  fo.write("Price: "+price+"\n");
		  fo.write("Unique transaction code: "+hash_input+"\n");
		  
		  fo.close();		  
		 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User buy=new User("1290","bybye123","3rd","Computer Science","kmghf@gmail.com","7890267000");
		//User sell=new User("Manju",456);
		Item i=new Item("LabCoat","PCC-CS501",774.0f,4456);
		User sell=new User("4456","hello123","2nd","Computer Science","maitriroy122@gmail.com","7890267119");
		TransactionManager s=new TransactionManager(buy,sell,i);
	}
}
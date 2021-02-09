
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeepRoy
 */
public class User {
    private String uniqueid;
    private String password;
    private String year;
    private String department;
    private String email;
    private String contactno;
User(String uid,String passwd,String yr,String dept,String em,String cno){
    this.uniqueid=uid;
    this.password=passwd;
    this.year=yr;
    this.department=dept;
    this.email=em;
    this.contactno=cno;
    }
public String getUniqueid(){
    return this.uniqueid;
}
public String getPassword(){
    return this.password;
}
public String getYear(){
    return this.year;
}
public String getDepartment(){
    return this.department;
}
public String getEmail(){
    return this.email;
}
public String getContactno(){
    return this.contactno;
}
    @Override
    public String toString(){
    return this.uniqueid+" "+this.password+" "+this.year+" "+this.department+" "+this.email+" "+this.contactno;
}
     public void hash() 
    { 
        String input = this.password;
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            this.password = hashtext; 
        }  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }
     
     public String hash1(String input) 
    { 
        
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }

}



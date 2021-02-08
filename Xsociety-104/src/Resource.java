/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */
public class Resource {
    private String subj;
    private String name;
    private String author;
    private String link;
    Resource(String s,String n,String a,String l){
        this.subj = s;
        this.name = n;
        this.author = a;
        this.link = l;
    }
    public String getName(){
        return this.name;
    }
    public String getSubj(){
        return this.subj;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getLink(){
        return this.link;
    }
    public String toString(){
        return this.subj+" "+this.name+" "+this.author+" "+this.link;
    }
    
}

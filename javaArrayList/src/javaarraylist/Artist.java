/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class Artist {
    
    private String name; 
    private String single;
    private String genre;
    
    public Artist(String name, String single, String genre){
        
        this.name = name;
        this.single = single;
        this.genre = genre; 
           
    }
    
    public String toString(){
        
        String str = "\n\nName: " + name + "\nSingle: " + single + "\nGenre: " + genre;
        
        return str;
    }
}

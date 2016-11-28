/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;
import java.util.ArrayList;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Artist> music = new ArrayList<>();
        
        music.add(new Artist("Kaskade", "One Heart", "House"));
        music.add(new Artist("Headhunterz", "Another You", "Trap"));
        music.add(new Artist("Getter", "Forget It", "DubStep"));
        
        for (int i = 0; i < music.size(); i++){
            
            Artist musician = music.get(i);
            System.out.println("\nArtist at index " + i + " are as follows: " + musician.toString());
        }
        
        System.out.println("\n\nNow lets see if we can add another artist into index 1 and push the other 2 artists down.");
        music.add(1, new Artist("Laidback Luke", "Show Me Love", "House"));
        
        System.out.println("Let's see if we have successfully added Laidback Luke into out array list.");
        for (int i = 0; i < music.size(); i++){
            
            Artist musician = music.get(i);
            System.out.println("\nArtist at index " + i + " are as follows: " + musician.toString());
        }
        
        System.out.println("\n\nLet's try removing an artist from our ArrayList.");
        music.remove(2);
        System.out.println("Let's see if we have successfully removed Headhunterz in our array list.");
        for (int i = 0; i < music.size(); i++){
            
            Artist musician = music.get(i);
            System.out.println("\nArtist at index " + i + " are as follows: " + musician.toString());
        }
    }
    
}

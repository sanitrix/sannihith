/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Random;
/**
 *
 * @author Pranay
 */
public class Pool {
    private String[] words = {"india", "australia", "pakistan", "germany", "france", "japan", "afghanistan", "bhutan", "brazil", "united states", "china", "greece", "hong kong", "indonesia", "ireland", "mexico", "north korea", "new zealand", "philippines", "qatar", "saudi arabia", "south africa", "south korea", "sri lanka", "switzerland", "united kingdom", "zimbabwe"};
    public String getRandomWord(){
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(words.length);
        return this.words[randomInt];
    }
    
}

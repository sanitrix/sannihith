/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

//import static hangman.Hangman.word;

import javax.swing.JLabel;


/**
 *
 * @author Pranay
 */
public class Word {
    private String currentWord;
    private int currentWordLength;
    private String[][] lettersArray;
    
    public void initialize(String word){
        //System.out.println(word.charAt(0));
        this.currentWord = word;
        this.currentWordLength = word.length();
        this.lettersArray = new String[2][this.currentWordLength];
        for(int i=0; i<this.currentWordLength; i++){
            this.lettersArray[0][i] = Character.toString(word.charAt(i));
            if(this.currentWord.charAt(i) == ' '){
                this.lettersArray[1][i] = "2";
            } else {
                this.lettersArray[1][i] = "0";
            }
            
            
            //System.out.print(this.lettersArray[1][i]);
        }
        /*for(int i=0; i<this.currentWordLength; i++){
                System.out.print(this.lettersArray[0][i] + " ");
        }
        System.out.println();
        for(int i=0; i<this.currentWordLength; i++){
                System.out.print(this.lettersArray[1][i] + " ");
        }*/
    }
    public String getCurrentWord(){
        return this.currentWord;
    }
    public int getCurrentWordLength(){
        return this.currentWordLength;
    }
    public String[][] getLettersArray(){
        return this.lettersArray;
    }
    public void updateLettersArray(String[][] newArray){
        //System.out.println("inside updateLettersArray of word");
        for(int i=0; i<this.currentWordLength; i++){
            this.lettersArray[0][i] = newArray[0][i];
            this.lettersArray[1][i] = newArray[1][i];
        }
        /*for(int i=0; i<this.currentWordLength; i++){
                System.out.print(this.lettersArray[0][i] + " ");
        }
        System.out.println();
        for(int i=0; i<this.currentWordLength; i++){
                System.out.print(this.lettersArray[1][i] + " ");
        }*/
        
    }
}

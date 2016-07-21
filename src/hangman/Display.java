/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.JLabel;

/**
 *
 * @author Pranay
 */
public class Display {
    Word word;
    
    public void displayWord(Word word, JLabel display){
        this.word = word;
        String[][] lettersArray = this.word.getLettersArray();
        String displayString = "";
        for(int i=0; i<this.word.getCurrentWordLength(); i++){
            if("0".equals(lettersArray[1][i])){
                displayString += "_ ";
            } else if("1".equals(lettersArray[1][i])) {
                displayString += lettersArray[0][i]+ " ";
            } else if("2".equals(lettersArray[1][i])) {
                displayString += "  ";
            }
        }
        display.setText(displayString);
    }
    public void initializeBlanks(Word word, JLabel display){
        this.word = word;
        String[][] lettersArray = this.word.getLettersArray();
        String displayString = "";
        for(int i=0; i<this.word.getCurrentWordLength(); i++){
            if("0".equals(lettersArray[1][i])){
                displayString += "_ ";
            } else if("1".equals(lettersArray[1][i])) {
                displayString += lettersArray[0][i]+ " ";
            } else if("2".equals(lettersArray[1][i])) {
                displayString += "  ";
            }
        }
        display.setText(displayString);
    }
    public void displaySaveMe(UserStatus userStatus, JLabel saveMe){
        //livces
        if(userStatus.hasWon()){
            saveMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/won.gif")));
        } else {
            saveMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/"+userStatus.getLivesLeft()+".png")));
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Pranay
 */
public class UserStatus {
    private int livesLeft, noOfBlanks, noOfLettersUpdated;
    private boolean won, lost;
    Word word;

    public void initialize(Word word){
        this.word = word;
        this.livesLeft = 6;
        //Word word = new Word();
        this.noOfBlanks = this.word.getCurrentWordLength();
        this.won = false;
        this.lost = false;
    }
    public void checkAndUpdate(Word word, String inputLetter){
        //System.out.println("inside check and update in userStatus");
        this.word = word;
        noOfLettersUpdated = 0;
        String[][] lettersArray = word.getLettersArray();
        for(int i=0; i<word.getCurrentWordLength(); i++){
            if((!"1".equals(lettersArray[1][i])) && (lettersArray[0][i].equals(inputLetter))){
                lettersArray[1][i] = "1";
                this.noOfLettersUpdated++;
            }
        }
        if(this.noOfLettersUpdated == 0){
            this.livesLeft--;
            if(this.livesLeft == 0){
                System.out.println("YOU LOSE");
                this.lost = true;
            }
        } else {
            this.noOfBlanks -= this.noOfLettersUpdated;
            word.updateLettersArray(lettersArray);
            if(this.word.getCurrentWord().indexOf(" ") >= 0){
                if(this.noOfBlanks == 1){
                this.won = true;
                }
            } else if(this.word.getCurrentWord().indexOf(" ") == -1){
                if(this.noOfBlanks == 0){                
                this.won = true;
                }
            }
            
        }
    }
    public boolean hasWon(){
        return won == true;
    }
    public boolean hasLost(){
        return lost == true;
    }
    public int getLivesLeft(){
        return this.livesLeft;
    }
}

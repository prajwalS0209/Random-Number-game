import java.util.Random;
import java.util.Scanner;

class RandomNumberGame{
    public int number;
    public int targetNum;
    public int attempts = 1;
    
    // Creating the Random Number
    RandomNumberGame() {
        Random value = new Random();
        targetNum = value.nextInt(100);
    }

    void userInput() {
        System.out.println("Enter your guess:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }

    boolean isCorrect() {
            attempts ++;
            if (number ==  targetNum) {
                System.out.println("you guessed it correct");
                return true;
                
            } 
            else if(number < targetNum){
                System.out.println("the number you entered is lesser....try Again!!! ");               
            }
            else {
                System.out.println("the number you entered is higher....try Again!!!");             
            }
            return false;
        
    }

    public int getTargetNum() {
        return targetNum; // to check the random number
    }
    public int getAttempts(){
        return attempts;
    }
    public int getNumber(){
        return number;
    }

}

public class GuessTheNumber {

    public static void main(String[] args) {

        

        RandomNumberGame start = new RandomNumberGame();
        boolean asli = false;
        while(!asli){
            start.userInput();
            asli = start.isCorrect(); 
        }  
        
        System.out.println("your score for the current round is  : " + start.getAttempts());
    }
}
package number_guessing_game;

import java.util.*; 

public class GuessTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while(true){
            System.out.println("Guess the number (between 0 to 100) in 6 attempts: ");
            int number = sc.nextInt();
            int randInt = rand.nextInt(101);  
            int count = 6;
            if(number>100 || number<0){
                System.out.println("Invalid Input");
            }else{
                while(count>0){
                    if(number<randInt && number>=0){
                        System.out.println("Too Low!");
                        if(count == 1){
                            System.out.println("You are out of chances");
                        }else{
                            number = sc.nextInt();
                        }
                    }else if(number>randInt && number<=100 ){
                        System.out.println("Too High!");
                        if(count == 1){
                            System.out.println("Your are out of chances");
                        }else{
                            number = sc.nextInt();
                        }
                    }else if(number == randInt){
                        System.out.println("Congratulations! You guessed correctly.");
                        break;
                    }else{
                        System.out.println("Invalid Input");
                        break;
                    }
                    count--;
                }
            }
            System.out.println("If you want start over the game: (enter Y or N)");
            char p = sc.next().charAt(0);
            if(p=='N'){
                System.out.println("Game Over");
                break;
            }else if(p!='Y' && p!='N'){
                System.out.println("Invalid input");
                break;
            }
            
        }
        sc.close();
    }
}

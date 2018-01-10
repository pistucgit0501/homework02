package homework02;
import java.math.*;
import java.util.Random;
import java.util.*;

public class Game {
    public void playBarchobaWithNumbers(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(50);
        int firstPlayerSteps=10;
        int secondPlayerSteps=10;
        int firstPlayerVote=0;
        int seconPlayerVote=0;
        if(firstPlayerSteps == secondPlayerSteps){
            if(firstPlayerSteps!=0){
                firstPlayerSteps--;
                System.out.println("Még"+firstPlayerSteps+"lépés van hátra");
                System.out.println("Kérem a játékos tippjét");
                firstPlayerVote =scanner.nextInt();
                if(firstPlayerVote==num){
                    System.out.println("A játékos nyert");

                }
                else if(firstPlayerVote>num) {
                    System.out.println("A Gondolt szám kisebb");
                }
                else if(firstPlayerVote<num) {
                    System.out.println("A Gondolt szám nagyobb");
                }
            }
            else {
                System.out.println("Nincs Több lépés");
            }
        }
        else {

            if (secondPlayerSteps!=0){
                secondPlayerSteps--;
                System.out.println("Még"+secondPlayerSteps+"lépés van hátra");
                seconPlayerVote=random.nextInt(50);
                if(seconPlayerVote==num){
                    System.out.println("A gép nyert");

                }
                else if(seconPlayerVote>num) {
                    System.out.println("A Gondolt szám kisebb");
                }
                else if(seconPlayerVote<num) {
                    System.out.println("A Gondolt szám nagyobb");
                }
            }
            else {
                System.out.println("Nincs Több lépés");
            }

            }
        }


    }





package thedepths;

import java.util.Scanner;

public class StatSetter {
    
    
    //formula is (weight* height)/(age)

    //act as sentinels for if statements
    private final int QUARTILE_1 = 400;
    private final int QUARTILE_2 = 950;
    private final int QUARTILE_3 = 1500;
    //private  int total = ((weight * height) / (age));

    private int playerHealth;
    private int playerAttack;

   
      
    //getters
    public int getTotal(InfoGrabber infoObj) {
        return ((infoObj.weight * infoObj.height) / (infoObj.age));
    }

    public int getPlayerHealth() {

        return playerHealth;

    }

    public int getPlayerAttack() {

        return playerAttack;

    }

    //setter
    public void setPlayerHealth(int h) {

        playerHealth = h;

    }

    //sets stats based on player total
    public void setStats(InfoGrabber infoObj){
        
        //if total is less than or equal to 400, then set
        if ((infoObj.weight * infoObj.height) / (infoObj.age) <= QUARTILE_1) {

            playerHealth = 50;
            playerAttack = 30;

            //if total is above 450 but lessthan/equalto 950, then set
        } else if (((infoObj.weight * infoObj.height) / (infoObj.age)) <= QUARTILE_2) {

            playerHealth = 100;
            playerAttack = 50;

            //if total is above 950, but lessthan/equalto 1500
        } else if ((infoObj.weight * infoObj.height) / (infoObj.age) <= QUARTILE_3) {

            playerHealth = 150;
            playerAttack = 90;

        }
        //none for above 1500, because easteregg. if above 1500 then you automatically win and skip the combat

        //gain 20 health if at athetlic peak ages
        if (infoObj.age > 17 & infoObj.age < 35) {
            playerHealth += 20;
        }

        
    }
    //passes in infoObj, notice how it does not call it because if you called it then it would call the prompts
    public StatSetter(InfoGrabber infoObj) {
      
    }
}

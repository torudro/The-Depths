package thedepths;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FightAI {

    //used for random number calculation
    protected static Random num = new Random();

    protected static ArrayList<Integer> deathCount = new ArrayList();

    //if you are not dead, then you progress.
    Messages msgObj = new Messages();
    StatSetter statObj = new StatSetter();
    Scanner scan = new Scanner(System.in);
    String option;

    public void AI() {
        //used with deathCount list to display the sum of values in deathCount
        int store = 0;

        //used to hold randomInt to determine if player has found item
        int randomInt;
        //values for enemy stats
        int enemyHealth;
        int enemyAttack;
        //vital to loop. once you find the item, then you progress.
        int itemCount = 0;

        int healthHolder = 0;
        if (statObj.getPlayerHealth() > 0) {
            msgObj.getDepthsEntryMsg();
            //This loop goes until the user finds a particular item. Once the item is found, the user progresses.
            while (itemCount < 1) {
                //randomly generated numbers... 1+ because random class acts as arrays in that sense where they would go 0 to 5 if 6 was passed in
                enemyHealth = 1 + num.nextInt(100);

                System.out.printf("\nAn unknown charges... what do you do?\n"
                        + "[a] attack \n"
                        + "[b] guard\n");
                option = scan.next();
                //ATTACK
                if (option.equals("a")) {
                    //enemy attack is higher if you choose to attack because you are not on guard
                    enemyAttack = 1 + num.nextInt(70);
                    //takes enemyhealth based on user attack amnt
                    while (enemyHealth > 0) {
                        enemyHealth -= statObj.getPlayerAttack();
                        //this prevents negative outputs of enemyHealth, BUT it makes it so if you kill the unknown in one hit, then it doesn't display its health
                        if (enemyHealth > 0) {
                            msgObj.getSeparator();
                            System.out.print("The unknown attacked you!");
                            if (statObj.getPlayerHealth() <= 0) {
                                msgObj.getDeath();
                                //if you are dead, the program terminates.
                                System.exit(0);
                            }
                            System.out.print(" Your health: " + statObj.getPlayerHealth() + ".");
                            System.out.println(" You attacked the unknown. Its current health: " + enemyHealth + ". ");

                            //modifies player health 
                            healthHolder = statObj.getPlayerHealth();
                            healthHolder -= enemyAttack;
                            statObj.setPlayerHealth(healthHolder);
                        }
                        //if enemy health has reached 0 or below, generate number and if number matches 420, then give itemcount++ 
                        if (enemyHealth <= 0) {
                            msgObj.getSeparator();
                            System.out.println("You killed the unknown. ");
                            deathCount.add(1);
                            for (int i = 0; i < deathCount.size(); i++) {
                                store += deathCount.get(i);
                            }

                            System.out.println("Total unknowns slain: " + store);
                            randomInt = 1 + num.nextInt(500);
                            if (randomInt == 420) {
                                itemCount++;
                            }
                        }
                        if (statObj.getPlayerHealth() <= 0) {
                            msgObj.getDeath();
                            //if dead, program terminates
                            System.exit(0);
                        }
                    }

                } else if (option.equals("b")) {
                    //enemy attack is lower because you are on guard
                    enemyAttack = 1 + num.nextInt(20);
                    msgObj.getSeparator();
                    System.out.println("You guard yourself with your sword the best you can manage. The unknown strikes.");
                    //modifies player health 
                    healthHolder = statObj.getPlayerHealth();
                    healthHolder -= enemyAttack;
                    statObj.setPlayerHealth(healthHolder);
                    if (statObj.getPlayerHealth() <= 0) {
                        msgObj.getDeath();
                        System.exit(0);
                    } else {
                        System.out.println("Your health: " + statObj.getPlayerHealth());
                    }
                }
            }
        }
    }
}

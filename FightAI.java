package thedepths;

public class FightAI extends Runner {
//for loop useage

    private static int store = 0;

    //if you are not dead, then you progress.
    public void AI() {
        if (health > 0) {
            System.out.println(depthEntrance());
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
                    enemyAttack = 1 + num.nextInt(40);
                    //takes enemyhealth based on user attack amnt
                    while (enemyHealth > 0) {
                        enemyHealth -= attack;
                        //this prevents negative outputs of enemyHealth, BUT it makes it so if you kill the unknown in one hit, then it doesn't display its health
                        if (enemyHealth > 0) {
                            System.out.println(seperator());
                            System.out.print("The unknown attacked you!");
                            if (health <= 0) {
                                System.out.println(death());
                                //if you are dead, the program terminates.
                                System.exit(0);
                            }
                            System.out.print(" Your health: " + health + ".");
                            System.out.println(" You attacked the unknown. Its current health: " + enemyHealth + ". ");

                            health -= enemyAttack;
                        }
                        //if enemy health has reached 0 or below, generate number and if number matches 420, then give itemcount++ 
                        if (enemyHealth <= 0) {
                            System.out.println(seperator());
                            System.out.println("You killed the unknown. ");
                            deathCount.add(1);
                            for (int i = 0; i < deathCount.size(); i++) {
                                store += deathCount.get(i);
                            }

                            System.out.println("Total unknowns slain: " + store);
                            hold = 1 + num.nextInt(500);
                            if (hold == 420) {
                                itemCount++;
                            }
                        }
                        if (health <= 0) {
                            System.out.println(death());
                            System.exit(0);
                        }
                    }

                } else if (option.equals("b")) {
                    //enemy attack is lower because you are on guard
                    enemyAttack = 1 + num.nextInt(20);
                    System.out.println(seperator());
                    System.out.println("You guard yourself with your sword the best you can manage. The unknown strikes.");
                    health -= enemyAttack;
                    if (health <= 0) {
                        System.out.println(death());
                        System.exit(0);
                    } else {
                        System.out.println("Your health: " + health);
                    }
                }
            }
        }
    }
}

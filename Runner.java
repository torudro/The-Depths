package thedepths;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {
//scanner object created for user input

    static Scanner scan = new Scanner(System.in);

    //combat use... customizability
    protected static int age;
    protected static int height;
    protected static int weight;
    protected static String name;
    //combat
    protected static int itemCount = 0;
    protected static int health;
    protected static int enemyHealth;
    protected static int enemyAttack;
    //used for random number calculation
    protected static Random num = new Random();
    //combat use
    protected static int attack;
    protected static int hold;
    protected static ArrayList<Integer> deathCount = new ArrayList();
    //scanner use
    protected static String option;

    public static void main(String[] args) {
//creates FightAI object to incorpate combat
        FightAI obj = new FightAI();

        //prompts and info taken through scanners
        System.out.println("Welcome to the void. What is your name?");
        name = scan.nextLine();

        System.out.println("How old are you? (years)");
        age = scan.nextInt();

        System.out.println("How tall are you? (inches)");
        height = scan.nextInt();

        System.out.println("How much do you weight? (lbs)");
        weight = scan.nextInt();

        if (height > 70 & weight > 200) {
            health = 100;
            attack = 75;
        } else if (height > 70 & weight < 200) {
            health = 75;
            attack = 50;
        } else if (height < 70 & weight > 200) {

            health = 90;
            attack = 70;
        } else if (height < 70 & weight < 200) {
            health = 50;
            attack = 30;
        }
        //gain 20 health if at athetlic peak ages
        if (age > 17 & age < 35) {
            health += 20;
        }

        System.out.println(screenBlock());

        System.out.printf("You stand in a field. There is a light pole nearby. The moon is fat and red. The cloud is skyless. What do you do? \n"
                + "[a] inspect the lightpole \n"
                + "[b] stay put \n"
                + "[c] Move stealthily away from the light pole and observe from a distance \n");

        option = scan.next();
        System.out.println(seperator());
//  OUTER A IF INSPECT LIGHT POLE
        if (option.equals("a")) {

            System.out.printf("\n" + lightPoleTowards() + "\n");
            option = scan.next();
            System.out.println(seperator());
            //CLIMB THE LIGHT POLE AFTER MOVING CLOSER *PROMPTED BY OUTTER IF*
            if (option.equals("a")) {

                System.out.printf("\n" + climbLightPole() + "\n");
                option = scan.next();
                System.out.println(seperator());
                //STAY ON LIGHT BULB
                if (option.equals("a")) {

                    System.out.printf("\n" + stayOnLightPole() + "\n");
                    option = scan.next();
                    System.out.println(seperator());
                    //JUMP FROM LIGHTPOLE... DIE
                    if (option.equals("a")) {

                        System.out.printf("\n" + death() + "\n");
                        health = 0;
                        System.out.println(seperator());
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        System.out.printf("\n" + woosh() + "\n");
                    }

                    //  TRANSPORT
                } else if (option.equals("b")) {

                    System.out.printf("\n" + woosh() + "\n");
                }
                //WAIT DIALOGUE *PROMPTED BY OUTTER IF*
            } else if (option.equals("b")) {

                System.out.printf(waitDialogue() + "\n"
                        + "[a] WAIT LONGER \n "
                        + "[b] walk towards the light pole\n");

                option = scan.next();
                System.out.println(seperator());
                //TRANSPORT.
                if (option.equals("a")) {

                    System.out.printf("\n" + woosh() + "\n");
                    // INSPECT LIGHT POLE
                } else if (option.equals("b")) {

                    System.out.printf("\n" + lightPoleTowards() + "\n");
                    option = scan.next();
                    System.out.println(seperator());
                    //CLIMB LIGHT POLL
                    if (option.equals("a")) {

                        System.out.printf("\n" + climbLightPole() + "\n");
                        option = scan.next();
                        System.out.println(seperator());
                        //STAY PUT ON LIGHTBULB
                        if (option.equals("a")) {

                            System.out.printf("\n" + stayOnLightPole() + "\n");
                            option = scan.next();
                            System.out.println(seperator());
                            //JUMP FROM LIGHT POLE
                            if (option.equals("a")) {

                                System.out.printf("\n" + death() + "\n");
                                health = 0;
                                //TRANSPORT.
                            } else if (option.equals("b")) {

                                System.out.printf("\n" + woosh() + "\n");

                            }
                            //TRANSPORT.
                        } else if (option.equals("b")) {

                            System.out.printf("\n" + woosh() + "\n");
                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        System.out.printf("\n" + woosh() + "\n");

                    }
                }

            }

//OUTER B IF
        } else if (option.equals("b")) {

            System.out.printf(waitDialogue() + "\n"
                    + "[a] Walk towards the lightpole. \n"
                    + "[b] wait longer \n");
            option = scan.next();
            System.out.println(seperator());
            //INSPECT LIGHTPOLE *PROMPTED BY B OUTTER*
            if (option.equals("a")) {
                System.out.printf(lightPoleTowards());

                option = scan.next();
                System.out.println(seperator());
                if (option.equals("a")) {

                    System.out.printf(climbLightPole());

                    option = scan.next();
                    System.out.println(seperator());
                    if (option.equals("a")) {

                        System.out.println(stayOnLightPole());

                        option = scan.next();
                        System.out.println(seperator());
                        if (option.equals("a")) {

                            System.out.printf("\n" + death() + "\n");
                            health = 0;
                        } else if (option.equals("b")) {

                            System.out.println(woosh());

                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        System.out.println(woosh());
                    }

                    //TRANSPORT.
                } else if (option.equals("b")) {

                    System.out.printf("\nSomething begins to sprint at you... \n" + woosh() + "\n");

                }
                // WAIT DIALOGUE *PROMPTED BY B OUTTER*
            } else if (option.equals("b")) {

                System.out.printf(waitDialogue() + "\n"
                        + "[a] WAIT LONGER \n "
                        + "[b] Climb the light pole\n");

                option = scan.next();
                System.out.println(seperator());
                //TRANSPORT.
                if (option.equals("a")) {

                    System.out.printf("\n" + woosh() + "\n");

                } //CLIMB LIGHT POLE
                else if (option.equals("b")) {

                    System.out.printf(climbLightPole());
                    option = scan.next();
                    System.out.println(seperator());
                    //STAY ON LIGHT POLE
                    if (option.equals("a")) {

                        System.out.printf(stayOnLightPole());
                        option = scan.next();
                        System.out.println(seperator());
                        //JUMP FROM LIGHT POLE (DIE)
                        if (option.equals("a")) {

                            System.out.printf("\n" + death() + "\n");
                            health = 0;
                            //TRANSPORT.
                        } else if (option.equals("b")) {

                            System.out.printf("\n" + woosh() + "\n");
                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        System.out.println("\n" + woosh() + "\n");
                    }
                }

            }

        } //OUTER C IF
        else if (option.equals("c")) {

            System.out.printf("You creep away from the lightpole. You are now 150 yards away. You see another light in the opposite direction. "
                    + "You also see a figure near the old lightpole. What do you do? \n"
                    + "[a] run to the light in the opposite direction \n"
                    + "[b] observe what the figure is doing \n");
            option = scan.next();
            System.out.println(seperator());
            //walk to light in opposite direction *PROMPTED BY C OUTTER*
            if (option.equals("a")) {

                System.out.printf("You begin to run to the light in the opposite direction. You hear a growl in the woods next to the field. What do you do?\n"
                        + "[a] keep running to the light you were facing \n"
                        + "[b] go to the edge of the woods\n");
                option = scan.next();
                //TRANSPORT.
                if (option.equals("a")) {

                    System.out.printf("\nA demon runs from the woodline and intercepts you. Something else comes into sight... \n" + woosh() + "\n");
                    //DEATH
                } else if (option.equals("b")) {

                    System.out.printf("\nYou go to the edge of the woods. A demon greets you. " + death() + "\n");
                    System.exit(0);
                }
                //OBSERVE FIGURE *PROMPTED BY C OUTTER*
            } else if (option.equals("b")) {
                System.out.printf("\nThe figure begins to fly to you. \n" + woosh() + "\n");
            }

        }

//calls fight ai
        obj.AI();
        //no need for this to be in an if statement or anything since this will only execute if you find a key. if you don't find a key, you
        //are either dead or quit
        System.out.println("You found a key. You unlock a door that suddenly become visible in front of you. You realize that life has no inherant "
                + "meaning, and that it's merely what you make of it. Have a nice day, folk(s).");

    }

//death message
    public static String death() {

        String n = "You died. You proved useless, " + name + ".";
        return n;

    }

    //option ot stay on light pole
    public static String stayOnLightPole() {

        String n = "You stay and watch the figure. The figure starts climbing the pole. What do you do? \n"
                + "[a] jump off of the light pole \n"
                + "[b] stay on the light pole \n";

        return n;
    }

    //option to climb light pole
    public static String climbLightPole() {

        String n = "You climb the light pole. Once at the top, you can see 4 lights in each distance. You also see a figure at the base of the light. "
                + "What do you do? \n"
                + "[a] stay put \n"
                + "[b] climb down \n";
        return n;
    }

    // "woosh" means to teleport to another state in the game
    public static String woosh() {

        String n = "You are attacked by a figure....";

        return "\n" + n + "\n" + screenBlock();

    }

    //prompt if you elect to wait
    public static String waitDialogue() {

        String n = "You wait. After a while, nothing happens. What do you do?";
        return n;

    }
//prompt if you elect to inspect light pole

    public static String lightPoleTowards() {

        String n = "You slowly creep towards the lightpole. It's wooden and a frail ladder is on its side. You see it has a powerline "
                + "that goes underground. What do you do?\n"
                + "[a] climb the lightpole \n"
                + "[b] stay put \n";

        return n;

    }

    //adds lines for clean look
    public static String seperator() {

        String n = "-------------------------------------------------------------------------------------------------------------";
        return n;
    }

    //used for separating states in the game
    public static String screenBlock() {
        String b = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String n = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~woosh~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String concatenate = b + "\n" + b + "\n" + b + "\n" + b + "\n          " + n + "\n" + b + "\n" + b + "\n" + b + "\n" + b + "\n";

        return concatenate;
    }

    //used when you enter the depth
    public static String depthEntrance() {

        String n = "You wake up in the depth. You have a sword in your hand. You elect yourself to defeat the monsters and get the hell out of this place.";
        return n;
    }

}

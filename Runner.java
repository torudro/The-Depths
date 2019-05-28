package thedepths;

import java.util.Scanner;

public class Runner {
//scanner object created for user input

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //scanner use
        String option;

        //creates InfoGrabber object to incorporate user stats. passes in values.
        InfoGrabber infoObj = new InfoGrabber();

//creates FightAI object to incorpate combat
        FightAI fightObj = new FightAI(infoObj);

        //creates messages object to incorporate plot
        Messages msgObj = new Messages();

        //creates StatSetter object to incorporate use of total variable it contains
        StatSetter statObj = new StatSetter(infoObj);

        msgObj.getScreenBlock();

        msgObj.getVoidEntryMsg();

        option = scan.next();
        msgObj.correctCheck(option);
        msgObj.getSeparator();
//  OUTER A IF INSPECT LIGHT POLE
        if (option.equals("a")) {

            msgObj.getInspectLightPole();
            option = scan.next();
            msgObj.correctCheck(option);
            msgObj.getSeparator();
            //CLIMB THE LIGHT POLE AFTER MOVING CLOSER *PROMPTED BY OUTTER IF*
            if (option.equals("a")) {

                msgObj.getClimbLightPole();
                option = scan.next();
                msgObj.correctCheck(option);
                msgObj.getSeparator();
                //STAY ON LIGHT BULB
                if (option.equals("a")) {

                    msgObj.getStayOnLightPole();
                    option = scan.next();
                    msgObj.correctCheck(option);
                    msgObj.getSeparator();
                    //JUMP FROM LIGHTPOLE... DIE
                    if (option.equals("a")) {

                        msgObj.getDeath();
                        System.out.println(infoObj.getName());
                        System.exit(0);

                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        msgObj.woosh();
                    }

                    //  TRANSPORT
                } else if (option.equals("b")) {

                    msgObj.woosh();
                }
                //WAIT DIALOGUE *PROMPTED BY OUTTER IF*
            } else if (option.equals("b")) {
                msgObj.getWait();
                System.out.printf("\n[a] WAIT LONGER \n "
                        + "[b] walk towards the light pole\n");

                option = scan.next();
                msgObj.correctCheck(option);
                msgObj.getSeparator();
                //TRANSPORT.
                if (option.equals("a")) {

                    msgObj.woosh();
                    // INSPECT LIGHT POLE
                } else if (option.equals("b")) {

                    msgObj.getInspectLightPole();
                    option = scan.next();
                    msgObj.correctCheck(option);
                    msgObj.getSeparator();
                    //CLIMB LIGHT POLL
                    if (option.equals("a")) {

                        msgObj.getClimbLightPole();
                        option = scan.next();
                        msgObj.correctCheck(option);
                        msgObj.getSeparator();
                        //STAY PUT ON LIGHTBULB
                        if (option.equals("a")) {

                            msgObj.getStayOnLightPole();
                            option = scan.next();
                            msgObj.correctCheck(option);
                            msgObj.getSeparator();
                            //JUMP FROM LIGHT POLE
                            if (option.equals("a")) {

                                msgObj.getDeath();
                                System.out.println(infoObj.getName());
                                System.exit(0);

                                //TRANSPORT.
                            } else if (option.equals("b")) {

                                msgObj.woosh();

                            }
                            //TRANSPORT.
                        } else if (option.equals("b")) {

                            msgObj.woosh();
                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        msgObj.woosh();

                    }
                }

            }

//OUTER B IF
        } else if (option.equals("b")) {
            msgObj.getWait();
            System.out.printf("\n[a] Walk towards the lightpole. \n"
                    + "[b] wait longer \n");
            option = scan.next();
            msgObj.correctCheck(option);
            msgObj.getSeparator();
            //INSPECT LIGHTPOLE *PROMPTED BY B OUTTER*
            if (option.equals("a")) {
                msgObj.getInspectLightPole();

                option = scan.next();
                msgObj.correctCheck(option);
                msgObj.getSeparator();
                if (option.equals("a")) {

                    msgObj.getClimbLightPole();

                    option = scan.next();
                    msgObj.correctCheck(option);
                    msgObj.getSeparator();
                    if (option.equals("a")) {

                        msgObj.getStayOnLightPole();

                        option = scan.next();
                        msgObj.correctCheck(option);
                        msgObj.getSeparator();
                        if (option.equals("a")) {

                            msgObj.getDeath();
                            System.out.println(infoObj.getName());
                            System.exit(0);

                            //TRANSPORT
                        } else if (option.equals("b")) {

                            msgObj.woosh();

                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        msgObj.woosh();
                    }

                    //TRANSPORT.
                } else if (option.equals("b")) {

                    System.out.printf("\nSomething begins to sprint at you... \n");
                    msgObj.woosh();

                }
                // WAIT DIALOGUE *PROMPTED BY B OUTTER*
            } else if (option.equals("b")) {

                msgObj.getWait();
                System.out.printf("\n[a] WAIT LONGER \n "
                        + "[b] Climb the light pole\n");

                option = scan.next();
                msgObj.correctCheck(option);
                msgObj.getSeparator();
                //TRANSPORT.
                if (option.equals("a")) {

                    msgObj.woosh();

                } //CLIMB LIGHT POLE
                else if (option.equals("b")) {

                    msgObj.getClimbLightPole();
                    option = scan.next();
                    msgObj.getSeparator();
                    //STAY ON LIGHT POLE
                    if (option.equals("a")) {

                        msgObj.getStayOnLightPole();
                        option = scan.next();
                        msgObj.getSeparator();
                        //JUMP FROM LIGHT POLE (DIE)
                        if (option.equals("a")) {

                            msgObj.getDeath();
                            System.out.println(infoObj.getName());
                            System.exit(0);

                            //TRANSPORT.
                        } else if (option.equals("b")) {

                            msgObj.woosh();
                        }
                        //TRANSPORT.
                    } else if (option.equals("b")) {

                        msgObj.woosh();
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
            msgObj.correctCheck(option);
            msgObj.getSeparator();
            //walk to light in opposite direction *PROMPTED BY C OUTTER*
            if (option.equals("a")) {

                System.out.printf("You begin to run to the light in the opposite direction. You hear a growl in the woods next to the field. What do you do?\n"
                        + "[a] keep running to the light you were facing \n"
                        + "[b] go to the edge of the woods\n");
                option = scan.next();
                msgObj.correctCheck(option);
                //TRANSPORT.
                if (option.equals("a")) {

                    System.out.printf("\nA demon runs from the woodline and intercepts you. Something else comes into sight... \n");

                    msgObj.woosh();
                    //DEATH
                } else if (option.equals("b")) {

                    System.out.printf("\nYou go to the edge of the woods. A demon greets you. \n");
                    msgObj.getDeath();
                    System.out.print(infoObj.getName());
                    System.exit(0);
                }
                //OBSERVE FIGURE *PROMPTED BY C OUTTER*
            } else if (option.equals("b")) {
                System.out.printf("\nThe figure begins to fly to you. \n");

                msgObj.woosh();

            }

        }

//calls fight ai if total less than or qual to 1500. if more than, easter egg
        
        if (statObj.getTotal(infoObj) > 1500) {
            msgObj.getPowerfulBeing();
            msgObj.getEndMessage();
        } else if (statObj.getTotal(infoObj) <= 1500) {
            System.out.println("test1");
            fightObj.AI(infoObj);
            msgObj.getEndMessage();
        }

        //closed the scanner because although it doesn't change functionality, it makes it so java doesn't yell at me.
        scan.close();
    }

}

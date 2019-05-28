package thedepths;

public class Messages {

    public Messages() {

    }

    //message when the game first starts. could have just been a println in main, but it looks cleaner if you just call a method
    public void getVoidEntryMsg() {

        System.out.println("You stand in a field. There is a light pole nearby. The moon is fat and red. The cloud is skyless. What do you do? \n"
                + "[a] inspect the lightpole \n"
                + "[b] stay put \n"
                + "[c] Move stealthily away from the light pole and observe from a distance \n");

    }

    //Used when you enter the depths
    public void getDepthsEntryMsg() {

        System.out.println("You wake up in the depth. You have a sword in your hand. You elect yourself to defeat the monsters and get the hell out of this place.");

    }

    //used data type vs. void because easier to read and output
    public String getScreenBlock() {

        String b = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String n = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~woosh~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String concatenate = b + "\n" + b + "\n" + b + "\n" + b + "\n          " + n + "\n" + b + "\n" + b + "\n" + b + "\n" + b + "\n";

        return concatenate;

    }

    //for readability's sake
    public void getSeparator() {

        System.out.println("-------------------------------------------------------------------------------------------------------------");

    }

    //prompt to teleport to another state in the game
    public void woosh() {

        System.out.printf("\nYou are attacked by a figure...\n" + getScreenBlock());

    }

    //prompts death message
    public void getDeath() {
        System.out.printf("\nYou died. You proved useless, ");
    }

    //prompts inspect lightpole dialogue and options
    public void getInspectLightPole() {

        System.out.printf("You slowly creep towards the lightpole. It's wooden and a frail ladder is on its side. You see it has a powerline "
                + "that goes underground. What do you do?\n"
                + "[a] climb the lightpole \n"
                + "[b] stay put \n");

    }

    //prompts climb lightpole dialogue and options
    public void getClimbLightPole() {

        System.out.printf("You climb the light pole. Once at the top, you can see 4 lights in each distance. You also see a figure at the base of the light. "
                + "What do you do? \n"
                + "[a] stay put \n"
                + "[b] climb down \n");

    }

    //prompts stay on lightpole dialogue and options
    public void getStayOnLightPole() {

        System.out.printf("You stay and watch the figure. The figure starts climbing the pole. What do you do? \n"
                + "[a] jump off of the light pole \n"
                + "[b] stay on the light pole \n");

    }

    //prompts wait
    public void getWait() {

        System.out.println("You elect to wait. After a while, nothing happens. What do you do?");

    }

    //east egg
    public void getPowerfulBeing() {
        System.out.println("Oh! Most powerful being! Here's your key!");
    }

    //end message if you beat the game
    public void getEndMessage() {
        System.out.println("You found a key. You unlock a door that suddenly become visible in front of you. You realize that life has no inherant "
                + "meaning, and that it's merely what you make of it. Have a nice day, folk(s).");
    }

    //prompters
    //prompts name
    void promptName() {
        System.out.println("What is your name?");
    }

    //prompts age
    void promptAge() {
        System.out.println("What is your age? (years)");
    }

    //prompts height
    void promptHeight() {
        System.out.println("What is your height? (inches)");
    }

    //prompts weight
    void promptWeight() {
        System.out.println("What is your weight? (pounds)");
    }

    //exits if user has entered incorrectly.
    void correctCheck(String option) {

        if (!(option.equals("a")) && !(option.equals("b"))) {

            System.out.printf("\n*******************\nIncorrect entry.\n*******************\n");
            System.exit(0);
        }
    }
}

package thedepths;

public class Messages {

    InfoGrabber infoObj = new InfoGrabber();

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

    public void getDeath() {
        System.out.printf("\nYou died. You proved useless, ");
    }

    public void getInspectLightPole() {

        System.out.printf("You slowly creep towards the lightpole. It's wooden and a frail ladder is on its side. You see it has a powerline "
                + "that goes underground. What do you do?\n"
                + "[a] climb the lightpole \n"
                + "[b] stay put \n");

    }

    public void getClimbLightPole() {

        System.out.printf("You climb the light pole. Once at the top, you can see 4 lights in each distance. You also see a figure at the base of the light. "
                + "What do you do? \n"
                + "[a] stay put \n"
                + "[b] climb down \n");

    }

    public void getStayOnLightPole() {

        System.out.printf("You stay and watch the figure. The figure starts climbing the pole. What do you do? \n"
                + "[a] jump off of the light pole \n"
                + "[b] stay on the light pole \n");

    }

    public void getWait() {

        System.out.println("You elect to wait. After a while, nothing happens. What do you do?");

    }

    public void getPowerfulBeing() {
        System.out.println("Oh! Most powerful being! Here's your key!");
    }

    public void getEndMessage() {
        System.out.println("You found a key. You unlock a door that suddenly become visible in front of you. You realize that life has no inherant "
                + "meaning, and that it's merely what you make of it. Have a nice day, folk(s).");
    }

}

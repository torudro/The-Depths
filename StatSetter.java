package thedepths;

public class StatSetter extends InfoGrabber {
    //formula is (weight* height)/(age)

    private final int QUARTILE_1 = 400;
    private final int QUARTILE_2 = 950;
    private final int QUARTILE_3 = 1500;
    private final int TOTAL = (weight * height) / (age);

    private int playerHealth;
    private int playerAttack;

    //getter
    public int getTotal() {
        return TOTAL;
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

    public void StatSetter() {
        //if total is less than or equal to 400, then set
        if (total <= QUARTILE_1) {

            playerHealth = 50;
            playerAttack = 30;

            //if total is above 450 but lessthan/equalto 950, then set
        } else if (total <= QUARTILE_2) {

            playerHealth = 100;
            playerAttack = 50;

            //if total is above 950, but lessthan/equalto 1500
        } else if (total <= QUARTILE_3) {

            playerHealth = 150;
            playerAttack = 90;

        }
        //none for above 1500, because easteregg. if above 1500 then you automatically win and skip the combat

        //gain 20 health if at athetlic peak ages
        if (age > 17 & age < 35) {
            playerHealth += 20;
        }

    }
}

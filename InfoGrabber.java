package thedepths;

//for combat use... customizability
public class InfoGrabber {

    protected int age;
    protected int height;
    protected int weight;

    private String name;

    //setters
    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    void setHeight(int h) {
        height = h;
    }

    void setWeight(int w) {
        weight = w;
    }

    //getter (only 1 because only 1 is needed)
    String getName() {

        return name;
    }

    //prompters
    void promptName() {
        System.out.println("What is your name?");
    }

    void promptAge() {
        System.out.println("What is your age? (years)");
    }

    void promptHeight() {
        System.out.println("What is your height? (inches)");
    }

    void promptWeight() {
        System.out.println("What is your weight? (pounds)");
    }

}

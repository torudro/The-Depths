package thedepths;

//for combat use... customizability
import java.util.Scanner;

public class InfoGrabber {

    Messages msgObj = new Messages();
//variables for storage
    int age;
    int weight;
    int height;
    String name;

    //returns name. getter
    public String getName() {

        return name;

    }

    //prompts info and sets variables to entered values
    public InfoGrabber() {

        Scanner scan = new Scanner(System.in);
        msgObj.promptName();
        name = scan.nextLine();
        msgObj.promptAge();
        age = scan.nextInt();
        msgObj.promptWeight();
        weight = scan.nextInt();
        msgObj.promptHeight();
        height = scan.nextInt();

    }

}

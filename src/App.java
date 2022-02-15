// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ModelData md = new ModelData();

        System.out.println("The highest ratings from Football Players is from " + "\n" + md.findHighestRatings("Football").toString());

        System.out.println("The highest ratings from Soccer Players is from" + "\n" + md.findHighestRatings("Soccer").toString());

        String name = "Ellie Jean";
        if (md.containsName(name)) {
            System.out.println(name + " is in the Players Array List");
        } else {
            System.out.println(name + " is NOT in the Players Array List");
        }

        name = "Joe";
        if (md.containsPartialName(name)) {
            System.out.println(name + " is in the Players Array List");
        } else {
            System.out.println(name + " is NOT in the Players Array List");
        }
        name = "Saq";
        if (md.containsPartialName(name)) {
            System.out.println(name + " is in the Players Array List");
        } else {
            System.out.println(name + " is NOT in the Players Array List");
        }
        System.out.println("================================");
        System.out.println("The highest number of yards from Football Players is from " + "\n" + md.findHighestYards());
        //=========================================
        md.getPlayers().get(0).setGamesPlayed(1);
        md.getPlayers().get(0).getAddress().setPobox(55667);
        System.out.println("=======After data update ===========");
        System.out.println("The highest ratings from Football Players is from " + "\n" + md.findHighestRatings("Football").toString());
    }

}

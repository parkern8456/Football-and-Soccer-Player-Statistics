// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

import java.util.ArrayList;

public class ModelData {

    // Class Attributes
    private ArrayList<Player> players = new ArrayList<Player>();

    public ModelData() {
        LoadPlayers();
    }

    public void LoadPlayers() {
        // Creating ZipCode and Address objects to use
        // for each FootballPlayer object. *They all have the same Zipcode*
        ZipCode zip1 = new ZipCode("16802", "0001");

        // Address to use for each player *They all have the same Address*.
        Address add1 = new Address(201, "Old Main", "Street", zip1, "PA", 0);

        // Creating all of the Football Players.
        FootballPlayer fp0 = new FootballPlayer("Saquon Barkley", add1, 1, "Football", 10, 80, 220);
        FootballPlayer fp1 = new FootballPlayer("John Dunmore", add1, 14, "Football", 7, 120, 100);
        FootballPlayer fp2 = new FootballPlayer("Daniel George", add1, 15, "Football", 5, 10, 70);
        FootballPlayer fp3 = new FootballPlayer("Will Levis", add1, 20, "Football", 11, 30, 250);
        FootballPlayer fp4 = new FootballPlayer("Jaden Dottin", add1, 33, "Football", 14, 100, 100);

        // Creating all of the Soccer Players.
        SoccerPlayer sp0 = new SoccerPlayer("Julia Dohle", add1, 1, "Soccer", 10, 2, 0);
        SoccerPlayer sp1 = new SoccerPlayer("Ellie Jean", add1, 14, "Soccer", 2, 7, 0);
        SoccerPlayer sp2 = new SoccerPlayer("Devon Olive", add1, 15, "Soccer", 5, 3, 3);
        SoccerPlayer sp3 = new SoccerPlayer("Angela Aguero", add1, 20, "Soccer", 11, 7, 5);
        SoccerPlayer sp4 = new SoccerPlayer("Laura Suero", add1, 33, "Soccer", 1, 4, 3);

        // Populating the ArrayList with each Football and Soccer Player object.
        players.add(fp0);
        players.add(fp1);
        players.add(fp2);
        players.add(fp3);
        players.add(fp4);
        players.add(sp0);
        players.add(sp1);
        players.add(sp2);
        players.add(sp3);
        players.add(sp4);
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    public void setPlayers(ArrayList<Player> newPlayers){
        players = newPlayers;
    }
    
    public Player findHighestRatings(String sports) {

        double bestRatings = -1.0;
        int bestRatingsPosition = -1;

        // Traverse the ArrayList to search for highest rating amongst the players.
        // Update bestRatings and bestRatingsPosition with highest ratings
        // to compare to other Players in the ArrayList.
        for (int i = 0; i < players.size(); ++i) {
            if ((players.get(i).getSports().equals(sports)) && (players.get(i).getRatings() > bestRatings)) {
                bestRatingsPosition = i;
                bestRatings = players.get(i).getRatings();
            }
        }

        return players.get(bestRatingsPosition);
    }

    public boolean containsName(String name) {
        for (int i = 0; i < players.size(); ++i) {
            if (players.get(i).getName().equals(name)) {
                // Return true if name is found.
                return true;
            }
        }
        // Return false if player's name was not found in the list.
        return false;
    }

    public boolean containsPartialName(String name) {
        for (int i = 0; i < players.size(); ++i) {
            if (players.get(i).getName().contains(name)) {
                // Return true if partial name is found.
                return true;
            }
        }
        // Return false if player's partial name was not found in the list.
        return false;
    }

    public Player findHighestYards() {

        int highestYards = -1;
        int highestYardsPosition = -1;
        FootballPlayer tempFootballPlayer = new FootballPlayer();

        for (int i = 0; i < players.size(); ++i) {
            // Checking if the current ArrayList node is a FootballPlayer object.
            if (players.get(i) instanceof FootballPlayer) {
                // Storing and casting the Player object as a temp FootballPlayer object.
                tempFootballPlayer = (FootballPlayer) players.get(i);
                // Comparing yards of each FootballPlayer to determine highest yardage player.
                if (tempFootballPlayer.getYards() > highestYards) {
                    highestYards = tempFootballPlayer.getYards();
                    highestYardsPosition = i;
                }
            }
        }

        return players.get(highestYardsPosition);
    }
}

// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

public abstract class Player extends Person {

    // Class attributes.
    private int number;
    private String sports;
    private int gamesPlayed;

    public Player() {
        super();
        setNumber(0);
        setSports("none");
        setGamesPlayed(0);
    }

    public Player(String name, Address address, int numIn, String sportsIn, int gamesPlayedIn) {
        super(name, address);
        setNumber(numIn);
        setSports(sportsIn);
        setGamesPlayed(gamesPlayedIn);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlayer{Number=" + number + ", Sports=" + sports + ", Games Played=" + gamesPlayed + "}";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public abstract double getRatings();
}
